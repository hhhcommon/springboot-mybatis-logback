package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.model.Dealer;
import com.service.DealerService;
import com.util.Enum.ResponseResultEnum;
import com.util.ResultBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Desciption 经销商
 * Create By  li.bo
 * CreateTime 2017/10/23 15:21
 * UpdateTime 2017/10/23 15:21
 */
@RestController
public class DealerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DealerService dealerService;

    /**
     * 地图-经销商全国分布
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/dealer", method = RequestMethod.GET)
    public ResultBody<? extends Object> getDetail(HttpServletRequest request, HttpServletResponse response) {
        // 跨域请求处理
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, HEAD, PATCH, TRACE, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
        response.setHeader("Content-type", "text/html;charset=UTF-8");

        JSONObject result = dealerService.getAllDealer();
        logger.info(result.toString());

        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), result);
    }

    /**
     * 柱状图-经销商省份分布列表
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/dealer/province", method = RequestMethod.GET)
    public ResultBody<? extends Object> getDetailByProvince(HttpServletRequest request, HttpServletResponse response) {
        // 跨域请求处理
        response.addHeader("Access-Control-Allow-Origin", "*");

        JSONObject result = dealerService.getDealerShopByProvince();
        logger.info(result.toString());

        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), result);
    }

    /**
     * 柱状图-经销商城市分布列表
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/dealer/city", method = RequestMethod.GET)
    public ResultBody<? extends Object> getDetailByCity(HttpServletRequest request, HttpServletResponse response) {
        // 跨域请求处理
        response.addHeader("Access-Control-Allow-Origin", "*");

        JSONObject result = dealerService.getDealerShopByCity();
        logger.info(result.toString());

        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), result);
    }

    /**
     * 折线图-每月经销商的销售总金额
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/dealer/monthAmount", method = RequestMethod.GET)
    public ResultBody<? extends Object> getAmountByYearAndMonth(HttpServletRequest request, HttpServletResponse response) {
        // 跨域请求处理
        response.addHeader("Access-Control-Allow-Origin", "*");

        JSONArray result = dealerService.getAmountByYearAndMonth();
        logger.info(result.toString());

        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), result);
    }
}
