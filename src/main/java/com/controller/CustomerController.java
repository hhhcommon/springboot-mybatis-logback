package com.controller;

import com.model.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/7/26 17:00
 * UpdateTime 2017/7/26 17:00
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public String getOne(Model model) {
        Customer customer = customerService.findCustomerByUserId("1101");
        model.addAttribute("customer", customer);
        System.out.println(customer.toString());

        return "customer";
    }
}