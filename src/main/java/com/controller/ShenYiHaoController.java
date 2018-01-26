package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.util.Enum.ResponseResultEnum;
import com.util.HttpConnectionUtils;
import com.util.ResultBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Desciption 深一号决策流调用
 * Create By  li.bo
 * CreateTime 2018/01/26 18:14
 * UpdateTime 2018/01/26 18:14
 */
@RestController
public class ShenYiHaoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${flow.shenyihao}")
    private String api_url;

    @RequestMapping(value = "/syh", method = RequestMethod.POST)
    public ResultBody<? extends Object> getDetail(HttpServletRequest request, HttpServletResponse response) {

        // 跨域请求处理
        response.addHeader("Access-Control-Allow-Origin", "*");

        /* 入参 **/
        JSONObject obj = new JSONObject();
        // 决策流必传参数
        obj.put("frms_flow_id", UUID.randomUUID());
        obj.put("frms_customer_id", "homefax");
        obj.put("frms_user_id", "syh");
        obj.put("frms_biz_code", "PAY.REG");

        // 决策流业务参数
        // 经营风险A
        obj.put("frms_payback_decrease_rate", 60);
        obj.put("frms_lastY_amount_decrease_rate", 60);
        obj.put("frms_lastM_decrease_rate", 60);
        obj.put("frms_payback_amount", 100);
        obj.put("frms_lastS_amount_decrease_rate", 30);
        // 经营风险B
        obj.put("frms_last3M_avg_payback_amount", 400);
        obj.put("frms_3M_payback_amount", 1200);
        obj.put("frms_3M_amount_decrease_rate", 20);
        obj.put("frms_last3M_avg_amount", 400);
        // 财务风险A
        obj.put("frms_net_asset_month_decrease_rate", 25);
        obj.put("frms_company_debt_rate", 60);
        obj.put("frms_company_gross_margin", 15);
        obj.put("frms_company_net_profit_rate", 3);
        obj.put("frms_receivables_turnover_days", 90);
        obj.put("frms_stock_turnover_days", 100);
        obj.put("frms_main_business_amount_mount_decrease_rate", 50);

        obj.put("frms_last_month_result_a", 0);// 上月未通过
        // 财务风险B
        obj.put("frms_net_asset_year_decrease_rate", 30);
        obj.put("frms_company_debt_rate", 80);
        obj.put("frms_quick_rate", 0.2*100);
        obj.put("frms_liquidity_rate", 0.4*100);
        obj.put("frms_main_business_amount_season_decrease_rate", 60);
        obj.put("frms_season_net_profit_amount", 0);
        obj.put("frms_is_loss", 1);

        obj.put("frms_last_month_result_b", 0);// 上月未通过
        // 法律信用风险
        obj.put("frms_lawsuit_net_asset_rate", 40);
        obj.put("frms_is_overdue", 1);
        // 其他风险
        obj.put("frms_is_reject", 1);

        // 转发请求到服务端
        String result = HttpConnectionUtils.setConnection(this.api_url, obj);
        JSONObject resultObj = JSONObject.parseObject(result);
        logger.info("返回结果： " + resultObj.toString());

        try {
            // 触发规则
            JSONArray ruleArray = Optional.ofNullable(resultObj)
                    .map(a -> a.getBoolean("success") ? a.getJSONObject("data").getJSONArray("nodeResults") : null)
                    .get();
            List<JSONObject> rules = new ArrayList<>();
            ruleArray.forEach(a -> {
                JSONArray risks = JSON.parseObject(a.toString()).getJSONObject("result").getJSONArray("risks");
                String taskName = JSON.parseObject(a.toString()).getString("taskName");
                risks.forEach(risk -> {
                    JSONObject r = JSON.parseObject(risk.toString());
                    String tmp = r.getString("ruleName");
                    JSONObject rule = new JSONObject();
                    rule.put("taskName", taskName);
                    rule.put("ruleCode", tmp.substring(tmp.indexOf(":")+1, tmp.lastIndexOf(":")));
                    rule.put("ruleName",tmp.substring(tmp.lastIndexOf(":")+1, tmp.length()));

                    rules.add(rule);
                });
            });
            logger.info("rules:{}", rules);

            // 风控结果
            JSONObject res = Optional.ofNullable(resultObj)
                    .map(a -> a.getJSONObject("data").getJSONArray("nodeResults"))
                    .map(a -> a.get(a.size() - 1).toString())
                    .map(a -> JSON.parseObject(a).getJSONObject("result").getJSONArray("items"))
                    .map(a -> a.get(a.size() -1).toString())
                    .map(JSON::parseObject)
                    .get();
            return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), res);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBody(ResponseResultEnum.RETRY.getFeatureType(), ResponseResultEnum.RETRY.getDescription(), "");
        }

//        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), resultObj.getJSONObject("data"));
    }
}