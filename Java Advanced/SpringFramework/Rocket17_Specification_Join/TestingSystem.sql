-- create database
DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
USE TestingSystem;

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

INSERT INTO Address		(`name`) 
VALUES
						(N'Ha Noi'	),
						(N'Nam dinh'),
						(N'Thai Binh');

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
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
