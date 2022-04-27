-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-04-2022 a las 12:10:58
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `codigo` int(5) NOT NULL,
  `nombre_equipo` varchar(40) NOT NULL,
  `nombre_estadio` varchar(40) NOT NULL,
  `aforo` int(5) NOT NULL,
  `año_fundacion` int(5) NOT NULL,
  `ciudad` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `goles`
--

CREATE TABLE `goles` (
  `momento_gol` int(15) NOT NULL,
  `descripcion_gol` varchar(40) NOT NULL,
  `codigo_partido` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `codigo` int(5) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `fech_nacimiento` date NOT NULL,
  `posicion` varchar(40) NOT NULL,
  `codigo_equipo` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partidos`
--

CREATE TABLE `partidos` (
  `codigo` int(5) NOT NULL,
  `fecha_partido` date NOT NULL,
  `goles_visitas` int(5) NOT NULL,
  `goles_casa` int(5) NOT NULL,
  `codigo_equipo` int(5) NOT NULL,
  `codigo_equipo2` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `presidentes`
--

CREATE TABLE `presidentes` (
  `dni` varchar(15) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellidos` varchar(40) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `equipo_presidente` varchar(40) NOT NULL,
  `año_presidente` int(5) NOT NULL,
  `codigo_equipo` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `goles`
--
ALTER TABLE `goles`
  ADD PRIMARY KEY (`momento_gol`),
  ADD KEY `codigo_partido` (`codigo_partido`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigo_equipo` (`codigo_equipo`);

--
-- Indices de la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigo_equipo` (`codigo_equipo`),
  ADD KEY `codigo_equipo2` (`codigo_equipo2`);

--
-- Indices de la tabla `presidentes`
--
ALTER TABLE `presidentes`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `codigo_equipo` (`codigo_equipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `jugador`
--
ALTER TABLE `jugador`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `goles`
--
ALTER TABLE `goles`
  ADD CONSTRAINT `goles_ibfk_1` FOREIGN KEY (`codigo_partido`) REFERENCES `partidos` (`codigo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `jugador_ibfk_1` FOREIGN KEY (`codigo_equipo`) REFERENCES `equipo` (`codigo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD CONSTRAINT `partidos_ibfk_1` FOREIGN KEY (`codigo_equipo`) REFERENCES `equipo` (`codigo`) ON UPDATE CASCADE,
  ADD CONSTRAINT `partidos_ibfk_2` FOREIGN KEY (`codigo_equipo2`) REFERENCES `equipo` (`codigo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `presidentes`
--
ALTER TABLE `presidentes`
  ADD CONSTRAINT `presidentes_ibfk_1` FOREIGN KEY (`codigo_equipo`) REFERENCES `equipo` (`codigo`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;