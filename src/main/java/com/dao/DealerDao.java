package com.dao;

import com.model.Dealer;

import java.util.List;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/12/24 15:18
 * UpdateTime 2017/12/24 15:18
 */
public interface DealerDao {

    List<Dealer> findAll() throws Exception;

    List<Dealer> findAllShop() throws Exception;
}
