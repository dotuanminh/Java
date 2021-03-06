-- create database
DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
USE TestingSystem;

-- create table: User
DROP TABLE IF EXISTS 	`User`;
CREATE TABLE IF NOT EXISTS `User` ( 	
	id 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`username`	 	CHAR(50) NOT NULL UNIQUE CHECK (LENGTH(`username`) >= 6 AND LENGTH(`username`) <= 50),
	`email` 		CHAR(50) NOT NULL UNIQUE CHECK (LENGTH(`email`) >= 6 AND LENGTH(`email`) <= 50),
	`password` 		VARCHAR(800) NOT NULL,
	`firstName` 	NVARCHAR(50) NOT NULL,
	`lastName` 		NVARCHAR(50) NOT NULL,
	`role` 			ENUM('Admin','Employee','Manager') NOT NULL DEFAULT 'Employee'
);

DROP TABLE IF EXISTS Address;
CREATE TABLE Address(
	AddressID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `name`					NVARCHAR(30) NOT NULL UNIQUE KEY
);

-- create table: Department
DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	DepartmentID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TotalMember				TINYINT	UNSIGNED,
    DepartmentName 			NVARCHAR(30) NOT NULL UNIQUE KEY,
    AddressID				TINYINT UNSIGNED,
    FOREIGN KEY (AddressID) REFERENCES Address(AddressID)
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

-- password: 123456
INSERT INTO User (`username`,			`email`,						`password`,			`firstName`,	`lastName`, 	`role`)
VALUE			('hanh.havan@vti',		'hanhhanoi1999@gmail.com',		'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Hà',			'Văn Hanh',			'Manager'), 
				('thanhhung12@vti',		'hung122112@gmail.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn ',		'Thanh Hưng',		'Manager'), 
				('can.tuananh@vti',		'cananh.tuan12@vti.com',		'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Cấn',			'Tuấn Anh',			'Manager'), 
				('toananh123@vti',		'toananh123@vti.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Anh Toàn',			'Manager'), 
				('duynn123@vti',		'duynguyen123@vti.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Duy',				'Manager'), 
				('manhhung123@vti',		'manhhung123@vti.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Mạnh Hùng',		'Manager'),
 				('maianhvti123',		'maianhng@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Mai Anh',			'Employee'),
				('tuanvti12344',		'tuan1234@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Văn Tuấn',			'Employee'),
				('ngthuy123',			'thuyhanoi@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Thị Thủy',			'Employee'),
				('quanganhvti',			'quanganh@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Quang Anh',		'Manager'),
				('hoanghungvti',	    'hunghoang@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',   'Vũ',			'Hoàng Hưng',		'Employee'),
				('quocanhvti',			'quocanh12@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Quốc Anh',			'Admin'	),
				('vananhvti',			'vananhb1@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Vân Anh',			'Employee'),
				('nguyentrinhvti',		'trinh123@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Thị Trinh',		'Manager'),
				('tuanhungvti',			'tuanhung@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Vũ',			'Tuấn Hưng',		'Employee'),
				('xuanmaivti',			'xuanmai12@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Xuân Mai',			'Employee'),
				('quanghungvti',		'hungnguyen@gmail.com', 		'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Phạm',			'Quang Hưng',		'Employee');
						
INSERT INTO Address		(`name`) 
VALUES
						(N'Ha Noi'	),
						(N'Nam dinh'),
						(N'Thai Binh');

-- Add data Department
INSERT INTO Department(DepartmentName, TotalMember, AddressID) 
VALUES
						(N'Marketing'	, 1	,			1				),
						(N'Sale'		, 2	,			2				),
						(N'Bảo vệ'		, 3	,			3				),
						(N'Nhân sự'		, 4	,			1				),
						(N'Kỹ thuật'	, 5	,			1				),
						(N'Tài chính'	, 6	,			2				),
						(N'Phó giám đốc', 7	,			3				),
						(N'Giám đốc'	, 8	,			2				),
						(N'Thư kí'		, 9	,			1				),
						(N'Bán hàng'	, 10,			2				);
