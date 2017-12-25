package com.service;

import com.model.WorkflowInstance;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/10/22 16:40
 * UpdateTime 2017/10/22 16:40
 */
public interface WorkflowInstanceService {
    public WorkflowInstance findOneById(String id);
}
