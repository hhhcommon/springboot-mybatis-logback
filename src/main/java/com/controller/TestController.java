package com.controller;

import com.model.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/7/26 17:00
 * UpdateTime 2017/7/26 17:00
 */
public class TestController {

    @Autowired
    CustomerService customerService;

    public void test(){
        Customer customer = customerService.findCustomerByUserId("1101");
        System.out.println(customer.toString());
    }

    public static void main(String[] args){
        TestController t = new TestController();
        t.test();
    }
}