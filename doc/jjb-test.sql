/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : jjb-test

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-07-28 14:43:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `CUSTOMER_ID` varchar(32) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `USER_NAME` varchar(100) DEFAULT NULL COMMENT '姓名',
  `CELPHONE` varchar(11) DEFAULT NULL COMMENT '手机号',
  `ID_NUM` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `BIRTHDAY` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
  `CITY` varchar(100) DEFAULT NULL COMMENT '市',
  `PRE_CREDIT_RESULT` varchar(100) DEFAULT NULL COMMENT '预授信结果',
  `PRE_CREDIT_SCORE` varchar(100) DEFAULT NULL COMMENT '预授信评分',
  `PRE_CREDIT_GRADE` varchar(100) DEFAULT NULL COMMENT '预授信风险等级',
  `PRE_CREDIT_QUOTA` varchar(100) DEFAULT NULL COMMENT '预授信额度',
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(32) DEFAULT NULL,
  `UPDATE_USER_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('9f63ec0444704cb0aff3baebddeed3c1', '1101', 'patrick', '13476026420', 'test', '1992-01-17 14:53:28', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for customer_base_certific
-- ----------------------------
DROP TABLE IF EXISTS `customer_base_certific`;
CREATE TABLE `customer_base_certific` (
  `ID` varchar(40) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `IDENTITY_A` longtext COMMENT '申请人身份证(正面)',
  `IDENTITY_B` longtext COMMENT '申请人身份证(背面)',
  `IDENTITY_A_SPOUSE` longtext COMMENT '配偶身份证(正面)',
  `IDENTITY_B_SPOUSE` longtext COMMENT '配偶身份证(背面)',
  `OTHER` longtext COMMENT '其他',
  `HEAD_PORTRAIT` longtext COMMENT '头像',
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(32) DEFAULT NULL,
  `UPDATE_USER_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_base_certific
-- ----------------------------
INSERT INTO `customer_base_certific` VALUES ('11011', '1101', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1494405730555&di=6b90477ed818604bdeceba7cf0a9041e&imgtype=0&src=http%3A%2F%2Fwww.twwtn.com%2FUpload%2F16%2F4%2F25131300508.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1494405730555&di=77f45dd093ed4e0f84f567c947736b9c&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01d1f25734a6586ac72580edc2d8f9.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1494405730555&di=eb8d8df16069e4550792b1bae9b84bae&imgtype=0&src=http%3A%2F%2Fimg01.taopic.com%2F161227%2F240366-16122FT53785.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1494405730555&di=ddf0a848d2b395cd85fbafb499909e02&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fa044ad345982b2b781ae12c531adcbef76099bf9.jpg', 'test', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1494405730554&di=12c2fe720168383464413dcd604ac2a4&imgtype=0&src=http%3A%2F%2Fnews.mydrivers.com%2Fimg%2F20090324%2F01521278.jpg', '2017-05-10 13:55:31', null, null, null);

-- ----------------------------
-- Table structure for customer_base_contact
-- ----------------------------
DROP TABLE IF EXISTS `customer_base_contact`;
CREATE TABLE `customer_base_contact` (
  `ID` varchar(40) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `CONTACT_NAME` varchar(100) DEFAULT NULL COMMENT '姓名',
  `CELPHONE` varchar(11) DEFAULT NULL COMMENT '手机号',
  `RELATIONSHIP` char(1) DEFAULT NULL COMMENT '关系',
  `CONTACT_COMPANY` varchar(255) DEFAULT NULL COMMENT '联系人公司',
  `SORT_IDX` int(4) DEFAULT NULL COMMENT '联系人序列',
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(32) DEFAULT NULL,
  `UPDATE_USER_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_base_contact
-- ----------------------------
INSERT INTO `customer_base_contact` VALUES ('', '1102', 'test', '41241242', '1', 'TX', null, null, null, null, null);
INSERT INTO `customer_base_contact` VALUES ('1', '1101', 'peter', '13411111111', '0', 'AL', null, null, null, null, null);
INSERT INTO `customer_base_contact` VALUES ('123bc11f3b9b4516a165188a4d1cf157', '1101', '法师法师', '发发', '0', '发送到', null, null, null, null, null);
INSERT INTO `customer_base_contact` VALUES ('2', '1101', 'jane', '13422222222', '1', 'BD', null, null, null, null, null);
INSERT INTO `customer_base_contact` VALUES ('3', '1101', 'john', '13433333333', '1', 'XC', null, null, null, null, null);
INSERT INTO `customer_base_contact` VALUES ('3146fcd2f8904fdcb24c464e907b8459', '1101', '法师法师', '发发', '0', '发送到', null, null, null, null, null);
INSERT INTO `customer_base_contact` VALUES ('34acd87545ce49d7adc9b17533979e67', '1101', '法师法师法师', '发', '', '发送', null, null, null, null, null);
INSERT INTO `customer_base_contact` VALUES ('fd654a1173424631807edaa6b055a461', '1101', '法师法师1111', '发送', '0', '发啊啊', null, null, null, null, null);

-- ----------------------------
-- Table structure for customer_base_info
-- ----------------------------
DROP TABLE IF EXISTS `customer_base_info`;
CREATE TABLE `customer_base_info` (
  `ID` varchar(40) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `USER_NAME` varchar(100) DEFAULT NULL COMMENT '姓名',
  `SEX` char(1) DEFAULT NULL COMMENT '性别 【0女 1男】',
  `CELPHONE` varchar(11) DEFAULT NULL COMMENT '手机号',
  `ID_CARD_TYPE` char(1) DEFAULT NULL COMMENT '证件类型',
  `ID_NUM` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `EXPIRE_DATE` datetime DEFAULT NULL COMMENT '身份证有效期',
  `EMAIL` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `MARRIAGE_STATUS` char(1) DEFAULT NULL COMMENT '婚姻状况【0未婚 1已婚 2离异 9其他】',
  `MATE_NAME` varchar(255) DEFAULT NULL COMMENT '配偶姓名',
  `MATE_ID_NUM` varchar(20) DEFAULT NULL COMMENT '配偶证件号',
  `HOME_ADDRESS` varchar(255) DEFAULT NULL COMMENT '家庭地址',
  `HOME_ADDRESS_DETAIL` varchar(255) DEFAULT NULL COMMENT '家庭详细地址',
  `HOME_NUMBER` varchar(20) DEFAULT NULL COMMENT '家庭电话',
  `JOB_TYPE` char(1) DEFAULT NULL COMMENT '职业',
  `COMPANY_TYPE` char(1) DEFAULT NULL COMMENT '单位性质',
  `COMPANY_NAME` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `COMPANY_ADDRESS` varchar(255) DEFAULT NULL COMMENT '单位地址',
  `COMPANY_ADDRESS_DETAIL` varchar(255) DEFAULT NULL COMMENT '单位详细地址',
  `JOB_POST` varchar(100) DEFAULT NULL COMMENT '职务',
  `YEAR_SAL` char(1) DEFAULT NULL COMMENT '年收入',
  `EDUCATION_DEGREE` char(1) DEFAULT NULL COMMENT '最高学历【0初中或以下 1高中/中专 2大专 3本科 4硕士或以上】',
  `HOUSING_FUND` char(1) DEFAULT NULL COMMENT '月缴纳公积金【0：无 1：1000以下 2：1000-2000 3：2000-3000 4：3000-4000 5：4000-5000 6：5000以上】',
  `SOCIAL_INSURANCE_FLG` char(1) DEFAULT NULL COMMENT '是否缴纳社保',
  `SOCIAL_INSURANCE` char(1) DEFAULT NULL COMMENT '月缴纳社保【0：无 1：1000以下 2：1000-2000 3：2000-3000 4：3000-4000 5：4000-5000 6：5000以上】',
  `SAL_BANK` varchar(100) DEFAULT NULL COMMENT '代发工资银行',
  `FIN_MGM_AGENCY` varchar(100) DEFAULT NULL COMMENT '财务管理机构',
  `CHECK_STATUS` char(1) DEFAULT NULL COMMENT '核真状态【0未核真 1已核真】',
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(32) DEFAULT NULL,
  `UPDATE_USER_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_base_info
-- ----------------------------
INSERT INTO `customer_base_info` VALUES ('a024d18f1ab2452685058ff344ffa9dd', '1101', 'patrick', '1', '13476026420', '0', '429006199201174812', '2019-05-12 13:29:34', 'li.bo3dd22@chinaredstar.com', '1', 'testaa', 'testIDaa', '212', 'shanghai', '110faffsdaf', '1', '1', 'redstar', 'shanghai', 'putuo', '1', '0', '3', '1', '1', '0', 'ICBC', '工商银行,农业银行', '1', '2017-05-12 13:32:38', '2017-05-17 05:13:45', null, null);

-- ----------------------------
-- Table structure for customer_credit_line
-- ----------------------------
DROP TABLE IF EXISTS `customer_credit_line`;
CREATE TABLE `customer_credit_line` (
  `ID` varchar(40) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `CREDIT_LINE` decimal(22,2) DEFAULT NULL COMMENT '借款额度',
  `CREDIT_LINE_USED` decimal(22,2) DEFAULT NULL COMMENT '使用的额度',
  `CREDIT_EXPIRED` datetime DEFAULT NULL COMMENT '额度有效期',
  `LOAN_CNT` int(4) DEFAULT NULL COMMENT '借款笔数',
  `LOAN_AMT_TOTAL` decimal(22,2) DEFAULT NULL COMMENT '累积借款额',
  `LOAN_AMT_CURRENT` decimal(22,2) DEFAULT NULL COMMENT '当前借款额',
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(32) DEFAULT NULL,
  `UPDATE_USER_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_credit_line
-- ----------------------------
INSERT INTO `customer_credit_line` VALUES ('11010', '1101', '100000.00', '50000.00', '2018-05-08 14:28:07', '1', '800000.00', '50000.00', null, null, null, null);

-- ----------------------------
-- Table structure for customer_credit_line_log
-- ----------------------------
DROP TABLE IF EXISTS `customer_credit_line_log`;
CREATE TABLE `customer_credit_line_log` (
  `ID` varchar(40) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `CREDIT_LINE_AFTER` decimal(22,2) DEFAULT NULL COMMENT '变更后借款额度',
  `CREDIT_EXPIRED_AFTER` datetime DEFAULT NULL COMMENT '变更后额度有效期',
  `CREDIT_LINE_BEFORE` decimal(22,2) DEFAULT NULL COMMENT '变更前借款额度',
  `CREDIT_EXPIRED_BEFORE` datetime DEFAULT NULL COMMENT '变更前额度有效期',
  `RECORD_TYPE` char(1) DEFAULT NULL COMMENT '变更类型',
  `REASON` varchar(500) DEFAULT NULL COMMENT '原因',
  `CREATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_credit_line_log
-- ----------------------------

-- ----------------------------
-- Table structure for customer_housing_info
-- ----------------------------
DROP TABLE IF EXISTS `customer_housing_info`;
CREATE TABLE `customer_housing_info` (
  `ID` varchar(40) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `HOUSING_STATUS` char(1) DEFAULT NULL COMMENT '房产情况',
  `HOUSING_ADDRESS` varchar(255) DEFAULT NULL COMMENT '房产地址',
  `HOUSING_ADDRESS_DETAIL` varchar(255) DEFAULT NULL COMMENT '房产详细地址',
  `MONTHLY_FUND_COST` char(1) DEFAULT NULL COMMENT '按揭月缴金额',
  `FUND_REPAY` char(1) DEFAULT NULL COMMENT '已还月供',
  `FUND_BANK` varchar(100) DEFAULT NULL COMMENT '按揭银行',
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER_ID` varchar(32) DEFAULT NULL,
  `UPDATE_USER_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_housing_info
-- ----------------------------
INSERT INTO `customer_housing_info` VALUES ('0fd511e063e34a6d94e8c5e79b2adac4', '1101', '1', '212', '哈哈哈哈哈哈', '2', '1', null, '2017-05-16 15:18:15', null, null, null);
INSERT INTO `customer_housing_info` VALUES ('52acd842d3e44d65851d7905135e39fa', '1101', '1', '222', '测试3', '1', '0', null, '2017-05-17 10:52:29', null, null, null);
INSERT INTO `customer_housing_info` VALUES ('912f954c6662481fade5ee7c3708cacd', '1101', '0', '122', '测试1', null, null, null, '2017-05-17 10:50:02', null, null, null);
INSERT INTO `customer_housing_info` VALUES ('9d030a67a06648d99b5d1dd47bb989e4', '1101', '0', '111', '测试2', null, null, null, '2017-05-17 10:52:03', null, null, null);

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `menu1` varchar(255) DEFAULT NULL,
  `menu2` varchar(255) DEFAULT NULL,
  `descritpion` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', 'ROLE_ADMIN1', 'sy', 'sy', '', '/', null);
INSERT INTO `sys_permission` VALUES ('3', 'ROLE_ADMIN2', 'khgl', 'khgl', '', '/ywcx/**', null);
INSERT INTO `sys_permission` VALUES ('4', 'ROLE_ADMIN3', 'jddz', 'yhhz', null, '/error', null);
INSERT INTO `sys_permission` VALUES ('5', 'ROLE_ADMIN4', 'ywcx', 'jkcx', null, '/xtgl/**', null);
INSERT INTO `sys_permission` VALUES ('6', 'ROLE_ADMIN5', 'xtgl', 'xtyhgl', null, '/jddz/**', null);
INSERT INTO `sys_permission` VALUES ('7', 'ROLE_ADMIN6', 'xtgl', 'jsgl', null, '/dashboard', null);
INSERT INTO `sys_permission` VALUES ('8', 'ROLE_ADMIN7', 'xtgl', 'cdgl', null, '/khgl/**', null);

-- ----------------------------
-- Table structure for sys_permission_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission_role`;
CREATE TABLE `sys_permission_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission_role
-- ----------------------------
INSERT INTO `sys_permission_role` VALUES ('3', '2', '1');
INSERT INTO `sys_permission_role` VALUES ('4', '1', '1');
INSERT INTO `sys_permission_role` VALUES ('5', '1', '2');
INSERT INTO `sys_permission_role` VALUES ('6', '1', '3');
INSERT INTO `sys_permission_role` VALUES ('7', '1', '4');
INSERT INTO `sys_permission_role` VALUES ('8', '1', '5');
INSERT INTO `sys_permission_role` VALUES ('9', '1', '6');
INSERT INTO `sys_permission_role` VALUES ('10', '1', '7');
INSERT INTO `sys_permission_role` VALUES ('11', '1', '8');
INSERT INTO `sys_permission_role` VALUES ('12', '1', '9');
INSERT INTO `sys_permission_role` VALUES ('13', '1', '10');
INSERT INTO `sys_permission_role` VALUES ('14', '1', '11');
INSERT INTO `sys_permission_role` VALUES ('15', '1', '12');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `name_desc` varchar(255) DEFAULT NULL COMMENT '角色职位【1：管理员 2：核真人员 3：运营经理】',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'ROLE_ADMIN', '管理员');
INSERT INTO `sys_role` VALUES ('2', 'ROLE_USER', '核真人员');
INSERT INTO `sys_role` VALUES ('3', 'ROLE_MANAGER', '运营经理');

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sys_user_id` int(11) DEFAULT NULL,
  `sys_role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES ('2', '1', '1');
INSERT INTO `sys_role_user` VALUES ('3', '2', '2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin');
INSERT INTO `sys_user` VALUES ('2', 'abel', 'abel');

-- ----------------------------
-- Table structure for sys_user_info
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_info`;
CREATE TABLE `sys_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统用户信息id',
  `character` int(11) DEFAULT NULL COMMENT '角色名id【1：管理员 2：核真人员 3：运营经理】',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `user_cell` varchar(255) DEFAULT NULL COMMENT '用户手机号',
  `user_job` varchar(255) DEFAULT NULL COMMENT '职位描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_info
-- ----------------------------
INSERT INTO `sys_user_info` VALUES ('1', '2', 'peter', '13311111111', 'ptest');
INSERT INTO `sys_user_info` VALUES ('2', '1', 'jane', '15927318516', 'jtest');
INSERT INTO `sys_user_info` VALUES ('3', '1', 'patrick', '13476026420', 'test');
INSERT INTO `sys_user_info` VALUES ('4', '1', 'libo', '13476026420', 'test');
INSERT INTO `sys_user_info` VALUES ('8', '2', 'q34', '13414', '1d');
INSERT INTO `sys_user_info` VALUES ('9', '1', 'testfsaf', '134242424', '4124');
SET FOREIGN_KEY_CHECKS=1;
