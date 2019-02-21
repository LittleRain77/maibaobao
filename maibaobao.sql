/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50018
Source Host           : 127.0.0.1:3306
Source Database       : maibaobao

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2014-07-17 14:58:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` varchar(50) NOT NULL,
  `aname` varchar(200) NOT NULL,
  `apass` varchar(200) NOT NULL,
  `asex` varchar(8) default NULL,
  `aimage` varchar(200) default NULL,
  `apower` varchar(200) default NULL,
  PRIMARY KEY  (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('aa', '超级管理员', 'aa', '男', 'imageS/20140716025314.jpg', '0');
INSERT INTO `admin` VALUES ('caicai', '彩彩', 'caicai', '男', null, '1');
INSERT INTO `admin` VALUES ('changchang', '畅畅', 'changchang', '女', null, '1');
INSERT INTO `admin` VALUES ('feifei', '飞飞', 'feifei', '男', null, '1');
INSERT INTO `admin` VALUES ('meimei', '美美', 'meimei', '无', null, '2');
INSERT INTO `admin` VALUES ('nana', '娜娜', 'nana', '女', null, '1');
INSERT INTO `admin` VALUES ('xiangxiang', '祥祥', 'xiangxiang', '男', null, '1');

-- ----------------------------
-- Table structure for app
-- ----------------------------
DROP TABLE IF EXISTS `app`;
CREATE TABLE `app` (
  `apid` int(11) NOT NULL,
  `appath` varchar(255) default NULL,
  `aptype` varchar(255) default NULL,
  `aptext` text,
  PRIMARY KEY  (`apid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of app
-- ----------------------------

-- ----------------------------
-- Table structure for applyrefund
-- ----------------------------
DROP TABLE IF EXISTS `applyrefund`;
CREATE TABLE `applyrefund` (
  `arid` int(11) NOT NULL auto_increment,
  `uid` varchar(50) default NULL,
  `gid` int(11) default NULL,
  `arreason` varchar(100) default NULL,
  `artext` varchar(2000) default NULL,
  `arstatus` varchar(50) default NULL,
  PRIMARY KEY  (`arid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of applyrefund
-- ----------------------------
INSERT INTO `applyrefund` VALUES ('1', 'zpf@126.com', '3', 'buhao', 'gdg', '通过');

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `cid` int(11) NOT NULL auto_increment,
  `uid` varchar(50) default NULL,
  `gid` int(11) default NULL,
  PRIMARY KEY  (`cid`),
  KEY `FK_goods_collect` (`gid`),
  KEY `FK_user_collect` (`uid`),
  CONSTRAINT `FK_goods_collect` FOREIGN KEY (`gid`) REFERENCES `goods` (`gid`),
  CONSTRAINT `FK_user_collect` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES ('1', 'zpf@126.com', '27');
INSERT INTO `collect` VALUES ('2', 'zpf@126.com', '42');
INSERT INTO `collect` VALUES ('3', 'zpf@126.com', '44');
INSERT INTO `collect` VALUES ('4', 'zpf@126.com', '41');

-- ----------------------------
-- Table structure for evaluate
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate` (
  `eid` int(11) NOT NULL auto_increment,
  `gid` int(11) default NULL,
  `uid` varchar(50) default NULL,
  `etext` varchar(3000) default NULL,
  `etime` datetime default NULL,
  PRIMARY KEY  (`eid`),
  KEY `FK_goods_evaluete` (`gid`),
  KEY `FK_user_evaluete` (`uid`),
  CONSTRAINT `FK_goods_evaluete` FOREIGN KEY (`gid`) REFERENCES `goods` (`gid`),
  CONSTRAINT `FK_user_evaluete` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of evaluate
-- ----------------------------
INSERT INTO `evaluate` VALUES ('6', '27', 'zpf@126.com', '<p>这个包包很不错，很喜欢！</p>\r\n', '2014-07-16 04:23:33');
INSERT INTO `evaluate` VALUES ('7', '27', 'zpf@126.com', '<p>我很喜欢！</p>\r\n', '2014-07-16 04:42:03');

-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `fid` int(50) NOT NULL auto_increment,
  `uid` varchar(50) default NULL,
  `ftext` varchar(2000) default NULL,
  `ftime` datetime default NULL,
  `ftype` varchar(200) default NULL,
  `fphone` varchar(200) default NULL,
  `fQQ` varchar(200) default NULL,
  `femail` varchar(200) default NULL,
  `fwang` varchar(200) default NULL,
  PRIMARY KEY  (`fid`),
  KEY `FK_user_feedback` (`uid`),
  CONSTRAINT `FK_user_feedback` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES ('3', 'zpf@126.com', '我买的包有色差', '2014-07-16 03:49:25', '售后问题', '15548372398', '1123456787', 'nini@126.com', 'wang12345');
INSERT INTO `feedback` VALUES ('4', 'zpf@126.com', '这个产品怎么样，一直想买，但是不知道质量是否有保障？', '2014-07-16 03:56:36', '产品咨询', '15623457654', '23456543243', '123@126.com', 'wang12347');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `gid` int(11) NOT NULL auto_increment,
  `gtid` int(11) default NULL,
  `gname` varchar(200) NOT NULL,
  `gnumber` int(11) NOT NULL,
  `gtext` mediumtext,
  `gaddress` varchar(200) default NULL,
  `gprice` float default NULL,
  `gimage` varchar(255) default NULL,
  PRIMARY KEY  (`gid`),
  KEY `FK_goods_goodstype` (`gtid`),
  CONSTRAINT `FK_goods_goodstype` FOREIGN KEY (`gtid`) REFERENCES `goodstype` (`gtid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('27', '1', '[戈尔本]睿智风采系列时尚牛皮两用包 黑色', '12', '适合于青年人的一款流行包', '天津', '123', 'images/20140716010957.jpg');
INSERT INTO `goods` VALUES ('28', '1', '	[朗迪威]体验非凡系列男士手提/斜挎包 啡', '34', '北京出品，必属精品！', '北京', '390', 'images/20140716011246.jpg');
INSERT INTO `goods` VALUES ('29', '2', '[DUDU]双链系列牛皮手提/斜挎包 驼色（奶咖色...', '45', '邯郸的包哦！', '河北邯郸', '250', 'images/20140716011650.jpg');
INSERT INTO `goods` VALUES ('30', '2', '	[哈森]极简复古系列箱型手提斜跨包 芥末黄（姜黄色...', '45', '这个包包很好，值得大家购买！', '河南安阳', '654', 'images/20140716012014.jpg');
INSERT INTO `goods` VALUES ('31', '2', '	[浪美]月光女神系列牛皮配料斜挎包 驼色（奶咖色）', '54', '这款包包适合于中年女士！', '福建', '6543', 'images/20140716012301.jpg');
INSERT INTO `goods` VALUES ('32', '2', '	[阿尔法·阿蒂斯特]埃菲尔之恋系列手提/斜挎包 白...', '65', '此包很好', '厦门', '532', 'images/20140716012743.jpg');
INSERT INTO `goods` VALUES ('33', '2', '[卡文]清新海军风系列单肩斜挎包 肉粉色', '453', '适合青年女性外出休闲', '山东', '765', 'images/20140716012934.jpg');
INSERT INTO `goods` VALUES ('34', '2', '	[梵贝斯]不莱梅音樂家系列-素雅大方气质单肩包 卡...', '54', '高端大气，上档次！', '安徽合肥', '324', 'images/20140716013030.jpg');
INSERT INTO `goods` VALUES ('35', '2', '	[卓妮尔]巴黎风尚系列两用包 粉红色', '7896', '正版香港限量款！', '香港', '545', 'images/20140716013142.jpg');
INSERT INTO `goods` VALUES ('36', '2', '[卓妮尔]青花瓷系列牛皮两用包 蓝色', '65', '方便携带！', '呼伦贝尔', '654', 'images/20140716013334.jpg');
INSERT INTO `goods` VALUES ('37', '1', '[戈尔本]苏格兰系列牛皮手提/斜挎电脑包（12寸）...', '89', '很上档次！', '天津工业大学', '7888', 'images/20140716013945.jpg');
INSERT INTO `goods` VALUES ('38', '1', '苏格兰系列牛皮手提/斜挎电脑包（12寸）...', '899', '大家好才是真的好！', '西藏', '3443', 'images/20140716014035.jpg');
INSERT INTO `goods` VALUES ('39', '1', '[戈尔本]苏格兰系列牛皮手提/斜挎电脑包（12寸）...', '543', '棕色包包！', '234', '893', 'images/20140716014120.jpg');
INSERT INTO `goods` VALUES ('40', '1', '	[朗迪威]深邃幻影系列牛皮钱包 啡', '345', '手包', '福建', '5423', 'images/20140716014255.jpg');
INSERT INTO `goods` VALUES ('41', '1', '	[朗迪威]深邃幻影系列牛皮钱包 啡', '5432', '向换包，就买它', '福建', '2434', 'images/20140716014353.jpg');
INSERT INTO `goods` VALUES ('42', '1', '[戈尔本]城市节拍系列手提斜挎包 棕色（巧克力色）', '784', '像女士包的包！', '福建', '5422', 'images/20140716014446.jpg');
INSERT INTO `goods` VALUES ('43', '1', '[戈尔本]城市节拍系列手提斜挎包 棕色（巧克力色）', '4325', '男包', '福建', '4323', 'images/20140716014735.jpg');
INSERT INTO `goods` VALUES ('44', '1', '[戈尔本]城市节拍系列手提斜挎包 棕色（巧克力色）', '345', '超级限量版', '澳门', '11234', 'images/20140716025848.jpg');

-- ----------------------------
-- Table structure for goodsandorders
-- ----------------------------
DROP TABLE IF EXISTS `goodsandorders`;
CREATE TABLE `goodsandorders` (
  `gid` int(11) NOT NULL,
  `oid` varchar(200) NOT NULL,
  `number` int(11) default NULL,
  PRIMARY KEY  (`gid`,`oid`),
  KEY `FK_goods_orders2` (`oid`),
  CONSTRAINT `FK_goods_orders` FOREIGN KEY (`gid`) REFERENCES `goods` (`gid`),
  CONSTRAINT `FK_goods_orders2` FOREIGN KEY (`oid`) REFERENCES `orders` (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of goodsandorders
-- ----------------------------
INSERT INTO `goodsandorders` VALUES ('27', '040136', '2');
INSERT INTO `goodsandorders` VALUES ('27', '040513', '2');
INSERT INTO `goodsandorders` VALUES ('37', '075508', '1');
INSERT INTO `goodsandorders` VALUES ('42', '040136', '1');
INSERT INTO `goodsandorders` VALUES ('43', '102231', '1');
INSERT INTO `goodsandorders` VALUES ('44', '040513', '1');

-- ----------------------------
-- Table structure for goodsdetail
-- ----------------------------
DROP TABLE IF EXISTS `goodsdetail`;
CREATE TABLE `goodsdetail` (
  `gdid` int(11) NOT NULL auto_increment,
  `gid` int(11) NOT NULL,
  `gdimage` varchar(255) NOT NULL,
  PRIMARY KEY  (`gdid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsdetail
-- ----------------------------

-- ----------------------------
-- Table structure for goodstype
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype` (
  `gtid` int(11) NOT NULL,
  `gtname` varchar(200) default NULL,
  PRIMARY KEY  (`gtid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of goodstype
-- ----------------------------
INSERT INTO `goodstype` VALUES ('1', '男包');
INSERT INTO `goodstype` VALUES ('2', '女包');
INSERT INTO `goodstype` VALUES ('3', '旅行包');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `mid` int(11) NOT NULL,
  `mtext` text NOT NULL,
  `mtime` datetime default NULL,
  PRIMARY KEY  (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` varchar(200) NOT NULL,
  `uid` varchar(50) default NULL,
  `otime` datetime default NULL,
  `opaymenttype` varchar(200) default NULL,
  `ousername` varchar(100) default NULL,
  `oaddress` varchar(200) default NULL,
  `ophone` varchar(50) default NULL,
  `ostatus` varchar(100) character set utf8 default NULL,
  PRIMARY KEY  (`oid`),
  KEY `FK_user_orders` (`uid`),
  CONSTRAINT `FK_user_orders` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('040136', 'zpf@126.com', '2014-07-16 04:01:36', '货到付款', '张鹏飞', '', '', '未发货');
INSERT INTO `orders` VALUES ('040513', 'zpf@126.com', '2014-07-16 04:05:13', '在线支付', '张鹏飞', '天津市', '15622349876', '未发货');
INSERT INTO `orders` VALUES ('075508', 'zpf@126.com', '2014-07-16 07:55:08', '货到付款', '', '', '', '未发货');
INSERT INTO `orders` VALUES ('102231', 'zpf@126.com', '2014-07-17 10:22:31', '货到付款', 'ds', 'ssss', '122', '未发货');

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `qid` int(11) NOT NULL auto_increment,
  `uid` varchar(50) default NULL,
  `gid` int(11) default NULL,
  `qtext` varchar(2000) NOT NULL,
  `qtime` datetime default NULL,
  `qtype` varchar(100) default NULL,
  PRIMARY KEY  (`qid`),
  KEY `FK_goodsAndquestion` (`gid`),
  KEY `FK_user_question` (`uid`),
  CONSTRAINT `FK_goodsAndquestion` FOREIGN KEY (`gid`) REFERENCES `goods` (`gid`),
  CONSTRAINT `FK_user_question` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('3', 'zpf@126.com', '44', '我想要买这个包', '2014-07-16 03:13:28', '售前问题');
INSERT INTO `question` VALUES ('4', 'zpf@126.com', '37', '能用支付宝支付吗？', '2014-07-16 04:47:02', '支付咨询');
INSERT INTO `question` VALUES ('5', 'zpf@126.com', '42', '订单怎么查询？', '2014-07-16 04:51:50', '订单咨询');
INSERT INTO `question` VALUES ('6', 'zpf@126.com', '42', '订单怎么查询？', '2014-07-16 04:53:00', '订单咨询');
INSERT INTO `question` VALUES ('7', 'zpf@126.com', '41', '用顺丰的几天到？', '2014-07-16 05:05:24', '配送快递咨询');
INSERT INTO `question` VALUES ('8', 'zpf@126.com', '41', '用顺丰的几天到？', '2014-07-16 05:06:20', '配送快递咨询');
INSERT INTO `question` VALUES ('9', 'zpf@126.com', '28', '顺风得几天啊', '2014-07-16 05:09:35', '配送快递咨询');

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `rid` int(11) NOT NULL auto_increment,
  `fid` int(11) NOT NULL,
  `aid` varchar(200) NOT NULL,
  `rtext` varchar(3000) default NULL,
  `rtime` datetime default NULL,
  PRIMARY KEY  (`rid`),
  KEY `FK_reply_feedback` (`fid`),
  CONSTRAINT `FK_reply_feedback` FOREIGN KEY (`fid`) REFERENCES `feedback` (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('1', '3', 'aa', '<p>亲爱的用户您好，您的问题我们已经受理，如果你是认为问题，我们会尽快为您调换！</p>\r\n', '2014-07-16 07:04:51');
INSERT INTO `reply` VALUES ('2', '3', 'aa', '<p>亲爱的用户，我们已经核实情况，可能是在邮送的时候造成的，我们会在三天内给您调换</p>\r\n', '2014-07-16 07:07:29');
INSERT INTO `reply` VALUES ('3', '3', 'aa', '<p>请输入dg</p>\r\n', '2014-07-16 08:08:22');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(50) NOT NULL,
  `upass` varchar(100) NOT NULL,
  `usex` varchar(8) default NULL,
  `ubirthday` date default NULL,
  `ustatus` varchar(50) default NULL,
  `uimage` varchar(200) default NULL,
  `uphone` varchar(200) default NULL,
  `uemail` varchar(50) default NULL,
  `uaddress` varchar(100) default NULL,
  `ubeen` int(11) default NULL,
  `upower` int(11) default NULL,
  `unickname` varchar(50) default NULL,
  `uprovince` varchar(50) default NULL,
  `ucity` varchar(50) default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('', '', '男', null, null, null, null, '', null, null, null, null, '0', '0');
INSERT INTO `user` VALUES ('171064296@qq.com', '1234567890', '女', '1993-02-08', '', null, '', '171064296@qq.com', '', '100', '0', null, '4', '1');
INSERT INTO `user` VALUES ('zpf@126.com', '1234567', '男', null, null, null, null, 'zpf@126.com', null, null, null, null, '18', '0');
