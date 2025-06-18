-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2025 a las 21:13:50
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `radiantview`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `ID_Cita` int(11) NOT NULL,
  `Nro_Cita` int(11) NOT NULL,
  `Usuario_Paciente` int(11) NOT NULL,
  `Usuario_Recepcion` int(11) NOT NULL,
  `Fecha` datetime(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_examen`
--

CREATE TABLE `historial_examen` (
  `ID_Historial_Examen` int(11) NOT NULL,
  `Fecha_Historial` datetime NOT NULL,
  `Costo_Examen` decimal(10,0) NOT NULL,
  `Usuario_Radiologo` int(11) NOT NULL,
  `Usuario_Paciente` int(11) NOT NULL,
  `Examenes_ID_Examen` int(11) NOT NULL,
  `Cita_ID_Cita` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_insumos`
--

CREATE TABLE `historial_insumos` (
  `ID_Historial_Insumo` varchar(45) NOT NULL,
  `Historial_Examen_ID_Historial_Examen` int(11) NOT NULL,
  `Tipo_Insumos_ID_Tipo_Insumos` int(11) NOT NULL,
  `Cantidad_Usada` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notificacion`
--

CREATE TABLE `notificacion` (
  `ID_Notificacion` int(11) NOT NULL,
  `Mensaje` varchar(100) NOT NULL,
  `Estado` enum('Pendiente','Enviada','Leída','No leída') NOT NULL,
  `Fecha` datetime(6) NOT NULL,
  `Usuario_ID_Usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `ID_Pago` int(11) NOT NULL,
  `Monto` varchar(45) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Metodo` varchar(10) NOT NULL,
  `Estado` varchar(10) NOT NULL,
  `Historial_Examen_ID_Historial_Examen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultados_medicos`
--

CREATE TABLE `resultados_medicos` (
  `ID_Resultados` int(11) NOT NULL,
  `Resultados` text NOT NULL,
  `Archivo_Resultado` mediumblob NOT NULL,
  `Fecha_Resultado` datetime NOT NULL,
  `Historial_Examen_ID_Historial_Examen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_accion`
--

CREATE TABLE `tipo_accion` (
  `ID_Accion` int(11) NOT NULL,
  `Nombre_Accion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `tipo_accion`
--

INSERT INTO `tipo_accion` (`ID_Accion`, `Nombre_Accion`) VALUES
(1, 'Insert'),
(2, 'Select'),
(3, 'Update'),
(4, 'Delete');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_examen`
--

CREATE TABLE `tipo_examen` (
  `ID_Tipo_Examen` int(11) NOT NULL,
  `Nombre_Examen` varchar(250) NOT NULL,
  `Descripcion_Examen` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_insumos`
--

CREATE TABLE `tipo_insumos` (
  `ID_Tipo_Insumos` int(11) NOT NULL,
  `Nombre_Insumo` varchar(45) NOT NULL,
  `Stock` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_rol`
--

CREATE TABLE `tipo_rol` (
  `ID_Tipo_Rol` int(11) NOT NULL,
  `Nombre_Rol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `tipo_rol`
--

INSERT INTO `tipo_rol` (`ID_Tipo_Rol`, `Nombre_Rol`) VALUES
(1, 'Administrador'),
(2, 'Recepcionista'),
(3, 'Paciente'),
(4, 'Radiologo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_Usuario` int(11) NOT NULL,
  `Tipo_Documento` enum('CC','TI','CE','PAS','RC') NOT NULL,
  `Nombres_Usuario` varchar(90) NOT NULL,
  `Apellidos_Usuario` varchar(90) NOT NULL,
  `Telefono_Usuario` varchar(20) NOT NULL,
  `Direccion_Usuario` text NOT NULL,
  `Edad` int(11) NOT NULL,
  `Correo_Usuario` varchar(120) NOT NULL,
  `Contraseña_Usuario` varchar(256) NOT NULL,
  `Rol_ID_Rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_Usuario`, `Tipo_Documento`, `Nombres_Usuario`, `Apellidos_Usuario`, `Telefono_Usuario`, `Direccion_Usuario`, `Edad`, `Correo_Usuario`, `Contraseña_Usuario`, `Rol_ID_Rol`) VALUES
(6, 'CC', 'Andrés', 'Cajamarca', '3222069916', 'cll 5  sur no 10a-20', 34, 'admin@hotmail.com', '123456', 1),
(24, 'CC', 'Lorena', 'Tellez', '3102538287', 'Cll 17 no 24b-17', 30, 'recepcion@hotmail.com', '123456', 2),
(54, 'CC', 'Esperanza', 'Tellez', '3210392934', 'Av falsa 123', 40, 'radiologo@hotmail.com', '123456', 4),
(55, 'CC', 'Carlos', 'Ramírez', '3001234567', 'Calle 10 #5-20', 35, 'carlos.ramirez@gmail.com', '123456', 4),
(56, 'TI', 'Laura', 'Gómez', '3112345678', 'Carrera 7 #45-67', 28, 'paciente@hotmail.com', '123456', 3),
(57, 'CC', 'Javier', 'Martínez', '3209876543', 'Avenida 3 #21-33', 42, 'javier.m@gmail.com', '123456', 3),
(58, 'CE', 'Ana', 'Ruiz', '3156789123', 'Cra 15 #123-56', 30, 'ana.ruiz@hotmail.com', '123456', 2),
(59, 'CC', 'Mario', 'López', '3165432198', 'Cl 22 #8-91', 50, 'mario.lopez@yahoo.com', '123456', 3),
(60, 'CC', 'Patricia', 'Torres', '3029876543', 'Av Siempreviva 742', 38, 'paty.torres@outlook.com', '123456', 3),
(61, 'TI', 'Luis', 'Hernández', '3104567890', 'Calle 33 #4-10', 21, 'luis.hdez@gmail.com', '123456', 3),
(62, 'CC', 'Natalia', 'Rojas', '3221239876', 'Cra 18 #23-45', 26, 'nat.rojas@correo.com', '123456', 3),
(64, 'CC', 'Diana', 'Castro', '3056789123', 'Av 5 #30-01', 29, 'diana.castro@feria.com', '123456', 3),
(65, 'CC', 'Camilo', 'Ortega', '3002223334', 'Cra 12 #7-89', 37, 'camilo.ortega@correo.com', '123456', 3),
(66, 'TI', 'Verónica', 'Ramírez', '3149876523', 'Calle 60 #10-10', 25, 'vero.ramirez@gmail.com', '123456', 3),
(67, 'CC', 'Esteban', 'Morales', '3012345678', 'Av Libertador 123', 33, 'esteban.morales@zmail.com', '123456', 3),
(68, 'CE', 'Liliana', 'Vargas', '3124567890', 'Cra 2 #11-11', 41, 'lili.vargas@mail.com', '123456', 3),
(69, 'CC', 'David', 'González', '3150001122', 'Cl 80 #90-100', 36, 'david.gonzalez@host.com', '123456', 3),
(70, 'CC', 'Sandra', 'Paredes', '3203334455', 'Av Central 321', 45, 'sandra.paredes@zcorp.com', '123456', 3),
(71, 'TI', 'Felipe', 'Reyes', '3098765432', 'Cra 8 #6-22', 27, 'felipe.reyes@correo.com', '123456', 3),
(72, 'CC', 'Isabel', 'Navarro', '3214567890', 'Cl 55 #19-88', 39, 'isabel.navarro@mail.com', '123456', 3),
(73, 'CE', 'Andrés', 'Castaño', '3119876543', 'Av Norte 5 #45-23', 32, 'andres.castano@gmail.com', '123456', 3),
(74, 'CC', 'Monica', 'Delgado', '3176543210', 'Cra 30 #12-34', 34, 'monica.delgado@webmail.com', '123456', 3),
(75, 'CC', 'Edna', 'Moda', '1111111', 'Cll 111 no 11-11', 11, '11111111@gmail.com', '111111', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_accion`
--

CREATE TABLE `usuario_accion` (
  `ID_Usuario_Accion` int(11) NOT NULL,
  `Usuario_ID_Usuario` int(11) NOT NULL,
  `Accion_ID_Accion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`ID_Cita`);

--
-- Indices de la tabla `historial_examen`
--
ALTER TABLE `historial_examen`
  ADD PRIMARY KEY (`ID_Historial_Examen`);

--
-- Indices de la tabla `historial_insumos`
--
ALTER TABLE `historial_insumos`
  ADD PRIMARY KEY (`ID_Historial_Insumo`,`Historial_Examen_ID_Historial_Examen`,`Tipo_Insumos_ID_Tipo_Insumos`);

--
-- Indices de la tabla `notificacion`
--
ALTER TABLE `notificacion`
  ADD PRIMARY KEY (`ID_Notificacion`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`ID_Pago`);

--
-- Indices de la tabla `resultados_medicos`
--
ALTER TABLE `resultados_medicos`
  ADD PRIMARY KEY (`ID_Resultados`);

--
-- Indices de la tabla `tipo_accion`
--
ALTER TABLE `tipo_accion`
  ADD PRIMARY KEY (`ID_Accion`);

--
-- Indices de la tabla `tipo_examen`
--
ALTER TABLE `tipo_examen`
  ADD PRIMARY KEY (`ID_Tipo_Examen`);

--
-- Indices de la tabla `tipo_insumos`
--
ALTER TABLE `tipo_insumos`
  ADD PRIMARY KEY (`ID_Tipo_Insumos`);

--
-- Indices de la tabla `tipo_rol`
--
ALTER TABLE `tipo_rol`
  ADD PRIMARY KEY (`ID_Tipo_Rol`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_Usuario`);

--
-- Indices de la tabla `usuario_accion`
--
ALTER TABLE `usuario_accion`
  ADD PRIMARY KEY (`ID_Usuario_Accion`),
  ADD KEY `Accion_ID_Accion` (`Accion_ID_Accion`),
  ADD KEY `usuario_accion_ibfk_2` (`Usuario_ID_Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `ID_Cita` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `historial_examen`
--
ALTER TABLE `historial_examen`
  MODIFY `ID_Historial_Examen` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_accion`
--
ALTER TABLE `tipo_accion`
  MODIFY `ID_Accion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tipo_examen`
--
ALTER TABLE `tipo_examen`
  MODIFY `ID_Tipo_Examen` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_rol`
--
ALTER TABLE `tipo_rol`
  MODIFY `ID_Tipo_Rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID_Usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;

--
-- AUTO_INCREMENT de la tabla `usuario_accion`
--
ALTER TABLE `usuario_accion`
  MODIFY `ID_Usuario_Accion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`Rol_ID_Rol`) REFERENCES `tipo_rol` (`ID_TIpo_Rol`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuario_accion`
--
ALTER TABLE `usuario_accion`
  ADD CONSTRAINT `usuario_accion_ibfk_1` FOREIGN KEY (`Accion_ID_Accion`) REFERENCES `tipo_accion` (`ID_Accion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `usuario_accion_ibfk_2` FOREIGN KEY (`Usuario_ID_Usuario`) REFERENCES `usuario` (`ID_Usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
