/*
 Navicat Premium Data Transfer

 Source Server         : 本机127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : 127.0.0.1:3306
 Source Schema         : seata_at_account

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 23/07/2023 15:46:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `account_money` double NULL DEFAULT NULL COMMENT '账户余额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES (1, '张三', 1000);

SET FOREIGN_KEY_CHECKS = 1;
