package com.dao;

import com.model.Persons;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/8/31 14:48
 * UpdateTime 2017/8/31 14:48
 */
public interface PersonsDao {

    List<Persons> findSex();
}
