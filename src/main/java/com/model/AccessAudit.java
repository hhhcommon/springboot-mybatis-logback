package com.model;

import cn.com.bsfit.frms.obj.*;

/**
 * @author panfz
 * @date 2017/10/18
 */
public class AccessAudit {

    /**
     * 唯一编号
     */
    private String id;
    /**
     * 用户号
     */
    private String userId;
    /**
     * 电话号码
     */
    private String phoneNo;
    /**
     * 入参
     */
    private GroupObject groupObject;
    /**
     * 强规则数量
     */
    private Integer strongRuleCnt;
    /**
     * 强规则明细
     */
    private AuditResult strongAuditResult;
    /**
     * 中规则数量
     */
    private Integer middleRuleCnt;
    /**
     * 中规则明细
     */
    private AuditResult middleAuditResult;
    /**
     * 弱规则数量
     */
    private Integer weakRuleCnt;
    /**
     * 弱规则明细
     */
    private AuditResult weakAuditResult;
//    /**
//     * 评分卡分值
//     */
//    private Double creditScore;
    /**
     * 评分卡明细
     */
    private CreditResult creditResult;
    /**
     * 准入结果
     */
    private String accessResult;

    /**
     * 准入策略结果
     */
    private GroupPolicy groupPolicy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public GroupObject getGroupObject() {
        return groupObject;
    }

    public void setGroupObject(GroupObject groupObject) {
        this.groupObject = groupObject;
    }

        public Integer getStrongRuleCnt() {
        return strongRuleCnt;
    }

    public void setStrongRuleCnt(Integer strongRuleCnt) {
        this.strongRuleCnt = strongRuleCnt;
    }

    public AuditResult getStrongAuditResult() {
        return strongAuditResult;
    }

    public void setStrongAuditResult(AuditResult strongAuditResult) {
        this.strongAuditResult = strongAuditResult;
    }

    public Integer getMiddleRuleCnt() {
        return middleRuleCnt;
    }

    public void setMiddleRuleCnt(Integer middleRuleCnt) {
        this.middleRuleCnt = middleRuleCnt;
    }

    public AuditResult getMiddleAuditResult() {
        return middleAuditResult;
    }

    public void setMiddleAuditResult(AuditResult middleAuditResult) {
        this.middleAuditResult = middleAuditResult;
    }

    public Integer getWeakRuleCnt() {
        return weakRuleCnt;
    }

    public void setWeakRuleCnt(Integer weakRuleCnt) {
        this.weakRuleCnt = weakRuleCnt;
    }

    public AuditResult getWeakAuditResult() {
        return weakAuditResult;
    }

    public void setWeakAuditResult(AuditResult weakAuditResult) {
        this.weakAuditResult = weakAuditResult;
    }

//    public Double getCreditScore() {
//        return creditScore;
//    }
//
//    public void setCreditScore(Double creditScore) {
//        this.creditScore = creditScore;
//    }

    public CreditResult getCreditResult() {
        return creditResult;
    }

    public void setCreditResult(CreditResult creditResult) {
        this.creditResult = creditResult;
    }

    public String getAccessResult() {
        return accessResult;
    }

    public void setAccessResult(String accessResult) {
        this.accessResult = accessResult;
    }

    public GroupPolicy getGroupPolicy() {
        return groupPolicy;
    }

    public void setGroupPolicy(GroupPolicy groupPolicy) {
        this.groupPolicy = groupPolicy;
    }

    @Override
    public String toString() {
        return "AccessAudit{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", groupObject=" + groupObject +
                ", strongRuleCnt=" + strongRuleCnt +
                ", strongAuditResult=" + strongAuditResult +
                ", middleRuleCnt=" + middleRuleCnt +
                ", middleAuditResult=" + middleAuditResult +
                ", weakRuleCnt=" + weakRuleCnt +
                ", weakAuditResult=" + weakAuditResult +
                ", creditResult=" + creditResult +
                ", accessResult='" + accessResult + '\'' +
                ", groupPolicy=" + groupPolicy +
                '}';
    }
}
