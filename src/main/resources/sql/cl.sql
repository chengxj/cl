/*
Navicat MySQL Data Transfer

Source Server         : mysql5.1
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : cl

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2014-08-06 00:11:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activities`
-- ----------------------------
DROP TABLE IF EXISTS `activities`;
CREATE TABLE `activities` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `type_enum` varchar(128) NOT NULL,
  `scenic_spots` varchar(128) NOT NULL,
  `departure` varchar(128) NOT NULL,
  `destination` varchar(128) NOT NULL,
  `leader` varchar(128) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activities
-- ----------------------------
INSERT INTO `activities` VALUES ('1', '东大高', 'CYCLING', '', '清河', '东方红、大村、高崖口', '萝卜', null, null);
INSERT INTO `activities` VALUES ('2', '花海', 'MOUNTAIN', '', '安慧桥', '珍珠泉', '黑猫', null, null);
INSERT INTO `activities` VALUES ('3', '东大高', 'CYCLING', '', '清河', '东方红、大村、高崖口', '萝卜', null, null);
INSERT INTO `activities` VALUES ('4', '花海', 'MOUNTAIN', '', '安慧桥', '珍珠泉', '黑猫', null, null);
INSERT INTO `activities` VALUES ('5', '东大高', 'CYCLING', '', '清河', '东方红、大村、高崖口', '萝卜', null, null);
INSERT INTO `activities` VALUES ('6', '花海', 'MOUNTAIN', '', '安慧桥', '珍珠泉', '黑猫', null, null);
INSERT INTO `activities` VALUES ('7', '东大高', 'CYCLING', '', '清河', '东方红、大村、高崖口', '萝卜', null, null);
INSERT INTO `activities` VALUES ('8', '花海', 'MOUNTAIN', '', '安慧桥', '珍珠泉', '黑猫', null, null);
INSERT INTO `activities` VALUES ('9', '东大高', 'CYCLING', '', '清河', '东方红、大村、高崖口', '萝卜', null, null);
INSERT INTO `activities` VALUES ('10', '花海', 'MOUNTAIN', '', '安慧桥', '珍珠泉', '黑猫', null, null);
INSERT INTO `activities` VALUES ('11', '东大高', 'CYCLING', '', '清河', '东方红、大村、高崖口', '萝卜', null, null);
INSERT INTO `activities` VALUES ('12', '花海', 'MOUNTAIN', '', '安慧桥', '珍珠泉', '黑猫', null, null);

-- ----------------------------
-- Table structure for `registration`
-- ----------------------------
DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `activities_id` bigint(20) NOT NULL,
  `name` varchar(128) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `real_name` varchar(128) NOT NULL,
  `contact_way` varchar(128) NOT NULL,
  `emergency_contact` varchar(128) NOT NULL,
  `emergency_contact_way` varchar(128) NOT NULL,
  `num` int(11) NOT NULL,
  `equipment_experience_remarks` varchar(512) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registration
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(40) NOT NULL DEFAULT '0',
  `login_name` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'cxj', 'c4ca4238a0b923820dcc509a6f75849b');
