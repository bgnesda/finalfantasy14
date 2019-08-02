CREATE TABLE `CharacterCraftingJob` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `character_id` bigint(20) unsigned NOT NULL,
    `alchemist` bigint(20) unsigned NOT NULL,
    `armorer` bigint(20) unsigned NOT NULL,
    `blacksmith` bigint(20) unsigned NOT NULL,
    `carpenter` bigint(20) unsigned NOT NULL,
    `culinarian` bigint(20) unsigned NOT NULL,
    `goldsmith` bigint(20) unsigned NOT NULL,
    `leatherworker` bigint(20) unsigned NOT NULL,
    `weaver` bigint(20) unsigned NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_code` (`character_id`),
    CONSTRAINT `CharacterCraftingJobs_ibfk_1` FOREIGN KEY (`character_id`) REFERENCES `FFCharacter` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;