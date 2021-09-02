CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 8.0.26, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `SubCategoria`
--

DROP TABLE IF EXISTS `SubCategoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SubCategoria` (
  `idSubCategoria` int NOT NULL AUTO_INCREMENT,
  `Desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSubCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SubCategoria`
--

LOCK TABLES `SubCategoria` WRITE;
/*!40000 ALTER TABLE `SubCategoria` DISABLE KEYS */;
INSERT INTO `SubCategoria` VALUES (1,'Plantas exóticas'),(2,'Invernaderos'),(3,'Jardineras'),(4,'Árboles Frutales'),(5,'Árboles Bonsai'),(6,'Comida Intenacional'),(7,'Comida Casera'),(8,'Ingedientes de primera calidad'),(9,'Ingredientes organicos y frescos'),(10,'Platillos exóticos'),(11,'Muebles de jardín'),(12,'Estructuras metálicas generales'),(13,'Soldadura Smaw'),(14,'Soldadura Microalambre'),(15,'Cortadora de plasma'),(16,'Castillos y trabes'),(17,'Colados'),(18,'Muros'),(19,'Estructuras pequeñas'),(20,'Bardas'),(21,'Fregaderos'),(22,'Lavabos'),(23,'Tuberías tapadas'),(24,'Caños atascados'),(25,'Instalaciones sanitarias'),(26,'Muebles domésticos'),(27,'Estructurtas exteriores'),(28,'Cobertizos'),(29,'Barnices y pulidos'),(30,'Juguetes de madera');
/*!40000 ALTER TABLE `SubCategoria` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-01 18:52:47
