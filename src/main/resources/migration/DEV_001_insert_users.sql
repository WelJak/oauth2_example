--liquibase formatted sql
--changeset author:weljak context:development
INSERT INTO `users` (`email`,`passwordHash`,`active`) VALUES
	('admin@admin.pl', '$2a$10$d8gv6jyA/He8va6QMSEEmuwpQM1XFKgEgj8TTGxJ13lHBQ6ftT9Bm', 1), -- password is 'admin'
	('test@test.pl', '$2a$10$u3AJC2e8fQ7bapCZh6I6Re4siOLimyBkPp.E//Ae07CSdW1SrRrFu', 1); -- password is 'test'