/* ---------------------------------------------------------------------------------------------------
 * Copyright (C) 2014-2015 homefax.com.cn
 *
 * Title:        Customer.java
 * Description:       实体Customer类定义
 *
 * Dependencies:
 * 
 * History:
 *     Date                   Modifier              Log
 *     2017-05-12             homefax auto             Created
 *
 * ---------------------------------------------------------------------------------------------------
 */
package com.model;

import java.io.Serializable;

import java.util.Date;

public class Customer implements Serializable {

	/**
	 * SVU
	 */
	private static final long serialVersionUID = 1L;

	/** CUSTOMER_ID */
	private String customerId;

	/** USER_ID */
	private String userId;

	/** 姓名 */
	private String userName;

	/** 手机号 */
	private String celphone;

	/** 身份证号 */
	private String idNum;

	/** 生日 */
	private Date birthday;

	/** 市 */
	private String city;

	/** 预授信结果 */
	private String preCreditResult;

	/** 预授信评分 */
	private String preCreditScore;

	/** 预授信风险等级 */
	private String preCreditGrade;

	/** 预授信额度 */
	private String preCreditQuota;

	/** 创建时间 */
	private Date createTime;

	/** 更新时间 */
	private Date updateTime;

	/** 创建用户 */
	private String createUserId;

	/** 更新用户 */
	private String updateUserId;

	public Customer() {

	}

	/** 获取CUSTOMER_ID */
	public String getCustomerId() {
		return customerId;
	}

	/** 设置CUSTOMER_ID */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/** 获取USER_ID */
	public String getUserId() {
		return userId;
	}

	/** 设置USER_ID */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/** 获取姓名 */
	public String getUserName() {
		return userName;
	}

	/** 设置姓名 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/** 获取手机号 */
	public String getCelphone() {
		return celphone;
	}

	/** 设置手机号 */
	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}

	/** 获取身份证号 */
	public String getIdNum() {
		return idNum;
	}

	/** 设置身份证号 */
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	/** 获取生日 */
	public Date getBirthday() {
		return birthday;
	}

	/** 设置生日 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/** 获取市 */
	public String getCity() {
		return city;
	}

	/** 设置市 */
	public void setCity(String city) {
		this.city = city;
	}

	/** 获取预授信结果 */
	public String getPreCreditResult() {
		return preCreditResult;
	}

	/** 设置预授信结果 */
	public void setPreCreditResult(String preCreditResult) {
		this.preCreditResult = preCreditResult;
	}

	/** 获取预授信评分 */
	public String getPreCreditScore() {
		return preCreditScore;
	}

	/** 设置预授信评分 */
	public void setPreCreditScore(String preCreditScore) {
		this.preCreditScore = preCreditScore;
	}

	/** 获取预授信风险等级 */
	public String getPreCreditGrade() {
		return preCreditGrade;
	}

	/** 设置预授信风险等级 */
	public void setPreCreditGrade(String preCreditGrade) {
		this.preCreditGrade = preCreditGrade;
	}

	/** 获取预授信额度 */
	public String getPreCreditQuota() {
		return preCreditQuota;
	}

	/** 设置预授信额度 */
	public void setPreCreditQuota(String preCreditQuota) {
		this.preCreditQuota = preCreditQuota;
	}

	/** 获取创建时间 */
	public Date getCreateTime() {
		return createTime;
	}

	/** 设置创建时间 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/** 获取更新时间 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/** 设置更新时间 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/** 获取创建用户 */
	public String getCreateUserId() {
		return createUserId;
	}

	/** 设置创建用户 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	/** 获取更新用户 */
	public String getUpdateUserId() {
		return updateUserId;
	}

	/** 设置更新用户 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String toString() {
		return "Customer [" + ", customerId=" + customerId + ", userId=" + userId + ", userName=" + userName
				+ ", celphone=" + celphone + ", idNum=" + idNum + ", birthday=" + birthday + ", city=" + city
				+ ", preCreditResult=" + preCreditResult + ", preCreditScore=" + preCreditScore + ", preCreditGrade="
				+ preCreditGrade + ", preCreditQuota=" + preCreditQuota + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", createUserId=" + createUserId + ", updateUserId=" + updateUserId + "]";
	}

}
