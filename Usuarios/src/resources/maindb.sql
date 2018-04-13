/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  cicero.hsantos
 * Created: 04/04/2018
 */

CREATE SCHEMA usuario;
USE usuario;

CREATE TABLE `usuario`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nome_usuario` VARCHAR(45) NOT NULL,
  `senha_usuario` VARCHAR(8) NOT NULL,
  `data_cadastro_usuario` DATE NOT NULL,
  `perfil_usuario` VARCHAR(10) NOT NULL,
  `enabled_usuario` TINYINT NOT NULL,
  PRIMARY KEY (`id_usuario`));
