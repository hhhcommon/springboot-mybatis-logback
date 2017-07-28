package com.service.impl;

import com.dao.CustomerDao;
import com.model.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/5/17.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    /**
     * 根据userId获得Customer对象
     * @param userId
     * @return
     */
    @Override
    public Customer findCustomerByUserId(String userId){

        Customer customer = new Customer();
        try{
            customer = customerDao.findCustomerByUserId(userId);
        } catch (Exception e){
            e.printStackTrace();
        }
        return customer;
    }
}
