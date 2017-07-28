package com.service;

import com.model.Customer;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/7/26 16:58
 * UpdateTime 2017/7/26 16:58
 */
public interface CustomerService {
    public Customer findCustomerByUserId(String userId);
}
