package com.controller;

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

    @RequestMapping(value = "/dealer", method = RequestMethod.GET)
    public ResultBody<? extends Object> getDetail(HttpServletRequest request, HttpServletResponse response) {

        JSONObject result = dealerService.getAllDealer();
        logger.info(result.toString());

        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), result);
    }

    @RequestMapping(value = "/dealer/province", method = RequestMethod.GET)
    public ResultBody<? extends Object> getDetailByProvince(HttpServletRequest request, HttpServletResponse response) {

        JSONObject result = dealerService.getDealerShopByProvince();
        logger.info(result.toString());

        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), result);
    }

    @RequestMapping(value = "/dealer/city", method = RequestMethod.GET)
    public ResultBody<? extends Object> getDetailByCity(HttpServletRequest request, HttpServletResponse response) {

        JSONObject result = dealerService.getDealerShopByCity();
        logger.info(result.toString());

        return new ResultBody(ResponseResultEnum.SUCCESS.getFeatureType(), ResponseResultEnum.SUCCESS.getDescription(), result);
    }
}
