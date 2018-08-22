/*
MySQL Data Transfer
Source Host: localhost
Source Database: hotelmanage
Target Host: localhost
Target Database: hotelmanage
Date: 2018/8/22 17:42:29
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for menutable
-- ----------------------------
DROP TABLE IF EXISTS `menutable`;
CREATE TABLE `menutable` (
  `MENUID` int(50) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `PARENTID` int(50) DEFAULT NULL COMMENT '上级菜单id',
  `LEVELNUM` int(1) DEFAULT NULL COMMENT '菜单级别：1：一级菜单；2：二级菜单；3：三级菜单',
  `MENUNAME` varchar(50) DEFAULT NULL COMMENT '菜单名字',
  `MENUURL` varchar(128) DEFAULT NULL COMMENT '菜单链接',
  `MENUICON` varchar(128) DEFAULT NULL COMMENT '菜单图标',
  `STATE` int(1) DEFAULT '1' COMMENT '状态:1:启用 0：停用 3：最高管理者菜单',
  `MENUSORT` int(5) DEFAULT '1' COMMENT '排序用的',
  PRIMARY KEY (`MENUID`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for roletable
-- ----------------------------
DROP TABLE IF EXISTS `roletable`;
CREATE TABLE `roletable` (
  `ID` varchar(50) NOT NULL COMMENT '主键 id',
  `ROLENAME` varchar(30) NOT NULL COMMENT '角色名称',
  `LEVELNUM` int(1) DEFAULT NULL COMMENT '角色层级（待用）',
  `describe` varchar(200) DEFAULT NULL,
  `TYPE` int(1) DEFAULT NULL COMMENT '角色类型',
  `CREATEUSER` varchar(20) DEFAULT NULL COMMENT '创建人员（对应人员账号）',
  `CREATETIME` date DEFAULT NULL COMMENT '创建时间',
  `STATE` int(1) DEFAULT '1' COMMENT '状态：0停用，1正常',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_menu_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu_role`;
CREATE TABLE `sys_menu_role` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT '键主id',
  `MENU_ID` varchar(50) NOT NULL COMMENT '菜单id',
  `ROLE_ID` varchar(50) NOT NULL COMMENT '角色id',
  `CREATETIME` date DEFAULT NULL COMMENT '创建时间',
  `CREATEUSER` varchar(20) DEFAULT NULL COMMENT '创建用户账号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `USER_ID` varchar(50) NOT NULL COMMENT '用户id',
  `ROLE_ID` varchar(50) NOT NULL COMMENT '角色id',
  `CREATETIME` date DEFAULT NULL COMMENT '创建时间',
  `CREATEUSER` varchar(20) DEFAULT NULL COMMENT '创建用户账号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usertable
-- ----------------------------
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `ID` varchar(50) NOT NULL COMMENT '主键id',
  `ACCOUNT` varchar(20) NOT NULL COMMENT '登录账号',
  `PASSWORD` varchar(20) NOT NULL COMMENT '登录密码',
  `NAME` varchar(15) NOT NULL COMMENT '姓名',
  `PHONENUMBER` varchar(15) NOT NULL COMMENT '电话',
  `IDCARDNUM` varchar(20) NOT NULL COMMENT '身份证明号码',
  `CREATETIME` date DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`ID`,`ACCOUNT`,`PHONENUMBER`,`IDCARDNUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `menutable` VALUES ('1', '0', '1', '综合管理', 'javascript:;', '&#xe6ce;', '1', '1');
INSERT INTO `menutable` VALUES ('2', '0', '1', '权限管理', 'javascript:;', '&#xe726;', '1', '1');
INSERT INTO `menutable` VALUES ('3', '0', '1', '会员管理', 'javascript:;', '&#xe6b8;', '1', '1');
INSERT INTO `menutable` VALUES ('4', '7', '2', '菜单管理', '/HotelAdmin/pages/systemSetting/menuManage/menu_manage.html', '&#xe6a7;', '3', '1');
INSERT INTO `menutable` VALUES ('5', '1', '2', '酒店管理', '/HotelAdmin/pages/composite/hotelmanage/hotel_manage.html', null, '1', '100');
INSERT INTO `menutable` VALUES ('6', '2', '2', '角色管理', '/hotelAdmin/pages/permissions/roleManage/role_manage.html', null, '1', '100');
INSERT INTO `menutable` VALUES ('7', '0', '1', '系统设置', 'javascript:;', '&#xe716;', '3', '1');
INSERT INTO `roletable` VALUES ('1', '超级管理员', '0', null, '1', null, null, '1');
INSERT INTO `sys_menu_role` VALUES ('1', '1', '1', '2018-08-21', 'root');
INSERT INTO `sys_menu_role` VALUES ('2', '2', '1', '2018-08-21', 'root');
INSERT INTO `sys_menu_role` VALUES ('3', '3', '1', '2018-08-21', 'root');
INSERT INTO `sys_menu_role` VALUES ('4', '4', '1', '2018-08-21', 'root');
INSERT INTO `sys_menu_role` VALUES ('5', '5', '1', '2018-08-21', 'root');
INSERT INTO `sys_user_role` VALUES ('1', '1', '1', '2018-08-21', 'root');
INSERT INTO `usertable` VALUES ('1', 'admin', '888888', '超级管理员', '18202817283', '511522199202214668', '2018-08-18');
