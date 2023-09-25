-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2022 a las 15:44:29
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_tpf`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `domicilio`
--

CREATE TABLE `domicilio` (
  `id_d` int(11) NOT NULL,
  `barrio` varchar(255) DEFAULT NULL,
  `calle` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  `id_p` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `domicilio`
--

INSERT INTO `domicilio` (`id_d`, `barrio`, `calle`, `numero`, `pais`, `provincia`, `id_p`) VALUES
(1, 'Alto Comedero', 'Pje. el cucho', 455, 'Argentina', 'Jujuy', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

CREATE TABLE `educacion` (
  `id_e` int(11) NOT NULL,
  `img_insti` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `periodo_f` int(11) DEFAULT NULL,
  `periodo_i` int(11) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `id_u` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id_e`, `img_insti`, `institucion`, `periodo_f`, `periodo_i`, `titulo`, `id_u`) VALUES
(1, 'educacion.png', 'Instituto NOA', 2019, 2019, 'Ingles basico/intermedio', 1),
(2, 'educacion.png', 'Instituto Nuevo Horizonte', 2022, 2020, 'Tecnicatura en Desarrollo de software', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia`
--

CREATE TABLE `experiencia` (
  `id_x` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `logo_org` varchar(255) DEFAULT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `periodo_f` int(11) DEFAULT NULL,
  `periodo_i` int(11) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL,
  `id_u` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experiencia`
--

INSERT INTO `experiencia` (`id_x`, `descripcion`, `logo_org`, `lugar`, `periodo_f`, `periodo_i`, `puesto`, `id_u`) VALUES
(1, 'esta descripcion es solo una prueba', 'experiencia.png', 'lugar de prueba', 2020, 2020, 'puesto de prueba', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habilidad`
--

CREATE TABLE `habilidad` (
  `id_h` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL,
  `id_u` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habilidad`
--

INSERT INTO `habilidad` (`id_h`, `descripcion`, `nivel`, `id_u`) VALUES
(1, 'html/css', 'medio', 1),
(2, 'TypeScrip', 'bajo', 1),
(3, 'Java', 'medio', 1),
(4, 'Springboot', 'bajo', 1),
(5, 'bootstrap', 'medio', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_p` int(11) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `nombre1` varchar(255) DEFAULT NULL,
  `nombre2` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_p`, `apellido`, `nombre1`, `nombre2`) VALUES
(1, 'Barconte', 'Miguel', 'Alejandro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `projectos`
--

CREATE TABLE `projectos` (
  `id_p` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `logo_pj` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `periodo_fin` int(11) DEFAULT NULL,
  `periodo_ini` int(11) DEFAULT NULL,
  `pruebas` varchar(255) DEFAULT NULL,
  `id_u` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `projectos`
--

INSERT INTO `projectos` (`id_p`, `descripcion`, `logo_pj`, `nombre`, `periodo_fin`, `periodo_ini`, `pruebas`, `id_u`) VALUES
(1, 'Realizacion de un portfolio web como trabajo final del curso', 'proyecto.png', 'Portfolio Web #YoProgramo', 2022, 2022, NULL, 1),
(2, 'Realizacion de una pagina web funcional con tematica de red social', 'proyecto.png', 'Proyecto Final Programacion III / Practica Profesionalizante III', 2022, 2022, NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_u` int(11) NOT NULL,
  `contraseña` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `img_banner` varchar(255) DEFAULT NULL,
  `img_perfil` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `id_p` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_u`, `contraseña`, `descripcion`, `img_banner`, `img_perfil`, `titulo`, `usuario`, `id_p`) VALUES
(1, 'miguelbarconte1223', 'Graduado del instituto de educación superior \" Nuevo Horizonte \" y certificado por el plan Nacional de Argentina programa #YoProgramo.', 'Banner.png', 'perfil.jpg', 'Full stack developer junior', 'miguelB', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `domicilio`
--
ALTER TABLE `domicilio`
  ADD PRIMARY KEY (`id_d`),
  ADD KEY `FKo158wv2wb30y5k9psb54tij2n` (`id_p`);

--
-- Indices de la tabla `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id_e`),
  ADD KEY `FKe89g8b76cv4wiupx1y0uh4tii` (`id_u`);

--
-- Indices de la tabla `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id_x`),
  ADD KEY `FKiflxoquw13gxnq2v98le2q8l9` (`id_u`);

--
-- Indices de la tabla `habilidad`
--
ALTER TABLE `habilidad`
  ADD PRIMARY KEY (`id_h`),
  ADD KEY `FK86nqe5jq2mydm7o0u0xftv5u9` (`id_u`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_p`);

--
-- Indices de la tabla `projectos`
--
ALTER TABLE `projectos`
  ADD PRIMARY KEY (`id_p`),
  ADD KEY `FKkfnrwtevx5i1610xio2vld15x` (`id_u`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_u`),
  ADD KEY `FKe81lovt9o11al0butujx60wom` (`id_p`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
