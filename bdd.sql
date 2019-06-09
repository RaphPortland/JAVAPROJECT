-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le :  Dim 09 juin 2019 à 21:06
-- Version du serveur :  5.7.25
-- Version de PHP :  7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `ProjetInfoIng3`
--

-- --------------------------------------------------------

--
-- Structure de la table `AnneeScolaire`
--

CREATE TABLE `AnneeScolaire` (
  `Id` int(11) NOT NULL,
  `Annee` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `AnneeScolaire`
--

INSERT INTO `AnneeScolaire` (`Id`, `Annee`) VALUES
(1, '2015/2016');

-- --------------------------------------------------------

--
-- Structure de la table `Bulletin`
--

CREATE TABLE `Bulletin` (
  `Id` int(11) NOT NULL,
  `Appreciation` mediumtext NOT NULL,
  `#IdI` int(11) NOT NULL,
  `#IdT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Bulletin`
--

INSERT INTO `Bulletin` (`Id`, `Appreciation`, `#IdI`, `#IdT`) VALUES
(1, 'Bon premier trimestre. Quelques irrégularités mais rien d\'inquiétant.', 1, 1),
(2, 'Second trimestre satisfaisant. Attention cependant a remonter les notes de physique ! ', 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `Classe`
--

CREATE TABLE `Classe` (
  `Id` int(11) NOT NULL,
  `#IdAS` int(11) NOT NULL,
  `Nom` varchar(45) NOT NULL,
  `#IdE` int(11) NOT NULL,
  `#IdN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Classe`
--

INSERT INTO `Classe` (`Id`, `#IdAS`, `Nom`, `#IdE`, `#IdN`) VALUES
(1, 1, 'TD6', 1, 1),
(3, 1, 'TD7', 1, 1),
(4, 1, 'TD2', 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `DetailBulletin`
--

CREATE TABLE `DetailBulletin` (
  `Id` int(11) NOT NULL,
  `Appreciation` mediumtext NOT NULL,
  `#IdE` int(11) NOT NULL,
  `#IdB` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `DetailBulletin`
--

INSERT INTO `DetailBulletin` (`Id`, `Appreciation`, `#IdE`, `#IdB`) VALUES
(1, 'Ensemble correct, mais bien des compétences ne sont pas encore maitrisées. Il convient d’intensifier les efforts au prochain trimestre.', 1, 1),
(2, 'Les résultats sont remarquables, de même que l’attitude en classe. Félicitations !\r\n', 2, 1),
(3, 'Des progrès intéressants ce trimestre, une bonne volonté indéniable et des efforts louables. Poursuivez sur cette voie ', 3, 1),
(4, 'Trimestre très satisfaisant. Sophie a fait des progrès importants grâce à un investissement de qualité et des efforts réguliers. Je l’encourage à poursuivre ainsi.\r\n', 4, 1);

-- --------------------------------------------------------

--
-- Structure de la table `Discipline`
--

CREATE TABLE `Discipline` (
  `Id` int(11) NOT NULL,
  `Nom` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Discipline`
--

INSERT INTO `Discipline` (`Id`, `Nom`) VALUES
(1, 'Mathematiques'),
(2, 'Physique'),
(3, 'Electronique'),
(4, 'Informatique');

-- --------------------------------------------------------

--
-- Structure de la table `Ecole`
--

CREATE TABLE `Ecole` (
  `Id` int(11) NOT NULL,
  `Nom` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Ecole`
--

INSERT INTO `Ecole` (`Id`, `Nom`) VALUES
(1, 'ECE');

-- --------------------------------------------------------

--
-- Structure de la table `Enseignement`
--

CREATE TABLE `Enseignement` (
  `Id` int(11) NOT NULL,
  `#IdC` int(11) NOT NULL,
  `#IdP` int(11) NOT NULL,
  `#IdD` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Enseignement`
--

INSERT INTO `Enseignement` (`Id`, `#IdC`, `#IdP`, `#IdD`) VALUES
(1, 1, 61, 1),
(2, 1, 62, 2),
(3, 1, 63, 4),
(4, 1, 44, 3);

-- --------------------------------------------------------

--
-- Structure de la table `Evaluation`
--

CREATE TABLE `Evaluation` (
  `Id` int(11) NOT NULL,
  `Note` float NOT NULL,
  `Appreciation` mediumtext NOT NULL,
  `#IdDB` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Evaluation`
--

INSERT INTO `Evaluation` (`Id`, `Note`, `Appreciation`, `#IdDB`) VALUES
(1, 12, 'Ensemble correct mais il est nécessaire d’approfondir l’apprentissage des leçons.', 1),
(2, 8, 'Les connaissances sont insuffisantes et la méthode n’est pas bien maitrisée. Il faut être plus attentif en cours et étudier plus régulièrement.', 1),
(3, 13, 'La méthode est bien maitrisée, la réflexion est correcte, mais il vous faut améliorer l’expression, trop confuse.', 2),
(4, 15, 'Ensemble très satisfaisant, bravo ! Poursuivez ainsi.\r\n', 2),
(5, 10, 'Bien', 3),
(6, 14, 'Très bonne progression', 3),
(7, 15, 'Très bien', 4),
(8, 17, 'Beau travail', 4);

-- --------------------------------------------------------

--
-- Structure de la table `Inscription`
--

CREATE TABLE `Inscription` (
  `Id` int(11) NOT NULL,
  `#IdC` int(11) NOT NULL,
  `#IdP` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Inscription`
--

INSERT INTO `Inscription` (`Id`, `#IdC`, `#IdP`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 3, 3),
(4, 3, 4),
(5, 3, 5),
(6, 1, 6),
(7, 1, 7),
(8, 1, 8),
(12, 1, 15),
(13, 1, 40),
(14, 1, 39),
(15, 3, 38),
(16, 3, 20),
(17, 3, 11),
(18, 3, 12),
(19, 3, 12),
(20, 3, 13),
(22, 1, 15),
(23, 1, 16),
(24, 4, 73);

-- --------------------------------------------------------

--
-- Structure de la table `Niveau`
--

CREATE TABLE `Niveau` (
  `Id` int(11) NOT NULL,
  `Nom` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Niveau`
--

INSERT INTO `Niveau` (`Id`, `Nom`) VALUES
(1, 'Ing1');

-- --------------------------------------------------------

--
-- Structure de la table `Personne`
--

CREATE TABLE `Personne` (
  `Id` int(11) NOT NULL,
  `Nom` varchar(45) NOT NULL,
  `Prenom` varchar(45) NOT NULL,
  `Sexe` char(45) NOT NULL,
  `Type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Personne`
--

INSERT INTO `Personne` (`Id`, `Nom`, `Prenom`, `Sexe`, `Type`) VALUES
(1, 'Dupond', 'Sophie', 'f', 2),
(2, 'Olsen', 'Lea', 'f', 2),
(3, 'Mcronald', 'Donald', 'h', 2),
(4, 'Dunlap', 'Leo', 'h', 2),
(5, 'Harrington', 'Henri', 'h', 2),
(6, 'Chichi', 'Jacques', 'h', 2),
(7, 'Ellison', 'Lacey', 'f', 2),
(8, 'Trevino', 'Hugo', 'h', 2),
(9, 'Duncan', 'Morgane', 'f', 2),
(11, 'Oconnor', 'Iris', 'f', 2),
(12, 'Lisa', 'Mona', 'f', 2),
(13, 'Super', 'Daniel', 'h', 2),
(15, 'Barker', 'Jamal', 'h', 2),
(16, 'Velasquez', 'Maria', 'f', 2),
(17, 'Courel', 'Paul', 'h', 2),
(18, 'Pate', 'Yoan', 'h', 2),
(19, 'Assin', 'Marc', 'h', 2),
(20, 'Nemar', 'Jean', 'h', 2),
(21, 'Wheeler', 'Bianca', 'f', 2),
(22, 'Dale', 'Shoshana', 'f', 2),
(23, 'Caulfield', 'Maxine', 'f', 2),
(24, 'Grand', 'Jeanne', 'f', 1),
(25, 'Bonneau', 'Jean', 'h', 1),
(26, 'Pena', 'Martha', 'f', 1),
(27, 'Potter', 'Harry', 'h', 1),
(28, 'Granger', 'Hermione', 'f', 1),
(29, 'Grint', 'Ron', 'h', 1),
(30, 'Who', 'Doctor', 'h', 1),
(31, 'Quinn', 'Harley', 'f', 1),
(32, 'Baggins', 'Bilbo', 'h', 1),
(33, 'Krueger', 'Fredy', 'h', 1),
(34, 'Stark', 'Ned', 'h', 1),
(35, 'Stark', 'Arya', 'h', 1),
(36, 'Soral', 'Louison', 'f', 1),
(37, 'Tuisson', 'Jerome', 'h', 1),
(38, 'Noice', 'Gerard', 'h', 1),
(39, 'Dupond', 'Colette', 'f', 1),
(40, 'Amidala', 'Padme', 'f', 1),
(41, 'Durand', 'Marie', 'f', 1),
(42, 'Garcia', 'Marina', 'f', 1),
(43, 'Edison', 'Thomas', 'h', 1),
(44, 'Watt', 'James', 'h', 1),
(45, 'Descartes', 'Rene', 'h', 1),
(46, 'Darwin', 'Charles', 'h', 1),
(47, 'Currie', 'Marie', 'f', 1),
(48, 'Newton', 'Isaac', 'h', 1),
(49, 'Legrand', 'Morgane', 'f', 1),
(50, 'Tesla', 'Nikola', 'h', 1),
(51, 'Muller', 'Stephanie', 'f', 1),
(52, 'Coco', 'Chanel', 'f', 1),
(53, 'Lefebres', 'Daniel', 'h', 1),
(54, 'Fleur', 'Rosalie', 'f', 1),
(55, 'Marveille', 'Veronique', 'f', 1),
(56, 'Dupuis', 'Monique', 'f', 1),
(57, 'Patricia', 'Belanger', 'f', 1),
(58, 'Patel', 'Charlotte', 'f', 1),
(59, 'Mercier', 'Aimee', 'f', 1),
(60, 'Cloutier', 'Julie', 'f', 1),
(61, 'Houari', 'Meshkour', 'h', 1),
(62, 'Crambes', 'Christine', 'f', 1),
(63, 'Raphael', 'Partouche', 'h', 2),
(64, 'Tabard ', 'Guillaume', 'h', 2),
(67, 'ROBERTOOOOOO', 'CALABRAS', 'f', 1),
(70, 'HIHI', 'HAHA', 'f', 1),
(71, 'HIHI', 'HAHA', 'f', 1),
(72, 'HIHI', 'HAHA', 'f', 1),
(73, 'Matin', 'Martin', 'h', 2);

-- --------------------------------------------------------

--
-- Structure de la table `Trimestre`
--

CREATE TABLE `Trimestre` (
  `Id` int(11) NOT NULL,
  `Numero` int(11) NOT NULL,
  `debut` int(11) NOT NULL,
  `fin` int(11) NOT NULL,
  `#IdAS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Trimestre`
--

INSERT INTO `Trimestre` (`Id`, `Numero`, `debut`, `fin`, `#IdAS`) VALUES
(1, 1, 1092015, 16122016, 1),
(2, 2, 1012016, 1042016, 1),
(3, 3, 2042016, 507, 1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `AnneeScolaire`
--
ALTER TABLE `AnneeScolaire`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `Bulletin`
--
ALTER TABLE `Bulletin`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fkIdx_72` (`#IdI`),
  ADD KEY `fkIdx_91` (`#IdT`);

--
-- Index pour la table `Classe`
--
ALTER TABLE `Classe`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fkIdx_57` (`#IdAS`),
  ADD KEY `fkIdx_60` (`#IdE`),
  ADD KEY `fkIdx_63` (`#IdN`);

--
-- Index pour la table `DetailBulletin`
--
ALTER TABLE `DetailBulletin`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fkIdx_85` (`#IdE`),
  ADD KEY `fkIdx_94` (`#IdB`);

--
-- Index pour la table `Discipline`
--
ALTER TABLE `Discipline`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `Ecole`
--
ALTER TABLE `Ecole`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `Enseignement`
--
ALTER TABLE `Enseignement`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fkIdx_75` (`#IdC`),
  ADD KEY `fkIdx_78` (`#IdP`),
  ADD KEY `fkIdx_81` (`#IdD`);

--
-- Index pour la table `Evaluation`
--
ALTER TABLE `Evaluation`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fkIdx_88` (`#IdDB`);

--
-- Index pour la table `Inscription`
--
ALTER TABLE `Inscription`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fkIdx_66` (`#IdC`),
  ADD KEY `fkIdx_69` (`#IdP`);

--
-- Index pour la table `Niveau`
--
ALTER TABLE `Niveau`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `Personne`
--
ALTER TABLE `Personne`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `Trimestre`
--
ALTER TABLE `Trimestre`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fkIdx_54` (`#IdAS`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `AnneeScolaire`
--
ALTER TABLE `AnneeScolaire`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Bulletin`
--
ALTER TABLE `Bulletin`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `Classe`
--
ALTER TABLE `Classe`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `DetailBulletin`
--
ALTER TABLE `DetailBulletin`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `Discipline`
--
ALTER TABLE `Discipline`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `Ecole`
--
ALTER TABLE `Ecole`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Enseignement`
--
ALTER TABLE `Enseignement`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `Evaluation`
--
ALTER TABLE `Evaluation`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `Inscription`
--
ALTER TABLE `Inscription`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT pour la table `Niveau`
--
ALTER TABLE `Niveau`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Personne`
--
ALTER TABLE `Personne`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;

--
-- AUTO_INCREMENT pour la table `Trimestre`
--
ALTER TABLE `Trimestre`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Bulletin`
--
ALTER TABLE `Bulletin`
  ADD CONSTRAINT `FK_72` FOREIGN KEY (`#IdI`) REFERENCES `Inscription` (`Id`),
  ADD CONSTRAINT `FK_91` FOREIGN KEY (`#IdT`) REFERENCES `Trimestre` (`Id`);

--
-- Contraintes pour la table `Classe`
--
ALTER TABLE `Classe`
  ADD CONSTRAINT `FK_57` FOREIGN KEY (`#IdAS`) REFERENCES `AnneeScolaire` (`Id`),
  ADD CONSTRAINT `FK_60` FOREIGN KEY (`#IdE`) REFERENCES `Ecole` (`Id`),
  ADD CONSTRAINT `FK_63` FOREIGN KEY (`#IdN`) REFERENCES `Niveau` (`Id`);

--
-- Contraintes pour la table `DetailBulletin`
--
ALTER TABLE `DetailBulletin`
  ADD CONSTRAINT `FK_85` FOREIGN KEY (`#IdE`) REFERENCES `Enseignement` (`Id`),
  ADD CONSTRAINT `FK_94` FOREIGN KEY (`#IdB`) REFERENCES `Bulletin` (`Id`);

--
-- Contraintes pour la table `Enseignement`
--
ALTER TABLE `Enseignement`
  ADD CONSTRAINT `FK_75` FOREIGN KEY (`#IdC`) REFERENCES `Classe` (`Id`),
  ADD CONSTRAINT `FK_78` FOREIGN KEY (`#IdP`) REFERENCES `Personne` (`Id`),
  ADD CONSTRAINT `FK_81` FOREIGN KEY (`#IdD`) REFERENCES `Discipline` (`Id`);

--
-- Contraintes pour la table `Evaluation`
--
ALTER TABLE `Evaluation`
  ADD CONSTRAINT `FK_88` FOREIGN KEY (`#IdDB`) REFERENCES `DetailBulletin` (`Id`);

--
-- Contraintes pour la table `Inscription`
--
ALTER TABLE `Inscription`
  ADD CONSTRAINT `FK_66` FOREIGN KEY (`#IdC`) REFERENCES `Classe` (`Id`),
  ADD CONSTRAINT `FK_69` FOREIGN KEY (`#IdP`) REFERENCES `Personne` (`Id`);

--
-- Contraintes pour la table `Trimestre`
--
ALTER TABLE `Trimestre`
  ADD CONSTRAINT `FK_54` FOREIGN KEY (`#IdAS`) REFERENCES `AnneeScolaire` (`Id`);
