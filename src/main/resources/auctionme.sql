CREATE DATABASE `auctionme`;
USE `auctionme`;

-- item table
CREATE TABLE `item`
(
`item_id` INT(10) AUTO_INCREMENT,
`reg_pgm_id` varchar(50) COLLATE utf8_bin NOT NULL,
`reg_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`upd_pgm_id` varchar(50) COLLATE utf8_bin DEFAULT NULL,
`upd_timestamp` timestamp NULL DEFAULT NULL,
`name` VARCHAR(255) NOT NULL,
`code` VARCHAR(255) NOT NULL,
PRIMARY KEY(`item_id`),
UNIQUE KEY `item_idx01` (`code`) USING BTREE,
KEY `item_idx02` (`name`,`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin
;
