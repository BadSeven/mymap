/*
Navicat MySQL Data Transfer

Source Server         : localhost_33066
Source Server Version : 50614
Source Host           : localhost:33066
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2017-12-19 13:46:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for citydeviceinfo
-- ----------------------------
DROP TABLE IF EXISTS `citydeviceinfo`;
CREATE TABLE `citydeviceinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cityName` varchar(255) DEFAULT NULL,
  `cityName_ch` varchar(255) DEFAULT NULL,
  `deviceInfo` varchar(255) DEFAULT NULL,
  `IsdeleteDevice` varchar(255) DEFAULT NULL,
  `creatIndoTime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of citydeviceinfo
-- ----------------------------
INSERT INTO `citydeviceinfo` VALUES ('1', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('2', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('3', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('4', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('5', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('6', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('7', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('8', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('9', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('10', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('11', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('12', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('13', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('14', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('15', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('16', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('17', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('18', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('19', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('20', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('21', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('22', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('23', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('24', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('25', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('26', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('27', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('28', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');
INSERT INTO `citydeviceinfo` VALUES ('29', '北京', 'bj', 'osl6299', '1', '2017-12-19 11:41:54');

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
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of datainfo
-- ----------------------------
INSERT INTO `datainfo` VALUES ('2', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('3', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('4', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('5', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('6', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('7', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('8', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('9', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('10', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('11', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('12', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('13', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('14', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('15', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('16', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('17', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('18', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('19', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('20', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('21', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('22', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('23', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('24', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('25', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('26', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('27', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('28', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('29', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('30', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('31', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('32', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('33', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('34', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');
INSERT INTO `datainfo` VALUES ('35', '1', '12', '12', null, '22', '2', '2', '3', '3', '5200', '1', '2', '2017-12-18 17:48:15', '1');

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
-- Table structure for mapuser
-- ----------------------------
DROP TABLE IF EXISTS `mapuser`;
CREATE TABLE `mapuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `UserCode` varchar(255) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Isdelete` varchar(255) DEFAULT NULL,
  `CreadtTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mapuser
-- ----------------------------
INSERT INTO `mapuser` VALUES ('1', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('2', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('3', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('4', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('5', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('6', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('7', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('8', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('9', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('10', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('11', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('12', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('13', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('14', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('15', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('16', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('17', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('18', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('19', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('20', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('21', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('22', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('23', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('24', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('25', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('26', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('27', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('28', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('29', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('30', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');
INSERT INTO `mapuser` VALUES ('31', '1111', 'seven', '123', '1', '2017-12-19 13:03:42');

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
