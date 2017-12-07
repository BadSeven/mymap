/*
Navicat MySQL Data Transfer

Source Server         : localhost_33066
Source Server Version : 50614
Source Host           : localhost:33066
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2017-12-07 17:59:27
*/

SET FOREIGN_KEY_CHECKS=0;

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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of line
-- ----------------------------
INSERT INTO `line` VALUES ('12', '1', '2', '', '1', '最远的距离', '1024', '2017-12-07 17:49:29');
INSERT INTO `line` VALUES ('14', '1', '2', '很远很远', '1', '最远的距离', '1024', '2017-12-07 17:58:11');

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
INSERT INTO `muser` VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3', '0', '16582127007', 'lvbingzz@qq.com', '2017-12-07 16:47:08');
INSERT INTO `muser` VALUES ('2', 'seven', 'lovemlm', '1', '15682127007', 'lvbingzz@163.com', '2017-12-07 16:57:15');

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
INSERT INTO `point` VALUES ('1', '84.716322', '44.430699', '这个地方是我曾经最想去的地方..', '2017-12-07 17:08:45');
INSERT INTO `point` VALUES ('2', '116.793285', '33.976001', '家在的地方', '2017-12-07 17:13:04');
INSERT INTO `point` VALUES ('3', '116.793285', '33.976001', '家在的地方', '2017-12-07 17:16:21');
INSERT INTO `point` VALUES ('4', '116.793285', '33.976001', '家在的地方', '2017-12-07 17:23:59');
