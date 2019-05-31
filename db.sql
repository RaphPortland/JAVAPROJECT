-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le :  ven. 31 mai 2019 à 16:16
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
  `Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `AnneeScolaire`
--

INSERT INTO `AnneeScolaire` (`Id`) VALUES
(1);

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
(1, 1, 'TD6', 1, 1);

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
(2, 'Physique');

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
(1, 1, 1, 1),
(2, 1, 2, 2);

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
(1, 1, 5),
(2, 1, 3),
(3, 1, 4);

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
  `Type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Personne`
--

INSERT INTO `Personne` (`Id`, `Nom`, `Prenom`, `Type`) VALUES
(1, 'Houari', 'Meshkour', 1),
(2, 'Crambes', 'Christine', 1),
(3, 'Raphael', 'Partouche', 2),
(4, 'Tabard ', 'Guillaume', 2),
(5, 'Cauquelin', 'Louis', 2);

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
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Classe`
--
ALTER TABLE `Classe`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `DetailBulletin`
--
ALTER TABLE `DetailBulletin`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Discipline`
--
ALTER TABLE `Discipline`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `Ecole`
--
ALTER TABLE `Ecole`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Enseignement`
--
ALTER TABLE `Enseignement`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `Evaluation`
--
ALTER TABLE `Evaluation`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Inscription`
--
ALTER TABLE `Inscription`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `Niveau`
--
ALTER TABLE `Niveau`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Personne`
--
ALTER TABLE `Personne`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `Trimestre`
--
ALTER TABLE `Trimestre`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

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
