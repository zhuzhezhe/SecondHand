/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : demo1

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2015-10-28 13:48:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `pwd` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `classify`
-- ----------------------------
DROP TABLE IF EXISTS `classify`;
CREATE TABLE `classify` (
  `id` bigint(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classify
-- ----------------------------

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `descible` varchar(200) NOT NULL,
  `price` bigint(11) NOT NULL,
  `image` varchar(45) NOT NULL,
  `is_sale` tinyint(1) NOT NULL,
  `create_time` time NOT NULL,
  `classify_id` bigint(45) NOT NULL,
  `users_id` bigint(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `mail` varchar(100) NOT NULL,
  `pwd` varchar(45) NOT NULL,
  `phone` varchar(25) NOT NULL,
  `avatar` varchar(45) NOT NULL,
  `sigin` varchar(45) NOT NULL,
  `address` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1223 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('12', '工会经费更好', '大概', '吃饭干豆腐', '方法', '辅导费', '0', '水电费的双方各');
INSERT INTO `users` VALUES ('77', '1231', '2132', '20', '20', '20', '2', '23213');
INSERT INTO `users` VALUES ('123', '李刚', '870098938@qq.com', 'li1234567', '18707405619', 'lpp', '1', '松原一栋');
INSERT INTO `users` VALUES ('258', 'kii', 'lop', 'fgd', 'dfsg', 'sfs', '1', 'dfadsfadkh');
INSERT INTO `users` VALUES ('1222', '11212', '2121320', '21320', '213212', '1210', '1', '0534532.0');
