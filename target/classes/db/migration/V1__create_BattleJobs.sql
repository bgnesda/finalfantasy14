CREATE TABLE `BattleJob` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(100) NOT NULL,
    `symbol` varchar(10) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_code` (`name`,`symbol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;