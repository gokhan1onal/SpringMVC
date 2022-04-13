CREATE TABLE IF NOT EXISTS `users` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ad` varchar(50) NOT NULL,
  `soyad` varchar(50) NOT NULL,
  `kanGrubu` varchar(10) NOT NULL,
  `cepTel` varchar(20) NOT NULL,
  `adres` varchar(300) NOT NULL,
  PRIMARY KEY (`id`)
);