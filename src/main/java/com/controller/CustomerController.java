package com.controller;

import com.model.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/7/26 17:00
 * UpdateTime 2017/7/26 17:00
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/one")
    public void getOne() {
        Customer customer = customerService.findCustomerByUserId("1101");
        System.out.println(customer.toString());
    }
}