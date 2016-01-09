-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2016 年 01 月 09 日 04:34
-- 服务器版本: 5.6.13
-- PHP 版本: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `b2c`
--
CREATE DATABASE IF NOT EXISTS `b2c` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `b2c`;

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '流水號',
  `acc` varchar(10) NOT NULL COMMENT '帳號',
  `pwd` varchar(10) NOT NULL COMMENT '密碼',
  `cname` varchar(128) NOT NULL COMMENT '玩家暱稱',
  `login_date` varchar(20) DEFAULT NULL COMMENT '最後登入時間',
  `reg_date` varchar(20) DEFAULT NULL COMMENT '註冊時間',
  `mail` varchar(128) DEFAULT NULL COMMENT '玩家信箱',
  `role` varchar(10) DEFAULT NULL COMMENT '使用者階級',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userid_2` (`acc`),
  UNIQUE KEY `id` (`id`),
  KEY `userid` (`acc`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`id`, `acc`, `pwd`, `cname`, `login_date`, `reg_date`, `mail`, `role`) VALUES
(2, '1065568676', '', 'Shiue-yang Shiau', '2015-12-31 16:12:16', '2015-12-31 15:34:00', NULL, '0');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
