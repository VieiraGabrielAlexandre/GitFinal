

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


CREATE DATABASE IF NOT EXISTS `jsp` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jsp`;

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `aniversario` date DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT '0',
  `cep` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `sobre_nome` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `cliente` (`id`, `aniversario`, `ativo`, `cep`, `logradouro`, `nome`, `sobre_nome`) VALUES
(1, '1987-01-22', 1, '06866230', 'RUA MARIALVA', 'PAULO', 'RICARDO');


DROP TABLE IF EXISTS `fornecedor`;
CREATE TABLE `fornecedor` (
  `id` int(11) NOT NULL,
  `ativo` tinyint(1) DEFAULT '0',
  `razao_social` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `pedidos`;
CREATE TABLE `pedidos` (
  `id` int(11) NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `pedidos` (`id`, `id_cliente`, `id_usuario`) VALUES
(12, 1, 1),
(13, 1, 1),
(14, 1, 1),
(15, 1, 1),
(16, 1, 1);

DROP TABLE IF EXISTS `pedidos_itens`;
CREATE TABLE `pedidos_itens` (
  `id` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `id_pedido` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valor_total` float DEFAULT NULL,
  `valor_unitario` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `pedidos_itens` (`id`, `descricao`, `id_pedido`, `quantidade`, `valor_total`, `valor_unitario`) VALUES
(2, NULL, 4, NULL, 0, 0),
(15, 'AGUA', 12, 1, 3.9, 3.9),
(16, 'SUCO', 12, 1, 10.5, 10.5),
(17, 'AGUA', 13, 1, 3.9, 3.9),
(18, 'SUCO', 13, 1, 10.5, 10.5),
(19, 'AGUA', 15, 1, 3.9, 3.9),
(20, 'SUCO', 15, 1, 10.5, 10.5),
(21, 'AGUA', 15, 1, 3.9, 3.9),
(22, 'SUCO', 15, 1, 10.5, 10.5),
(23, 'AGUA', 15, 1, 3.9, 3.9),
(24, 'SUCO', 15, 1, 10.5, 10.5),
(25, 'AGUA', 16, 1, 3.9, 3.9),
(26, 'SUCO', 16, 1, 10.5, 10.5),
(27, 'AGUA', 16, 1, 3.9, 3.9),
(28, 'SUCO', 16, 1, 10.5, 10.5),
(29, 'AGUA', 16, 1, 3.9, 3.9);


DROP TABLE IF EXISTS `produto`;
CREATE TABLE `produto` (
  `id` int(11) NOT NULL,
  `ativo` tinyint(1) DEFAULT '0',
  `descricao` varchar(255) DEFAULT NULL,
  `preco_venda` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `produto` (`id`, `ativo`, `descricao`, `preco_venda`) VALUES
(1, 1, 'AGUA', 3.9),
(2, 1, 'SUCO', 10.5);

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `ativo` tinyint(1) DEFAULT '0',
  `login` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `usuario` (`id`, `ativo`, `login`, `nome`, `senha`) VALUES
(1, 1, 'gabriel', 'gabriel', '1234');
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `pedidos_itens`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
ALTER TABLE `fornecedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE `pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
ALTER TABLE `pedidos_itens`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;


ALTER TABLE `produto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

USE `phpmyadmin`;

INSERT INTO `pma__table_uiprefs` (`username`, `db_name`, `table_name`, `prefs`, `last_update`) VALUES
('root', 'jsp', 'produto', '{"sorted_col":"`produto`.`preco_venda` ASC"}', '2018-06-05 23:14:08');

