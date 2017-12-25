package com.service.impl;

import com.dao.WorkflowDataLogDao;
import com.model.WorkflowDataLog;
import com.service.WorkflowDataLogService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/10/23 13:43
 * UpdateTime 2017/10/23 13:43
 */
@Service("workflowDataLogService")
public class WorkflowDataLogServiceImpl implements WorkflowDataLogService {

    @Autowired
    private WorkflowDataLogDao workflowDataLogDao;

    /**
     * 根据流程id获取流程详情
     * @param flowId
     * @return
     */
    @Override
    public List<WorkflowDataLog> getWorkflowDataLogsByFlowId(String flowId) {

        List<WorkflowDataLog> workflowDataLogs = Lists.newArrayList();
        try {
            workflowDataLogs = workflowDataLogDao.getWorkflowDataLogsByFlowId(flowId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return workflowDataLogs;
    }
}
