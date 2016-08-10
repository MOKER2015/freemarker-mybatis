/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test_hjf

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-07-13 16:58:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `test_user`
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `content` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', '小明1', '111', '111');
INSERT INTO `test_user` VALUES ('7', '小明2', '222', '222');
INSERT INTO `test_user` VALUES ('8', '小白1', '211', '211');
INSERT INTO `test_user` VALUES ('9', '小白2', '212', '212');
INSERT INTO `test_user` VALUES ('10', '小红1', '313', '313');
INSERT INTO `test_user` VALUES ('11', '小红2', '414', '414');
INSERT INTO `test_user` VALUES ('13', '123', '616', '616');
INSERT INTO `test_user` VALUES ('14', '124', '616', '616');
INSERT INTO `test_user` VALUES ('15', '125', '616', '616');
INSERT INTO `test_user` VALUES ('16', '126', '616', '616');
INSERT INTO `test_user` VALUES ('17', '127', '616', '616');
INSERT INTO `test_user` VALUES ('18', '128', '616', '616');
INSERT INTO `test_user` VALUES ('19', '129', '616', '616');
INSERT INTO `test_user` VALUES ('20', '130', '616', '616');
INSERT INTO `test_user` VALUES ('21', '211', '616', '616');
INSERT INTO `test_user` VALUES ('22', '212', '616', '616');
INSERT INTO `test_user` VALUES ('23', '213', '616', '616');
INSERT INTO `test_user` VALUES ('24', '214', '616', '616');
INSERT INTO `test_user` VALUES ('25', '215', '616', '616');
INSERT INTO `test_user` VALUES ('26', '216', '616', '616');
INSERT INTO `test_user` VALUES ('27', '217', '616', '616');
INSERT INTO `test_user` VALUES ('28', '218', '616', '616');
INSERT INTO `test_user` VALUES ('29', '219', '616', '616');
INSERT INTO `test_user` VALUES ('30', '230', '616', '616');
INSERT INTO `test_user` VALUES ('31', '312', '616', '616');
INSERT INTO `test_user` VALUES ('32', '313', '616', '616');
INSERT INTO `test_user` VALUES ('33', '314', '616', '616');
INSERT INTO `test_user` VALUES ('34', '315', '616', '616');
INSERT INTO `test_user` VALUES ('35', '316', '616', '616');
INSERT INTO `test_user` VALUES ('36', '317', '616', '616');
INSERT INTO `test_user` VALUES ('37', '318', '616', '616');
INSERT INTO `test_user` VALUES ('38', '42', '616', '616');
INSERT INTO `test_user` VALUES ('39', '43', '616', '616');
INSERT INTO `test_user` VALUES ('40', '44', '616', '616');
INSERT INTO `test_user` VALUES ('41', '51', '616', '616');
INSERT INTO `test_user` VALUES ('42', '52', '616', '616');
INSERT INTO `test_user` VALUES ('43', '54', '616', '616');
INSERT INTO `test_user` VALUES ('44', '611', '616', '616');
INSERT INTO `test_user` VALUES ('45', '612', '616', '616');
INSERT INTO `test_user` VALUES ('46', '613', '616', '616');
INSERT INTO `test_user` VALUES ('47', '614', '616', '616');
INSERT INTO `test_user` VALUES ('48', '615', '616', '616');
INSERT INTO `test_user` VALUES ('49', '616', '616', '616');
INSERT INTO `test_user` VALUES ('50', '617', '616', '616');
INSERT INTO `test_user` VALUES ('51', '618', '616', '616');
INSERT INTO `test_user` VALUES ('52', '619', '616', '616');
