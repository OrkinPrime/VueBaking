-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: baking
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_banner`
--

DROP TABLE IF EXISTS `t_banner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_banner` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `img_url` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sort` int NOT NULL COMMENT '排序',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='编码表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_banner`
--

LOCK TABLES `t_banner` WRITE;
/*!40000 ALTER TABLE `t_banner` DISABLE KEYS */;
INSERT INTO `t_banner` VALUES (1,'/imgs/banner1.jpg',1,'2023-02-08 14:29:44'),(2,'/imgs/banner2.jpg',2,'2023-02-08 14:29:44'),(3,'/imgs/banner3.jpg',3,'2023-02-08 14:29:44');
/*!40000 ALTER TABLE `t_banner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_category`
--

DROP TABLE IF EXISTS `t_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '类别名',
  `level` int NOT NULL COMMENT '级别',
  `parent_id` int NOT NULL COMMENT '父类级别',
  `type` int NOT NULL COMMENT '类型',
  `sort` int NOT NULL COMMENT '排序',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='类别表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_category`
--

LOCK TABLES `t_category` WRITE;
/*!40000 ALTER TABLE `t_category` DISABLE KEYS */;
INSERT INTO `t_category` VALUES (1,'烘培食谱',1,0,1,1,'2023-02-07 13:39:05'),(2,'面包',2,1,1,1,'2023-02-07 13:39:05'),(3,'家常菜',2,1,1,2,'2023-02-07 13:39:05'),(4,'小食',2,1,1,3,'2023-02-07 13:39:05'),(5,'烘培视频',1,0,2,2,'2023-02-07 13:39:05'),(6,'家常菜教学',2,5,2,1,'2023-02-07 13:39:05'),(7,'美食欣赏',2,5,2,2,'2023-02-07 13:39:05'),(8,'资讯',1,0,3,1,'2023-02-07 13:39:05'),(9,'美食资讯',2,8,3,1,'2023-02-07 13:39:05'),(10,'店家资讯',2,8,3,2,'2023-02-07 13:39:05');
/*!40000 ALTER TABLE `t_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_comment`
--

DROP TABLE IF EXISTS `t_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_comment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `content` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '评论内容',
  `user_id` bigint NOT NULL COMMENT '评论用户ID',
  `content_id` int NOT NULL COMMENT '评论内容ID',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_comment`
--

LOCK TABLES `t_comment` WRITE;
/*!40000 ALTER TABLE `t_comment` DISABLE KEYS */;
INSERT INTO `t_comment` VALUES (2,'评论内容',1,2,'2023-02-08 16:00:45'),(3,'太好玩了',2,2,'2023-02-08 16:02:32'),(4,'sss',1,2,'2023-02-08 16:54:16'),(5,'sss',1,2,'2023-02-08 16:56:02'),(6,'1111111',7,4,'2023-02-10 17:25:53'),(7,'1111111',7,4,'2023-02-10 17:38:11'),(8,'1111',7,7,'2023-02-13 15:53:03'),(9,'222',7,7,'2023-02-13 15:53:18'),(10,'2222',7,5,'2023-02-13 16:42:56'),(11,'1',10,3,'2023-02-14 11:33:57'),(12,'222',10,5,'2023-02-14 11:44:12'),(13,'333',10,4,'2023-02-14 11:55:14'),(14,'111',10,4,'2023-02-14 14:01:41'),(15,'111',8,11,'2023-02-14 16:18:51'),(16,'222',8,11,'2023-02-14 16:18:55'),(17,'111',8,4,'2023-02-14 16:19:52'),(18,'111',10,12,'2023-02-14 16:50:46'),(19,'222',10,13,'2023-02-14 16:51:05'),(20,'ccc',10,11,'2023-02-14 16:51:46'),(21,'222',8,12,'2023-02-14 17:10:19'),(22,'333',8,12,'2023-02-14 17:10:52'),(23,'看起来挺好吃',12,18,'2023-03-30 16:12:27'),(24,'agd',12,22,'2023-03-30 16:34:07'),(25,'agd',12,22,'2023-03-30 16:34:18'),(26,'自己做了一遍,还不错!!',12,18,'2023-03-30 16:51:02'),(27,'还不错',12,17,'2023-03-30 17:02:51'),(28,'aaa',12,26,'2023-03-31 02:13:11'),(29,'ddd',12,26,'2023-05-11 20:28:03'),(30,'aaa',17,18,'2023-05-26 09:17:14'),(31,'hello',12,1,'2023-11-20 14:45:46'),(32,'我是小帅',12,1,'2023-11-20 15:08:04');
/*!40000 ALTER TABLE `t_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_content`
--

DROP TABLE IF EXISTS `t_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_content` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '标题',
  `img_url` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '封面图片地址',
  `video_url` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '视频地址',
  `content` text COLLATE utf8mb4_general_ci COMMENT '内容html样式',
  `type` bigint NOT NULL COMMENT '一级类型(视频/食谱/资讯）',
  `view_count` int DEFAULT '0' COMMENT '浏览量',
  `comment_count` int DEFAULT '0' COMMENT '评论量',
  `create_by` bigint DEFAULT NULL COMMENT '创建者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_by` bigint DEFAULT NULL COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `brief` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `category_id` bigint DEFAULT NULL COMMENT '发布的二级类别(面包小食)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='内容表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_content`
--

LOCK TABLES `t_content` WRITE;
/*!40000 ALTER TABLE `t_content` DISABLE KEYS */;
INSERT INTO `t_content` VALUES (1,'hello1','/2023/11/19/3ab5b57e-e333-4cb9-b470-10d032be8d29.png',NULL,'<p><em>英雄联盟官方网站</em>,海量风格各异的英雄,丰富、便捷的物品合成系统,游戏内置的匹配、排行和竞技系统,独创的“召唤师”系统及技能、符文、天赋等系统组合,必将带你进入一个崭新而又丰富多彩的游戏世...</p><p><a href=\"http://www.baidu.com/link?url=zpkz_fcFqMxkWm292u_0Xu0dK56WqcEni_SBojcIe_Eids2IsFcHnST8thEN6TFTKdrdEkbeUa_dw7K94awAbJSdLuo8hIJZfDkd4BKqy6HfcCkJr3KX35GNVB9ir4QIFsr3l1jXqZb00rroboYmgWCpv6OAiTYH3Pt2mcs2TR-cLwm6Y96DhQCkslRqmgpSj8oE6iPViwD9BdDsP03zI7YlKP6w2ZbCJ12BJq1snLu\" target=\"_blank\">英雄联盟</a></p>',1,8,0,12,'2023-11-19 14:17:16',NULL,NULL,'英雄联盟官方网站,海量风格各异的英雄,丰富、便捷的物品合成系',2),(2,'hello2','/2023/11/19/876d6593-5b9e-4054-b132-8e4dad757495.png',NULL,'<p><em>英雄联盟官方网站</em>,海量风格各异的英雄,丰富、便捷的物品合成系统,游戏内置的匹配、排行和竞技系统,独创的“召唤师”系统及技能、符文、天赋等系统组合,必将带你进入一个崭新而又丰富多彩的游戏世...</p><p><a href=\"http://www.baidu.com/link?url=zpkz_fcFqMxkWm292u_0Xu0dK56WqcEni_SBojcIe_Eids2IsFcHnST8thEN6TFTKdrdEkbeUa_dw7K94awAbJSdLuo8hIJZfDkd4BKqy6HfcCkJr3KX35GNVB9ir4QIFsr3l1jXqZb00rroboYmgWCpv6OAiTYH3Pt2mcs2TR-cLwm6Y96DhQCkslRqmgpSj8oE6iPViwD9BdDsP03zI7YlKP6w2ZbCJ12BJq1snLu\" target=\"_blank\">英雄联盟</a></p>',1,0,0,12,'2023-11-19 14:17:35',NULL,NULL,'英雄联盟官方网站,海量风格各异的英雄,丰富、便捷的物品合成系',3),(4,'hello4','/2023/11/19/28cd068c-f39a-49f7-bf78-dbfd0cf85d80.png',NULL,'<p><em>英雄联盟官方网站</em>,海量风格各异的英雄,丰富、便捷的物品合成系统,游戏内置的匹配、排行和竞技系统,独创的“召唤师”系统及技能、符文、天赋等系统组合,必将带你进入一个崭新而又丰富多彩的游戏世...</p><p><a href=\"http://www.baidu.com/link?url=zpkz_fcFqMxkWm292u_0Xu0dK56WqcEni_SBojcIe_Eids2IsFcHnST8thEN6TFTKdrdEkbeUa_dw7K94awAbJSdLuo8hIJZfDkd4BKqy6HfcCkJr3KX35GNVB9ir4QIFsr3l1jXqZb00rroboYmgWCpv6OAiTYH3Pt2mcs2TR-cLwm6Y96DhQCkslRqmgpSj8oE6iPViwD9BdDsP03zI7YlKP6w2ZbCJ12BJq1snLu\" target=\"_blank\">英雄联盟</a></p>',3,5,0,12,'2023-11-19 14:18:41',NULL,NULL,'英雄联盟官方网站,海量风格各异的英雄,丰富、便捷的物品合成系',9),(5,'hello5','/2023/11/19/1f11ff1a-4302-48df-9ba6-c38ac9b3e379.png',NULL,'<p>百香果的酸味比较强，食用时可以直接切开，然后用勺子吃瓤和籽。如果觉得味道比较酸，可以在里边加水，或者掏出以后加一点蜂蜜，这样比较营养可口。百香果还可以配合饮料一起喝，比如将百香果打开以后掏出籽跟瓤，然后加入饮料。百香果切开以后晾晒干或者是烘干，然后沏茶喝也很推荐。另外百香果还可以提味，如果家里要煮肉、煲汤，可以把它切成块或丝，放入锅中提味<br/></p>',1,3,0,12,'2023-11-19 14:48:26',NULL,NULL,'百香果的酸味比较强，食用时可以直接切开，然后用勺子吃瓤和籽。',3),(6,'hello6','/2023/11/19/a606dea3-16bc-4166-ba3a-53e793e7ef35.png',NULL,'<p>百香果的酸味比较强，食用时可以直接切开，然后用勺子吃瓤和籽。如果觉得味道比较酸，可以在里边加水，或者掏出以后加一点蜂蜜，这样比较营养可口。百香果还可以配合饮料一起喝，比如将百香果打开以后掏出籽跟瓤，然后加入饮料。百香果切开以后晾晒干或者是烘干，然后沏茶喝也很推荐。另外百香果还可以提味，如果家里要煮肉、煲汤，可以把它切成块或丝，放入锅中提味<br/></p>',1,5,0,12,'2023-11-19 14:48:43',NULL,NULL,'百香果的酸味比较强，食用时可以直接切开，然后用勺子吃瓤和籽。',3),(7,'hello7','/2023/11/19/3d77a63f-fc6d-4f4d-9119-79110577c1a4.png',NULL,'<p>百香果的酸味比较强，食用时可以直接切开，然后用勺子吃瓤和籽。如果觉得味道比较酸，可以在里边加水，或者掏出以后加一点蜂蜜，这样比较营养可口。百香果还可以配合饮料一起喝，比如将百香果打开以后掏出籽跟瓤，然后加入饮料。百香果切开以后晾晒干或者是烘干，然后沏茶喝也很推荐。另外百香果还可以提味，如果家里要煮肉、煲汤，可以把它切成块或丝，放入锅中提味<br/></p>',1,11,0,12,'2023-11-19 14:48:58',NULL,NULL,'百香果的酸味比较强，食用时可以直接切开，然后用勺子吃瓤和籽。',4);
/*!40000 ALTER TABLE `t_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `nickname` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '昵称',
  `password` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `is_admin` int DEFAULT NULL COMMENT '是否是管理员',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `img_url` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `un_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (7,'abc','abcd','abcd',0,'2023-02-10 14:24:17','https://120.46.197.40/images/1676341662489icon-32.jpg'),(8,'永辉','aaa3','$2a$10$I/bybdjEUwJJt0CAMArzr.RZOoJsotdiDVrCQTtiiMU08kHS8sHDK',0,'2023-02-13 15:08:21','https://120.46.197.40/images/1676341924802icon-32.jpg'),(12,'tom','汤姆10','123456',1,'2023-03-31 00:43:52','/2023/11/18/92788de1-b586-4f29-acbe-3069225caaae.png'),(17,'jerry','杰瑞','$2a$10$u5uhWhjE8Md8DklQXlPKA.XaRqy6913h2DYaL9mUaLviJIxz96lk6',0,'2023-05-11 20:40:44','/2023/05/11/8382eddf-4071-45b4-91b2-ac7eadcb72e2.jpg'),(18,'tom02','老猫','123456',1,'2023-11-16 14:59:42',NULL),(19,'YF','123456','123456',0,'2023-11-23 15:01:09',NULL);
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-14 15:18:19
