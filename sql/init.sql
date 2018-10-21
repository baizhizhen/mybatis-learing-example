/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-10-21 20:05:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `score` varchar(255) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_organization
-- ----------------------------
DROP TABLE IF EXISTS `t_organization`;
CREATE TABLE `t_organization` (
  `organ_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '组织编号',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `code` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `telephone` varchar(100) DEFAULT NULL COMMENT '电话',
  `status` tinyint(1) DEFAULT '1' COMMENT '0禁用1启用',
  `author` varchar(100) DEFAULT NULL COMMENT '创建者',
  `birth` datetime DEFAULT NULL COMMENT '创建时间',
  `token` varchar(100) DEFAULT NULL COMMENT '唯一标识',
  PRIMARY KEY (`organ_id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_resource`;
CREATE TABLE `t_resource` (
  `resource_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '资源编号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '分配人',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `code` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `url` varchar(100) NOT NULL COMMENT '资源路径',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父节点',
  `des` varchar(100) DEFAULT NULL COMMENT '资源描述',
  `birth` datetime DEFAULT NULL COMMENT '创建时间',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  `method` varchar(100) DEFAULT NULL COMMENT '请求方式',
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `organ_id` bigint(20) DEFAULT NULL COMMENT '组织编号',
  `role_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `role_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `role_desc` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `author` varchar(100) DEFAULT NULL COMMENT '创建者',
  `birth` datetime DEFAULT NULL COMMENT '创建时间',
  `status` tinyint(1) DEFAULT '1' COMMENT '0禁用1启用',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_role_resource_rel
-- ----------------------------
DROP TABLE IF EXISTS `t_role_resource_rel`;
CREATE TABLE `t_role_resource_rel` (
  `rel_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `resource_id` bigint(20) DEFAULT NULL COMMENT '资源id',
  PRIMARY KEY (`rel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2802 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `organ_id` bigint(20) DEFAULT NULL COMMENT '组织编号',
  `employee_id` varchar(100) DEFAULT NULL COMMENT '员工编号',
  `account` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(100) NOT NULL COMMENT '密码',
  `nick_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '电子邮箱',
  `cellphone` varchar(100) DEFAULT NULL COMMENT '手机号',
  `qq` varchar(100) DEFAULT NULL COMMENT 'qq',
  `latest_time` varchar(100) DEFAULT NULL COMMENT '最后登录时间',
  `latest_ip` varchar(100) DEFAULT NULL COMMENT '最后登录ip',
  `status` tinyint(1) DEFAULT '1' COMMENT '0禁用，1启用,-1假删',
  `birth` datetime DEFAULT NULL COMMENT '创建时间',
  `author` varchar(100) DEFAULT NULL COMMENT '创建者',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=234 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user_role_rel
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role_rel`;
CREATE TABLE `t_user_role_rel` (
  `rel_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关系主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户编号',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色编号',
  `organ_id` bigint(20) DEFAULT NULL COMMENT '公司编号',
  `status` int(10) DEFAULT '1' COMMENT '1.启用。0.停用。-1.删除',
  PRIMARY KEY (`rel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=195 DEFAULT CHARSET=utf8;
