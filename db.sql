

-- AnneeScolaire

CREATE TABLE `AnneeScolaire`
(
 `Id` int NOT NULL AUTO_INCREMENT ,

PRIMARY KEY (`Id`)
);

-- Trimestre

CREATE TABLE `Trimestre`
(
 `Id`     int NOT NULL AUTO_INCREMENT ,
 `Numero` int NOT NULL ,
 `debut`  int NOT NULL ,
 `fin`    int NOT NULL ,
 `#IdAS`  int NOT NULL ,

PRIMARY KEY (`Id`),
KEY `fkIdx_54` (`#IdAS`),
CONSTRAINT `FK_54` FOREIGN KEY `fkIdx_54` (`#IdAS`) REFERENCES `AnneeScolaire` (`Id`)
);

-- Discipline

CREATE TABLE `Discipline`
(
 `Id`  int NOT NULL AUTO_INCREMENT ,
 `Nom` varchar(45) NOT NULL ,

PRIMARY KEY (`Id`)
);


-- Ecole

CREATE TABLE `Ecole`
(
 `Id`  int NOT NULL AUTO_INCREMENT ,
 `Nom` varchar(45) NOT NULL ,

PRIMARY KEY (`Id`)
);

-- Niveau

CREATE TABLE `Niveau`
(
 `Id`  int NOT NULL AUTO_INCREMENT ,
 `Nom` varchar(45) NOT NULL ,

PRIMARY KEY (`Id`)
);



-- Classe

CREATE TABLE `Classe`
(
 `Id`    int NOT NULL AUTO_INCREMENT ,
 `#IdAS` int NOT NULL ,
 `Nom`   varchar(45) NOT NULL ,
 `#IdE`  int NOT NULL ,
 `#IdN`  int NOT NULL ,

PRIMARY KEY (`Id`),
KEY `fkIdx_57` (`#IdAS`),
CONSTRAINT `FK_57` FOREIGN KEY `fkIdx_57` (`#IdAS`) REFERENCES `AnneeScolaire` (`Id`),
KEY `fkIdx_60` (`#IdE`),
CONSTRAINT `FK_60` FOREIGN KEY `fkIdx_60` (`#IdE`) REFERENCES `Ecole` (`Id`),
KEY `fkIdx_63` (`#IdN`),
CONSTRAINT `FK_63` FOREIGN KEY `fkIdx_63` (`#IdN`) REFERENCES `Niveau` (`Id`)
);




-- Personne

CREATE TABLE `Personne`
(
 `Id`     int NOT NULL AUTO_INCREMENT ,
 `Nom`    varchar(45) NOT NULL ,
 `Prenom` varchar(45) NOT NULL ,
 `Type`   int NOT NULL ,

PRIMARY KEY (`Id`)
);




-- Inscription

CREATE TABLE `Inscription`
(
 `Id`   int NOT NULL AUTO_INCREMENT ,
 `#IdC` int NOT NULL ,
 `#IdP` int NOT NULL ,

PRIMARY KEY (`Id`),
KEY `fkIdx_66` (`#IdC`),
CONSTRAINT `FK_66` FOREIGN KEY `fkIdx_66` (`#IdC`) REFERENCES `Classe` (`Id`),
KEY `fkIdx_69` (`#IdP`),
CONSTRAINT `FK_69` FOREIGN KEY `fkIdx_69` (`#IdP`) REFERENCES `Personne` (`Id`)
);



-- Bulletin

CREATE TABLE `Bulletin`
(
 `Id`           int NOT NULL AUTO_INCREMENT ,
 `Appreciation` mediumtext NOT NULL ,
 `#IdI`         int NOT NULL ,
 `#IdT`         int NOT NULL ,

PRIMARY KEY (`Id`),
KEY `fkIdx_72` (`#IdI`),
CONSTRAINT `FK_72` FOREIGN KEY `fkIdx_72` (`#IdI`) REFERENCES `Inscription` (`Id`),
KEY `fkIdx_91` (`#IdT`),
CONSTRAINT `FK_91` FOREIGN KEY `fkIdx_91` (`#IdT`) REFERENCES `Trimestre` (`Id`)
);





-- Enseignement

CREATE TABLE `Enseignement`
(
 `Id`   int NOT NULL AUTO_INCREMENT ,
 `#IdC` int NOT NULL ,
 `#IdP` int NOT NULL ,
 `#IdD` int NOT NULL ,

PRIMARY KEY (`Id`),
KEY `fkIdx_75` (`#IdC`),
CONSTRAINT `FK_75` FOREIGN KEY `fkIdx_75` (`#IdC`) REFERENCES `Classe` (`Id`),
KEY `fkIdx_78` (`#IdP`),
CONSTRAINT `FK_78` FOREIGN KEY `fkIdx_78` (`#IdP`) REFERENCES `Personne` (`Id`),
KEY `fkIdx_81` (`#IdD`),
CONSTRAINT `FK_81` FOREIGN KEY `fkIdx_81` (`#IdD`) REFERENCES `Discipline` (`Id`)
);


-- DetailBulletin

CREATE TABLE `DetailBulletin`
(
 `Id`           int NOT NULL AUTO_INCREMENT ,
 `Appreciation` mediumtext NOT NULL ,
 `#IdE`         int NOT NULL ,
 `#IdB`         int NOT NULL ,

PRIMARY KEY (`Id`),
KEY `fkIdx_85` (`#IdE`),
CONSTRAINT `FK_85` FOREIGN KEY `fkIdx_85` (`#IdE`) REFERENCES `Enseignement` (`Id`),
KEY `fkIdx_94` (`#IdB`),
CONSTRAINT `FK_94` FOREIGN KEY `fkIdx_94` (`#IdB`) REFERENCES `Bulletin` (`Id`)
);




-- Evaluation

CREATE TABLE `Evaluation`
(
 `Id`           int NOT NULL AUTO_INCREMENT ,
 `Note`         float NOT NULL ,
 `Appreciation` mediumtext NOT NULL ,
 `#IdDB`        int NOT NULL ,

PRIMARY KEY (`Id`),
KEY `fkIdx_88` (`#IdDB`),
CONSTRAINT `FK_88` FOREIGN KEY `fkIdx_88` (`#IdDB`) REFERENCES `DetailBulletin` (`Id`)
);















