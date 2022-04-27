-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-04-2022 a las 12:50:14
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

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`codigo`, `nombre_equipo`, `nombre_estadio`, `aforo`, `año_fundacion`, `ciudad`) VALUES
(1, 'Cordoba CF', 'El Arcangel', 10000, 1954, 'Cordoba'),
(2, 'Real Madrid', 'Santiago Bernabeu', 100000, 1902, 'Madrid'),
(3, 'Barcelona CF', 'Camp Nou', 1000000, 1899, 'Barcelona'),
(4, 'Atletico Madrid', 'Wanda Metropolitano', 90000, 1903, 'Madrid'),
(5, 'Betis', 'Benito Villamarin', 60000, 1903, 'Sevilla'),
(6, 'Sevilla CF', 'NLD', 0, 1890, 'Sevilla');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `goles`
--

CREATE TABLE `goles` (
  `momento_gol` int(15) NOT NULL,
  `descripcion_gol` varchar(40) NOT NULL,
  `codigo_partido` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `goles`
--

INSERT INTO `goles` (`momento_gol`, `descripcion_gol`, `codigo_partido`) VALUES
(13, 'Gol de Toni Arranz', 1),
(18, 'Gol de Ousmane Dembele', 2),
(30, 'Gol de Antoine Griezmann', 2),
(44, 'Gol de Karim Benzema', 1),
(50, 'Gol de Hector Bellerin', 3),
(60, 'Gol de Diego Carlos', 3);

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

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`codigo`, `nombre`, `fech_nacimiento`, `posicion`, `codigo_equipo`) VALUES
(1, 'Toni Arranz', '1994-01-14', 'Centrocampista', 1),
(2, 'Karim Benzema', '1987-12-19', 'Delantero', 2),
(3, 'Ousmane Dembele', '1997-05-15', 'Delantero', 3),
(4, 'Antoine Griezmann', '1991-03-21', 'Delantero', 4),
(5, 'Hector Bellerin', '1995-03-19', 'Defensa', 5),
(6, 'Diego Carlos', '1993-03-15', 'Defensa', 6);

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

--
-- Volcado de datos para la tabla `partidos`
--

INSERT INTO `partidos` (`codigo`, `fecha_partido`, `goles_visitas`, `goles_casa`, `codigo_equipo`, `codigo_equipo2`) VALUES
(1, '2021-11-26', 2, 3, 1, 2),
(2, '2022-03-15', 1, 2, 3, 4),
(3, '2022-06-10', 0, 1, 5, 6);

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
-- Volcado de datos para la tabla `presidentes`
--

INSERT INTO `presidentes` (`dni`, `nombre`, `apellidos`, `fecha_nacimiento`, `equipo_presidente`, `año_presidente`, `codigo_equipo`) VALUES
('10719291A', 'Joan', 'Laporta Estruch', '1962-06-29', 'Barcelona', 2022, 3),
('19736106J', 'Angel', 'Haro', '1974-05-15', 'Betis', 2022, 5),
('27562891J', 'Carlos', 'Gonzalez Gonzalez', '1962-12-20', 'Cordoba', 2022, 1),
('57136106N', 'Jose', 'Castro Carmona', '1958-07-20', 'Sevilla', 2021, 6),
('57531609F', 'Florentino', 'Perez Rodriguez', '1947-03-08', 'Real Madrid', 2021, 2),
('81896376T', 'Enrique', 'Cerezo', '1948-02-27', 'Atletico Madrid', 2021, 4);

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
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

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
