CREATE TABLE IF NOT EXISTS `tb_master_employee` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `firstName` varchar(50),
    `lastName` varchar(50),
    `prefferedName` varchar(100),
    `gender` varchar(45),
    `phone` varchar(45),
    `dateOfBirth` varchar(45),
    `email` varchar(100),
    `role` varchar(20),
    `password` varchar(100),
	`address` varchar(500),
    `photo` varchar(100),
    `createdBy` varchar(45),
    `createdOn` datetime,
    `updatedBy` varchar(45),
    `updatedOn` datetime,
    `enabled` bit(1)
);