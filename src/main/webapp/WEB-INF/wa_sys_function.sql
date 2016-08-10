/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test_hjf

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-07-13 16:58:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `wa_sys_function`
-- ----------------------------
DROP TABLE IF EXISTS `wa_sys_function`;
CREATE TABLE `wa_sys_function` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `NAME` varchar(50) NOT NULL COMMENT '功能名称',
  `TYPE` enum('menu','func','top','button') NOT NULL DEFAULT 'func' COMMENT '功能分类',
  `ICON` varchar(20) DEFAULT NULL COMMENT '图片css',
  `URL` varchar(255) DEFAULT NULL COMMENT '模块链接',
  `RARENT_ID` int(11) NOT NULL DEFAULT '0' COMMENT '父节点',
  `RARENT_IDS` varchar(100) DEFAULT '0' COMMENT '父节点串，以逗号分隔',
  `PERNISSION` varchar(100) NOT NULL DEFAULT 'default:*' COMMENT '权限（shiro标示）',
  `DESCRIPTION` text COMMENT '描述',
  `SORTING` int(4) DEFAULT '0' COMMENT '排序',
  `AVAILABLE` tinyint(1) DEFAULT '1' COMMENT '是否可用(0-不可用；1-可用)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=171 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wa_sys_function
-- ----------------------------
INSERT INTO `wa_sys_function` VALUES ('1', '国际人才网', 'top', '', '', '0', '1', 'default:*', '主节点', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('2', '首页', 'menu', '', '', '1', '1', 'default:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('3', '企业', 'menu', '', '', '1', '1', 'default:*', null, '2', '1');
INSERT INTO `wa_sys_function` VALUES ('4', '个人', 'menu', '', '', '1', '1', 'default:*', null, '3', '1');
INSERT INTO `wa_sys_function` VALUES ('5', '服务', 'menu', '', '', '1', '1', 'default:*', '', '4', '1');
INSERT INTO `wa_sys_function` VALUES ('6', '广告', 'menu', '', '', '1', '1', 'default:*', null, '5', '1');
INSERT INTO `wa_sys_function` VALUES ('7', '反馈', 'menu', '', '', '1', '1', 'default:*', null, '6', '1');
INSERT INTO `wa_sys_function` VALUES ('8', '配置', 'menu', '', '', '1', '1', 'default:*', '', '7', '1');
INSERT INTO `wa_sys_function` VALUES ('9', '管理员', 'menu', '', '', '1', '1', 'default:*', null, '8', '1');
INSERT INTO `wa_sys_function` VALUES ('10', '系统', 'menu', '', '', '1', '1', 'default:*', null, '9', '1');
INSERT INTO `wa_sys_function` VALUES ('11', '用户管理', 'func', 'icon-users', '/sys/user/index', '9', '1,9', 'user:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('12', '角色管理', 'func', 'icon-role', '/sys/roles/index', '9', '1,9', 'roles:*', null, '2', '1');
INSERT INTO `wa_sys_function` VALUES ('14', '模块管理', 'func', 'icon-func', '/sys/func/index', '9', '1,9', 'func:*', null, '3', '1');
INSERT INTO `wa_sys_function` VALUES ('16', '服务管理', 'func', 'icon-users', '/contract/contractManager', '5', '1,5', 'default:*', '合同管理', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('18', '企业会员', 'func', '', '/ent/entuser/index', '3', '1,3', 'default:*', '企业账户管理', '2', '1');
INSERT INTO `wa_sys_function` VALUES ('23', '产品类型', 'func', '', '/contract/type', '5', '1,5', 'contract:type:*', '合同内 广告,增值，线下的 类型管理', '10', '1');
INSERT INTO `wa_sys_function` VALUES ('31', '企业管理', 'func', '', '/ent/entinfo/index', '3', '1,3', 'ent:entinfo:index:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('34', '职位列表', 'func', '', '/ent/jobs/index', '3', '1,3', 'default:*', '', '3', '1');
INSERT INTO `wa_sys_function` VALUES ('35', '简历管理', 'func', '', '/index_user', '4', '1,4', 'default:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('37', '会员日志', 'func', '', '/sys/log/index', '10', '1,10', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('38', '账号管理', 'func', '', '/index_user', '4', '1,4', 'default:*', '', '5', '1');
INSERT INTO `wa_sys_function` VALUES ('39', '词库管理', 'func', 'icon-users', '/dic/index', '10', '1,10', 'default:*', '词库', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('40', '广告管理', 'func', '', '/ent/ad/index', '6', '1,6', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('41', '广告类型管理', 'func', '', '/ent/catagory/index', '6', '1,6', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('42', '举报信息管理', 'func', '', '/feedback/report/index', '7', '1,7', 'default:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('43', '意见建议管理', 'func', '', '/feedback/advice/index', '7', '1,7', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('44', '地区分类管理', 'func', '', '/category/area/index', '8', '1,8', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('45', '职位分类管理', 'func', '', '/category/jobs/index', '8', '1,8', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('47', '定时任务配置', 'func', '', 'http://121.201.6.196:28080/quartjob/index/quartCorn', '8', '1,8', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('48', '模板管理', 'func', '', '/config/board/index', '8', '1,8', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('66', '添加', 'button', '', '', '12', '1,9,12', 'roles:add', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('69', '修改', 'button', '', '', '12', '1,9,12', 'roles:edit', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('70', ' 数据字典类型管理', 'func', '', '/category/group/index', '8', '0', 'default:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('71', '数据字典管理', 'func', '', '/category/datadict/index', '8', '0', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('72', '网络配置', 'func', '', '/config/network/index', '8', '1,8', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('73', '分站管理', 'func', '', '/config/substation/index', '8', '1,8', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('74', '查看', 'button', '', '', '35', '1,4,35', 'jsresume:view', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('75', '修改', 'button', '', '', '31', '1,3,31', 'entinfo:edit', '修改企业信息', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('76', '添加', 'button', '', '', '48', '1,8,48', 'roles:add', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('77', '修改', 'button', '', '', '48', '1,8,48', 'roles:edit', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('78', '删除', 'button', '', '', '48', '1,8,48', 'roles:del', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('79', '添加', 'button', '', '', '73', '1,8,73', 'roles:add', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('80', '修改', 'button', '', '', '73', '1,8,73', 'roles:edit', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('81', '删除', 'button', '', '', '73', '1,8,73', 'roles:del', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('82', 'SEO统一配置', 'func', '', '/config/seo/index', '8', '1,8', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('83', '增加', 'button', '', '', '38', '1,4,38', 'jsuser:add', '账号增加按钮', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('84', '修改', 'button', '', '', '38', '1,4,38', 'jsuser:edit', '账号修改按钮', '2', '1');
INSERT INTO `wa_sys_function` VALUES ('85', '重置密码', 'button', '', '', '38', '1,4,38', 'jsuser:resetpwd', '重置密码按钮', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('87', '删除', 'button', '', '', '38', '1,4,38', 'jsuser:delete', '删除按钮', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('88', '审核', 'button', '', '', '35', '1,4,35', 'jsresume:check', '简历审核', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('89', '刷新', 'button', '', '', '35', '1,4,35', 'jsresume:refresh', '刷新', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('90', '登录', 'button', '', '', '35', '1,4,35', 'jsresume:login', '登录', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('91', '查看日志', 'button', '', '', '35', '1,4,35', 'jsresume:log', '查看日志', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('92', '删除', 'button', '', '', '31', '1,3,31', 'entinfo:delete', '删除企业信息', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('93', '审核', 'button', '', '', '31', '1,3,31', 'entinfo:check', '审核/批量审核', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('94', '禁用/启用子账号', 'button', '', '', '31', '1,3,31', 'entinfo:stopacc', '禁用、启用子账号', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('95', '日志', 'button', '', '', '31', '1,3,31', 'entinfo:log', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('96', '屏蔽', 'button', '', '', '31', '1,3,31', 'entinfo:shield', '屏蔽企业按钮', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('97', '增加', 'button', '', '', '18', '1,3,18', 'entuser:add', '企业账号增加', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('98', '修改', 'button', '', '', '18', '1,3,18', 'entuser:edit', '修改', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('99', '删除', 'button', '', '', '18', '1,3,18', 'entuser:delete', '删除', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('100', '启用子账号', 'button', '', '', '18', '1,3,18', 'entuser:startacc', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('101', '停用子账号', 'button', '', '', '18', '1,3,18', 'entuser:stopacc', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('102', '重置密码', 'button', '', '', '18', '1,3,18', 'entuser:resetpwd', '重置密码', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('103', '增加', 'button', '', '', '34', '1,3,34', 'entjobs:add', '增加', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('104', '修改', 'button', '', '', '34', '1,3,34', 'entjobs:edit', '修改', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('105', '删除', 'button', '', '', '34', '1,3,34', 'entjobs:delete', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('106', '审核', 'button', '', '', '34', '1,3,34', 'entjobs:check', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('107', '日志', 'button', '', '', '34', '1,3,34', 'entjobs:log', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('108', '附件简历', 'func', '', '/resume/resume/attrindex', '4', '1,4', 'default:*', '', '10', '1');
INSERT INTO `wa_sys_function` VALUES ('109', '登录', 'button', '', '', '31', '1,3,31', 'entinfo:login', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('110', '审核', 'button', '', '', '108', '1,4,108', 'attjs:check', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('111', '导出excel', 'button', '', '', '31', '1,3,31', 'entinfo:expexcel', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('112', '添加', 'button', '', '', '82', '1,8,82', 'roles:add', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('113', '修改', 'button', '', '', '82', '1,8,82', 'roles:edit', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('114', '删除', 'button', '', '', '82', '1,8,82', 'roles:del', '', '0', '0');
INSERT INTO `wa_sys_function` VALUES ('115', '解锁', 'button', '', '', '18', '1,3,18', 'entuser:unlocked', '解锁', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('116', '屏蔽', 'button', '', '', '35', '1,4,35', 'jsresume:shield', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('117', '锁定/解锁', 'button', '', '', '38', '1,4,38', 'jsuser:lock', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('119', '禁用/解禁', 'button', '', '', '38', '1,4,38', 'jsuser:forbid', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('120', '猎头', 'menu', '', '', '1', '1,1', 'default:*', '', '10', '1');
INSERT INTO `wa_sys_function` VALUES ('121', '简历管理', 'func', '', '/index_user', '120', '1,1,120', 'default:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('122', '修改', 'button', '', '', '121', '1,1,120,121', 'rec:edit', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('123', '充值管理', 'func', '', '/fi/input', '120', '1,1,120', 'default:*', '', '5', '1');
INSERT INTO `wa_sys_function` VALUES ('124', '充值', 'button', '', '', '123', '1,1,120,123', 'input:add', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('125', '删除', 'button', '', '', '123', '1,1,120,123', 'input:del', '', '5', '1');
INSERT INTO `wa_sys_function` VALUES ('126', '网猎币查询', 'func', '', '/balance/index', '120', '1,1,120', 'default:*', '', '10', '1');
INSERT INTO `wa_sys_function` VALUES ('127', '网猎币流水', 'func', '', '/balance/balanceItem', '120', '1,1,120', 'default:*', '', '20', '1');
INSERT INTO `wa_sys_function` VALUES ('128', '企业关注简历', 'func', '', '/rec/followResume', '120', '1,1,120', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('129', '我联系的简历', 'func', '', '/rec/myLinkResume', '120', '1,1,120', 'default:*', '', '2', '1');
INSERT INTO `wa_sys_function` VALUES ('130', '修改密码', 'func', '', '/sys/user/updatePass', '10', '1,10', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('132', '审核', 'button', '', '', '121', '1,1,120,121', 'rec:resumeaduit', '', '5', '1');
INSERT INTO `wa_sys_function` VALUES ('133', '修改', 'button', '', '', '128', '1,1,120,128', 'follow:edit', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('134', '购买简历', 'button', '', '', '128', '1,1,120,128', 'follow:buy', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('135', '查看', 'button', '', '', '128', '1,1,120,128', 'follow:view', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('136', '修改', 'button', '', '', '129', '1,1,120,129', 'invite:edit', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('137', '查看', 'button', '', '', '129', '1,1,120,129', 'invite:view', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('138', '购买简历', 'button', '', '', '121', '1,1,120,121', 'rec:buy', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('139', '查看', 'button', '', '', '121', '1,1,120,121', 'rec:view', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('141', '已下载简历查询', 'func', '', '/rec/app', '120', '1,1,120', 'default:*', '', '30', '1');
INSERT INTO `wa_sys_function` VALUES ('142', '个人设置', 'func', '', '/sys/mynes/index', '10', '1,10', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('143', '企业推广', 'func', '', '/ent/promote/index', '3', '1,3', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('144', '添加', 'button', '', '', '143', '1,3,143', 'promote:add', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('145', '修改', 'button', '', '', '143', '1,3,143', 'promote:edit', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('147', '友情链接', 'func', '', '/ent/link/index', '6', '1,6', 'default:*', '', '1', '1');
INSERT INTO `wa_sys_function` VALUES ('148', '企业设置', 'func', '', '/sys/ent/index', '10', '1,10', 'default:*', '', '30', '1');
INSERT INTO `wa_sys_function` VALUES ('149', '套餐设置', 'func', '', '/sys/ent/setmeal', '10', '1,10', 'default:*', '', '50', '1');
INSERT INTO `wa_sys_function` VALUES ('150', '顾问管理', 'func', '', '/ent/crmCom/index', '3', '1,3', 'default:*', '', '4', '1');
INSERT INTO `wa_sys_function` VALUES ('151', '企业消费记录', 'func', '', '/contract/account', '5', '1,5', 'default:*', '企业消费记录', '11', '1');
INSERT INTO `wa_sys_function` VALUES ('152', '添加', 'button', '', '', '40', '1,6,40', 'ad:add', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('153', '更新', 'button', '', '', '40', '1,6,40', 'ad:update', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('154', '删除', 'button', '', '', '40', '1,6,40', 'ad:del', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('155', '添加', 'button', '', '', '41', '1,6,41', 'category:add', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('156', '更新', 'button', '', '', '41', '1,6,41', 'category:update', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('157', '删除', 'button', '', '', '41', '1,6,41', 'category:del', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('158', '添加', 'button', '', '', '147', '1,6,147', 'link:add', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('159', '更新', 'button', '', '', '147', '1,6,147', 'link:edit', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('160', '添加', 'button', '', '', '150', '1,3,150', 'crmCom:add', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('161', '更新', 'button', '', '', '150', '1,3,150', 'crmCom:edit', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('162', '删除', 'button', '', '', '147', '1,6,147', 'link:del', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('163', '安全设置', 'func', '', '/sys/sentbanned/index', '10', '1,10', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('164', '网猎通企业', 'func', '', '/ent/wlt/index', '120', '1,1,120', 'default:*', '', '40', '1');
INSERT INTO `wa_sys_function` VALUES ('165', '增加', 'button', '', '', '164', '1,1,120,164', 'entwlt:add', '', '5', '1');
INSERT INTO `wa_sys_function` VALUES ('166', '删除', 'button', '', '', '164', '1,1,120,164', 'entwlt:delete', '', '10', '1');
INSERT INTO `wa_sys_function` VALUES ('168', '系统日志', 'func', '', '/sys/sysLog/index', '10', '1,10', 'default:*', '', '0', '1');
INSERT INTO `wa_sys_function` VALUES ('170', '线下活动', 'func', '', '/offline/index', '5', '1,5', 'default:*', '', '20', '1');
