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
-- Table structure for table `Publicaciones`
--

DROP TABLE IF EXISTS `Publicaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Publicaciones` (
  `idPublicaciones` int NOT NULL AUTO_INCREMENT,
  `nombre_trabajo` varchar(60) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `precio final` double DEFAULT NULL,
  `Estatus_trabajo` varchar(45) DEFAULT NULL,
  `id_cliente` int NOT NULL,
  `id_ubicacion` int NOT NULL,
  `id_trabajador` int DEFAULT NULL,
  PRIMARY KEY (`idPublicaciones`),
  KEY `id_cliente_idx` (`id_cliente`),
  KEY `id_ubicacion_idx` (`id_ubicacion`),
  CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `Usuarios` (`idUsuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Publicaciones`
--

LOCK TABLES `Publicaciones` WRITE;
/*!40000 ALTER TABLE `Publicaciones` DISABLE KEYS */;
INSERT INTO `Publicaciones` VALUES (1,'Requiero albañil','Albañil calificado para realizar obra en una empresa',2000,'Por realizar',1,2,2),(2,'Requiero jardinero','Jardinero calificado para realizar trabajo de jardin',2000,'Por realizar',3,2,NULL),(3,'Requiero cocinero','Cocinero calificado para evento por privado',4000,'Por realizar',4,2,NULL),(4,'Requiero plomero','Plomero calificado para realizar destapar caño',500,'Por realizar',1,2,NULL),(5,'Requiero jardinero','Jardinero calificado para realizar poder el cesped',700,'Por realizar',3,2,NULL);
/*!40000 ALTER TABLE `Publicaciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-01 18:52:48
