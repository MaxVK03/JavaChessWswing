-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.19 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping structure for table chessdbpat.gamedata_csv
CREATE TABLE IF NOT EXISTS `gamedata_csv` (
  `Game_ID` int DEFAULT NULL,
  `Player_ID` int DEFAULT NULL,
  `Move_number` int DEFAULT NULL,
  `Move` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `GameMoveID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`GameMoveID`)
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table chessdbpat.gamestatsdata_csv
CREATE TABLE IF NOT EXISTS `gamestatsdata_csv` (
  `Player_1_ID` int DEFAULT NULL,
  `Player_2_ID` int DEFAULT NULL,
  `Winner_ID` int DEFAULT NULL,
  `Game_Moves` int DEFAULT NULL,
  `EndType` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `GameID` int NOT NULL AUTO_INCREMENT,
  KEY `GameID` (`GameID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

-- Dumping structure for table chessdbpat.playerdata_csv
CREATE TABLE IF NOT EXISTS `playerdata_csv` (
  `Player_name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `DOB` text,
  `Wins` int DEFAULT NULL,
  `Losses` int DEFAULT NULL,
  `Draws` int DEFAULT NULL,
  `PlayerID` int NOT NULL AUTO_INCREMENT,
  KEY `PlayerID` (`PlayerID`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
