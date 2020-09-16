-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pro
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `airlines`
--

DROP TABLE IF EXISTS `airlines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `airlines` (
  `A_Code` int(11) NOT NULL,
  `A_Name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`A_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airlines`
--

LOCK TABLES `airlines` WRITE;
/*!40000 ALTER TABLE `airlines` DISABLE KEYS */;
INSERT INTO `airlines` VALUES (1,'Egypt Airline');
/*!40000 ALTER TABLE `airlines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `airplane`
--

DROP TABLE IF EXISTS `airplane`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `airplane` (
  `Reg_No` int(11) NOT NULL,
  `Airplane_Type` varchar(20) DEFAULT NULL,
  `Seats_Num` int(11) DEFAULT NULL,
  `A_Code` int(11) DEFAULT NULL,
  PRIMARY KEY (`Reg_No`),
  KEY `A_Code` (`A_Code`),
  CONSTRAINT `airplane_ibfk_1` FOREIGN KEY (`A_Code`) REFERENCES `airlines` (`A_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airplane`
--

LOCK TABLES `airplane` WRITE;
/*!40000 ALTER TABLE `airplane` DISABLE KEYS */;
INSERT INTO `airplane` VALUES (320,'Boeing 737-700',20,1),(321,'Airbus A319',35,1),(737,'Airbus A321',30,1),(738,'Boeing 737-800',40,1);
/*!40000 ALTER TABLE `airplane` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `airport`
--

DROP TABLE IF EXISTS `airport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `airport` (
  `Port_Code` int(11) NOT NULL,
  `Port_Name` varchar(20) DEFAULT NULL,
  `Port_Country` varchar(20) DEFAULT NULL,
  `Port_City` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Port_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airport`
--

LOCK TABLES `airport` WRITE;
/*!40000 ALTER TABLE `airport` DISABLE KEYS */;
INSERT INTO `airport` VALUES (2,'Cairo airport','egypt','cairo');
/*!40000 ALTER TABLE `airport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_office`
--

DROP TABLE IF EXISTS `booking_office`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking_office` (
  `Office_Id` int(11) NOT NULL,
  `Office_name` varchar(20) NOT NULL,
  PRIMARY KEY (`Office_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_office`
--

LOCK TABLES `booking_office` WRITE;
/*!40000 ALTER TABLE `booking_office` DISABLE KEYS */;
INSERT INTO `booking_office` VALUES (1,'banha'),(2,'Cairo'),(3,'Alexandria');
/*!40000 ALTER TABLE `booking_office` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight` (
  `Flight_No` int(11) NOT NULL,
  `Class` varchar(20) DEFAULT NULL,
  `FlyFrom` varchar(20) DEFAULT NULL,
  `FlyTo` varchar(20) DEFAULT NULL,
  `Dep_Time` varchar(50) DEFAULT NULL,
  `Dep_Date` varchar(50) DEFAULT NULL,
  `Arr_Time` varchar(50) DEFAULT NULL,
  `Arr_Date` varchar(50) DEFAULT NULL,
  `A_Code` int(11) DEFAULT NULL,
  `seatNo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Flight_No`),
  KEY `A_Code` (`A_Code`),
  CONSTRAINT `flight_ibfk_2` FOREIGN KEY (`A_Code`) REFERENCES `airlines` (`A_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES (1,'First Class','Cairo','Tokyo','01:30 am','07/12/2017','00:30 pm','07/12/2017',1,'30'),(2,'Second Class','Cairo','USA','02:00 am','06/12/2017','08:30 am','06/12/2017',1,'12'),(3,'Third Class','Cairo','USA','00:30 am','06/12/2017','01:30 pm','06/12/2017',1,'30'),(4,'Third Class','Cairo','Dubai','01:30 am','18/01/2018','06:30 am','19/01/2018',1,'25'),(5,'First Class','Cairo','Tokyo','01:30 am','10/01/2018','02:30 am','10/01/2018',1,'5'),(6,'First Class','Cairo','Paris','02:00 pm','31/01/2018','03:30 pm','31/01/2018',1,'20'),(7,'First Class','Cairo','London','05:00 am','24/01/2018','06:30 am','24/01/2018',1,'30');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lands_on`
--

DROP TABLE IF EXISTS `lands_on`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lands_on` (
  `Reg_No` int(11) DEFAULT NULL,
  `Port_Code` int(11) DEFAULT NULL,
  KEY `Reg_No` (`Reg_No`),
  KEY `Port_Code` (`Port_Code`),
  CONSTRAINT `lands_on_ibfk_1` FOREIGN KEY (`Reg_No`) REFERENCES `airplane` (`Reg_No`),
  CONSTRAINT `lands_on_ibfk_2` FOREIGN KEY (`Port_Code`) REFERENCES `airport` (`Port_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lands_on`
--

LOCK TABLES `lands_on` WRITE;
/*!40000 ALTER TABLE `lands_on` DISABLE KEYS */;
INSERT INTO `lands_on` VALUES (738,2),(321,2),(737,2),(320,2);
/*!40000 ALTER TABLE `lands_on` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passenger` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `P_name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `Adress` varchar(30) NOT NULL,
  `contact` int(11) NOT NULL,
  `e_mail` varchar(20) DEFAULT NULL,
  `Office_id` int(11) DEFAULT NULL,
  `Flight_No` int(11) DEFAULT NULL,
  `Fare_Type` varchar(45) DEFAULT NULL,
  `Fare_Des` int(11) DEFAULT NULL,
  `Cheque/Visa No` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Office_id` (`Office_id`),
  KEY `Flight_No` (`Flight_No`),
  CONSTRAINT `passenger_ibfk_1` FOREIGN KEY (`Office_id`) REFERENCES `booking_office` (`Office_Id`),
  CONSTRAINT `passenger_ibfk_2` FOREIGN KEY (`Flight_No`) REFERENCES `flight` (`Flight_No`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES (5,'Mostafa Salem',20,'male','Banha_Taba',1153284612,'Hyhuo@yahoo.com',1,1,'Cheque',4000,'2065525'),(8,'sadsg',1,'male','sagsagsdg',23234234,'aagag',1,1,'Cash',14124,NULL);
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'pro'
--

--
-- Dumping routines for database 'pro'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-14 23:32:11
