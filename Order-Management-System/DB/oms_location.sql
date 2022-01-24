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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-24 10:08:38
