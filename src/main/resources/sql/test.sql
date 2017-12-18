/*
Navicat MySQL Data Transfer

Source Server         : localhost_33066
Source Server Version : 50614
Source Host           : localhost:33066
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2017-12-18 18:03:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for datainfo
-- ----------------------------
DROP TABLE IF EXISTS `datainfo`;
CREATE TABLE `datainfo` (
  `infoid` int(11) NOT NULL AUTO_INCREMENT,
  `userCode` varchar(255) DEFAULT NULL,
  `startCityName` varchar(255) DEFAULT NULL,
  `PassCityName` varchar(255) DEFAULT NULL,
  `StartName_ch` varchar(255) DEFAULT NULL,
  `PassCityName_ch` varchar(255) DEFAULT NULL,
  `StartX_axis` int(255) DEFAULT NULL,
  `StartY_axis` int(255) DEFAULT NULL,
  `PassX_axis` int(255) DEFAULT NULL,
  `PassY_axis` int(255) DEFAULT NULL,
  `DeviceName` varchar(255) DEFAULT NULL,
  `Start_deviceInfo` varchar(255) DEFAULT NULL,
  `Pass_deviveInfo` varchar(255) DEFAULT NULL,
  `creatIndoTime` timestamp NULL DEFAULT NULL,
  `isdelete` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`infoid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of datainfo
-- ----------------------------
INSERT INTO `datainfo` VALUES ('1', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');

-- ----------------------------
-- Table structure for line
-- ----------------------------
DROP TABLE IF EXISTS `line`;
CREATE TABLE `line` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) NOT NULL,
  `eid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `direction` int(2) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `distance` varchar(255) NOT NULL,
  `addtime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sid` (`sid`),
  CONSTRAINT `line_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `point` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of line
-- ----------------------------

-- ----------------------------
-- Table structure for muser
-- ----------------------------
DROP TABLE IF EXISTS `muser`;
CREATE TABLE `muser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `role` varchar(2) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `addtime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of muser
-- ----------------------------

-- ----------------------------
-- Table structure for point
-- ----------------------------
DROP TABLE IF EXISTS `point`;
CREATE TABLE `point` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `longitude` varchar(255) NOT NULL,
  `latitude` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `addtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of point
-- ----------------------------
