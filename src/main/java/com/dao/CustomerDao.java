package com.dao;


import com.model.Customer;
import org.apache.ibatis.annotations.Param;

/**
 * Created by lenovo on 2017/5/18.
 */
public interface CustomerDao {
    public Customer findCustomerByUserId(@Param("userId") String userId) throws Exception;
}
