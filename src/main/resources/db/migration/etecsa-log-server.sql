/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : etecsa-log-server

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 13/07/2020 10:51:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for etecsa_log_record
-- ----------------------------
DROP TABLE IF EXISTS `etecsa_log_record`;
CREATE TABLE `etecsa_log_record` (
  `ID` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '主键',
  `SERVER_NAME` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '服务名',
  `SERVER_INSTANCE` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实例编号',
  `SERVER_METHOD` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '调用方法',
  `OPERATOR_ID` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '操作人id',
  `OPERATOR_IP` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '操作人ip',
  `OPERATOR_NAME` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '操作人姓名',
  `OPERATED_TYPE` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '操作类型',
  `OPERATED_MOULD` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '操作模块',
  `CONTENT` varchar(1024) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '操作内容',
  `REQUEST_PARAM` varchar(3072) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '请求参数',
  `REMARK` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `REVISION` int(11) DEFAULT NULL COMMENT '乐观锁',
  `CREATED_BY` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建人',
  `CREATED_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATED_BY` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人',
  `UPDATED_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='日志信息';

SET FOREIGN_KEY_CHECKS = 1;
