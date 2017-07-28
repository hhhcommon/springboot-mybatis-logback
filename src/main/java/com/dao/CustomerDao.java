package com.dao;


import com.model.Customer;

/**
 * Created by lenovo on 2017/5/18.
 */
public interface CustomerDao {
    public Customer findCustomerByUserId(String userId) throws Exception;
}
