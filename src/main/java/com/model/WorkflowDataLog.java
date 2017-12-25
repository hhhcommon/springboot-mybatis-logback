package com.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Desciption 决策流节点详情
 * Create By  li.bo
 * CreateTime 2017/10/22 15:58
 * UpdateTime 2017/10/22 15:58
 */
public class WorkflowDataLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**ID*/
    private String id;

    /**流程主键（对应workflow_instance表ID）*/
    private String wInsId;

    /**执行顺序*/
    private int exeIndex;

    /**任务节点ID*/
    private String taskId;

    /**任务节点名称*/
    private String taskName;

    /**数据类型（1-输入参数，2-输出参数）*/
    private int dataType;

    /**输入、输出数据JSON*/
    private String jsonData;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWInsId() {
        return wInsId;
    }

    public void setWInsId(String wInsId) {
        this.wInsId = wInsId;
    }

    public int getExeIndex() {
        return exeIndex;
    }

    public void setExeIndex(int exeIndex) {
        this.exeIndex = exeIndex;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WorkflowDataLog{" +
                "id='" + id + '\'' +
                ", wInsId='" + wInsId + '\'' +
                ", exeIndex=" + exeIndex +
                ", taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", dataType=" + dataType +
                ", jsonData='" + jsonData + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
