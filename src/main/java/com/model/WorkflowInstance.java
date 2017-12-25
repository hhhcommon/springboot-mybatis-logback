package com.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Desciption 流程实例
 * Create By  li.bo
 * CreateTime 2017/10/22 15:59
 * UpdateTime 2017/10/22 15:59
 */
public class WorkflowInstance implements Serializable {

    private static final long serialVersionUID = 1L;

    /**唯一标识，主键*/
    private String id;

    /**流水号(由业务系统传递)*/
    private String flowId;

    /**客户号*/
    private String cusId;

    /**订单号*/
    private String orderId;

    /**用户号*/
    private String userId;

    /**手机号*/
    private String phone;

    /**流程ID（此实例运行版本的流程编号）*/
    private String processId;

    /**流程ProcessKey*/
    private String processKey;

    /**流程名称*/
    private String processName;

    /**流程实例ID*/
    private String instanceId;

    /**当前节点名称*/
    private String taskName;

    /**修改时间*/
    private Date updateTime;

    /**创建时间*/
    private Date createTime;

    /**流程调用方式（1-同步，2-异步）*/
    private int callType;

    /**状态(1-运行中，2-异常结束，3-异常，9-正常结束)*/
    private int status;

    /**状态信息*/
    private String statusMsg;

    /**回调次数*/
    private int callbackTimes;

    /**回调状态(1-成功，0-失败)*/
    private int callbackStatus;

    /**探头参数*/
    private String auditParam;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getProcessKey() {
        return processKey;
    }

    public void setProcessKey(String processKey) {
        this.processKey = processKey;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCallType() {
        return callType;
    }

    public void setCallType(int callType) {
        this.callType = callType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public int getCallbackTimes() {
        return callbackTimes;
    }

    public void setCallbackTimes(int callbackTimes) {
        this.callbackTimes = callbackTimes;
    }

    public int getCallbackStatus() {
        return callbackStatus;
    }

    public void setCallbackStatus(int callbackStatus) {
        this.callbackStatus = callbackStatus;
    }

    public String getAuditParam() {
        return auditParam;
    }

    public void setAuditParam(String auditParam) {
        this.auditParam = auditParam;
    }

    @Override
    public String toString() {
        return "WorkflowInstance{" +
                "id='" + id + '\'' +
                ", flowId='" + flowId + '\'' +
                ", cusId='" + cusId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", phone='" + phone + '\'' +
                ", processId='" + processId + '\'' +
                ", processKey='" + processKey + '\'' +
                ", processName='" + processName + '\'' +
                ", instanceId='" + instanceId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", callType=" + callType +
                ", status=" + status +
                ", statusMsg='" + statusMsg + '\'' +
                ", callbackTimes=" + callbackTimes +
                ", callbackStatus=" + callbackStatus +
                ", auditParam='" + auditParam + '\'' +
                '}';
    }
}
