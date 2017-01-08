CREATE DATABASE `auctionme`;
USE `auctionme`;

-- item table
CREATE TABLE `item`
(
`item_id` INT(10) AUTO_INCREMENT,
`reg_pgm_id` varchar(50) COLLATE utf8_bin NULL,
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

CREATE TABLE `user`
(
`user_id` INT(10) AUTO_INCREMENT,
`reg_pgm_id` varchar(50) COLLATE utf8_bin NULL,
`reg_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`upd_pgm_id` varchar(50) COLLATE utf8_bin DEFAULT NULL,
`upd_timestamp` timestamp NULL DEFAULT NULL,
`name` VARCHAR(255) NOT NULL,
`age` VARCHAR(255) NOT NULL,
`city` VARCHAR(255) NOT NULL,
`street` VARCHAR(255) NOT NULL,
`zip_code` VARCHAR(255) NOT NULL,
PRIMARY KEY(`user_id`),
UNIQUE KEY `user_idx01` (`name`) USING BTREE,
KEY `user_idx02` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin
;

