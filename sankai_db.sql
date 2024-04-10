CREATE DATABASE  IF NOT EXISTS `sankai` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sankai`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: sankai
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer` bigint DEFAULT NULL,
  `tablenum` int DEFAULT NULL,
  `product` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (10,1712026484231,1,11,1,0),(11,1712026484231,2,22,2,0),(12,1712026484231,3,33,3,0),(13,1712027051454,56,2,2,0),(14,1712027051454,56,3,1,0),(15,1712027188492,456,12,2,0),(16,1712027188492,456,11,1,0),(17,1712027188492,456,10,1,0),(18,1712027188492,456,2,1,0),(19,1712027188492,456,8,1,0),(20,1712027188492,456,9,2,0),(21,1712033656618,7,2,2,0),(22,1712033656618,7,3,1,0),(23,1712033656618,7,4,1,0),(24,1712033656618,7,12,1,0),(25,1712033656618,7,13,1,0),(26,1712033656618,7,15,1,0);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `detail` varchar(45) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `url` varchar(45) DEFAULT NULL,
  `category` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'山海定食','白蝦、白身魚、雞肉、半熟蛋、季節蔬菜3品',350,'101.png',1),(2,'野菜天麩羅定食','蔬菜什錦、季節蔬菜5品',310,'102.png',1),(3,'炸蝦天麩羅定食','大草蝦、白蝦2隻、蝦仁什錦、季節蔬菜3品',420,'103.png',1),(4,'山之幸定食','雞肉、雞腿肉、豬肉、半熟蛋、季節蔬菜3品',350,'104.png',1),(5,'海之幸定食','海鰻、大草蝦、魷魚、白身魚、北海道干貝、季節蔬菜2品',540,'105.png',1),(6,'博多天麩羅丼','白蝦、白身魚、雞肉、半熟蛋、季節蔬菜3品',350,'201.png',2),(7,'炸蝦天麩羅丼','白蝦4隻、季節蔬菜3品',410,'202.png',2),(8,'海之幸天麩羅丼','海鰻、白蝦、魷魚、白身魚、北海道干貝、季節蔬菜2品',510,'203.png',2),(9,'雞肉天麩羅丼','雞胸肉2品、雞腿肉、半熟蛋、季節蔬菜3品',350,'204.png',2),(10,'大蝦',NULL,180,NULL,3),(11,'海鰻',NULL,200,NULL,3),(12,'鴨肉',NULL,80,NULL,3),(13,'蝦仁什錦天麩羅',NULL,80,NULL,3),(14,'草蝦',NULL,80,NULL,3),(15,'北海道干貝',NULL,80,NULL,3),(16,'蘆筍',NULL,60,NULL,3),(17,'半熟蛋',NULL,50,NULL,3),(18,'豬肉',NULL,50,NULL,3),(19,'白身魚',NULL,50,NULL,3),(20,'魷魚',NULL,50,NULL,3),(21,'雞肉',NULL,50,NULL,3),(22,'四季豆',NULL,40,NULL,3),(23,'栗子南瓜',NULL,40,NULL,3),(24,'香菇',NULL,40,NULL,3),(25,'茄子',NULL,40,NULL,3),(26,'牛蒡',NULL,40,NULL,3),(27,'洋蔥',NULL,40,NULL,3),(28,'青椒',NULL,40,NULL,3),(29,'地瓜',NULL,40,NULL,3),(30,'糯米椒',NULL,40,NULL,3),(31,'TEST',NULL,NULL,NULL,0),(32,'TEST',NULL,NULL,NULL,-5);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-10 11:20:39
