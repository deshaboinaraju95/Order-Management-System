-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: oms
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `credit_card_info`
--

DROP TABLE IF EXISTS `credit_card_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `credit_card_info` (
  `cradit_card_id` bigint NOT NULL,
  `expired_month` int NOT NULL,
  `expired_year` int NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `security_code` int NOT NULL,
  PRIMARY KEY (`cradit_card_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_card_info`
--

LOCK TABLES `credit_card_info` WRITE;
/*!40000 ALTER TABLE `credit_card_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `credit_card_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `location_id` bigint NOT NULL,
  `mobile_number` bigint DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `logitude` double DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zipcode` int DEFAULT NULL,
  `restaurant_fk_id` bigint DEFAULT NULL,
  `user_fk_id` bigint DEFAULT NULL,
  PRIMARY KEY (`location_id`),
  KEY `FKa5q63tislp3k81uk7qp8xok4v` (`restaurant_fk_id`),
  KEY `FK1a3sijoyy7catwrkl7b0lcosp` (`user_fk_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,4066522577,'Hyderabad Marriott Hotel & Convention Centre, Ground Hyderabad Marriott Hotel & Convention Centre Hussain Sagar Lake, Tank Bund Rd','Secunderabad',17.424536486294187,78.48716369819783,'Telangana',500080,1,NULL),(2,4066683337,'5th Floor, City Center Mall, Road 1, Banjara Hills','Hyderabad',17.41534231669782,78.44866363551046,'Telangana',500034,2,NULL),(3,4040081815,'6 -3 -1187, Teachers Colony, Greenlands, Begumpet','Hyderabad',17.457555049522647,78.46894456292664,'Telangana',500016,3,NULL),(4,9553628837,'1-87,redla repaka,valigonda','nalgonda',17.399642886944154,78.9913633007499,'Telangana',508285,NULL,1),(5,9010906533,'2-55,hanmakoda','warangal',17.982671184573913,79.59613050034577,'Telangana',506001,NULL,2),(6,7287006533,'2-20,manerudam','karimnagar',18.401430030573557,79.14321395357584,'Telangana',506330,NULL,3);
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `menu_id` bigint NOT NULL,
  `info` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'morning','tiffen'),(2,'afternoon and night','veg'),(3,'night','non-veg');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_item`
--

DROP TABLE IF EXISTS `menu_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu_item` (
  `menu_itemid` bigint NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`menu_itemid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_item`
--

LOCK TABLES `menu_item` WRITE;
/*!40000 ALTER TABLE `menu_item` DISABLE KEYS */;
INSERT INTO `menu_item` VALUES (1,NULL,'tamilspl','idle',20),(2,NULL,'indain spl','dosa',35),(3,NULL,'hyd spl','vada',25),(4,NULL,'hydspl','chikenbirayi',120),(5,NULL,'mumbaispl','mutton birayni',220),(6,NULL,'telugu peoples spl','veg-birayi',100);
/*!40000 ALTER TABLE `menu_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_menu_item`
--

DROP TABLE IF EXISTS `menu_menu_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu_menu_item` (
  `menu_fkid` bigint NOT NULL,
  `menuitem_fkid` bigint NOT NULL,
  KEY `FKt5vj0vhwxhhmdhyfx2wf65lab` (`menuitem_fkid`),
  KEY `FK81rlxekttt888r342g8ot8qem` (`menu_fkid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_menu_item`
--

LOCK TABLES `menu_menu_item` WRITE;
/*!40000 ALTER TABLE `menu_menu_item` DISABLE KEYS */;
INSERT INTO `menu_menu_item` VALUES (1,2),(1,1),(1,3),(2,6),(3,4),(3,5);
/*!40000 ALTER TABLE `menu_menu_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_menu_item`
--

DROP TABLE IF EXISTS `order_menu_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_menu_item` (
  `order_fkid` bigint NOT NULL,
  `menuitem_fkid` bigint NOT NULL,
  KEY `FK503vg649pgsim4ptgc1ph5da7` (`menuitem_fkid`),
  KEY `FKrb846yvl8yig6my38tv0qmihr` (`order_fkid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_menu_item`
--

LOCK TABLES `order_menu_item` WRITE;
/*!40000 ALTER TABLE `order_menu_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_menu_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orderid` bigint NOT NULL,
  `creation_time` datetime DEFAULT NULL,
  `last_modify_time` datetime DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `order_status` int DEFAULT NULL,
  `total_cost` double NOT NULL,
  `payment_fk_id` bigint DEFAULT NULL,
  `user_fkid` bigint DEFAULT NULL,
  PRIMARY KEY (`orderid`),
  KEY `FKqdr3rq43k34c8x48lkgchhxwp` (`payment_fk_id`),
  KEY `FKe1ovenv92n0m0ti3stqejntb9` (`user_fkid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `paymentid` bigint NOT NULL,
  `amount` int NOT NULL,
  `timestamp` bigint NOT NULL,
  PRIMARY KEY (`paymentid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `restaurant` (
  `restaurant_id` bigint NOT NULL,
  `restaurant_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`restaurant_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,'Bidri'),(2,'Sahib Sindh Sultan'),(3,'Kebabs & Kurries, ITC Kakatiya');
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant_menu`
--

DROP TABLE IF EXISTS `restaurant_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `restaurant_menu` (
  `rastaurant_fkid` bigint NOT NULL,
  `menu_fkid` bigint NOT NULL,
  KEY `FKcme9f6nxmg1mkffog56wwjo95` (`menu_fkid`),
  KEY `FKrxyyjywt6hcvxoi22gmeokonm` (`rastaurant_fkid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant_menu`
--

LOCK TABLES `restaurant_menu` WRITE;
/*!40000 ALTER TABLE `restaurant_menu` DISABLE KEYS */;
INSERT INTO `restaurant_menu` VALUES (1,1),(1,2),(2,1),(2,2),(2,3),(3,3);
/*!40000 ALTER TABLE `restaurant_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` bigint NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'raju'),(2,'srikanth'),(3,'divya');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-24 11:33:59
