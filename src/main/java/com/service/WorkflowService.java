package com.service;

import com.model.AccessAudit;
import com.model.WorkflowInstance;
import org.springframework.stereotype.Service;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/10/23 15:06
 * UpdateTime 2017/10/23 15:06
 */
public interface WorkflowService {

    AccessAudit getAccessAudit(WorkflowInstance workflowInstance);
}
