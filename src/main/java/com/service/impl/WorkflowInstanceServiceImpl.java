package com.service.impl;

import com.dao.WorkflowInstanceDao;
import com.model.WorkflowInstance;
import com.service.WorkflowInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/10/22 16:41
 * UpdateTime 2017/10/22 16:41
 */
@Service("workflowInstanceService")
public class WorkflowInstanceServiceImpl implements WorkflowInstanceService {

    @Autowired
    WorkflowInstanceDao workflowInstanceDao;

    @Override
    public WorkflowInstance findOneById(String id) {
        WorkflowInstance workflowInstance = new WorkflowInstance();
        try {
            workflowInstance = workflowInstanceDao.findOneById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return workflowInstance;
    }
}
