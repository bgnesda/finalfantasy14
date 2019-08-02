CREATE TABLE `CharacterGatheringJob` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `character_id` bigint(20) unsigned NOT NULL,
    `botanist` bigint(20) unsigned NOT NULL,
    `fisher` bigint(20) unsigned NOT NULL,
    `miner` bigint(20) unsigned NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_code` (`character_id`),
    CONSTRAINT `CharacterGatheringJobs_ibfk_1` FOREIGN KEY (`character_id`) REFERENCES `FFCharacter` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;