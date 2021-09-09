DROP DATABASE IF EXISTS Final_Exam;
CREATE DATABASE Final_Exam;
USE  Final_Exam;

CREATE TABLE `User`(
    UserID   TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
    FullName    VARCHAR(50) NOT NULL ,
    Email       VARCHAR(50) NOT NULL ,
    Password    VARCHAR(100) NOT NULL ,
    ExpInYear   TINYINT UNSIGNED,
    ProSkill    ENUM('DEV', 'TEST', 'JAVA','SQL'),
    ROLE        ENUM('MANAGER', 'EMPLOYEE')
);

CREATE TABLE `Project`(
    ProjectID   TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
    ProjectName VARCHAR(50) NOT NULL ,
    TeamSize    TINYINT UNSIGNED NOT NULL
);

CREATE TABLE `AccountProject`(
    ProjectID   TINYINT UNSIGNED NOT NULL ,
    UserID   TINYINT UNSIGNED NOT NULL ,
    PRIMARY KEY (ProjectID,UserID)
);

INSERT INTO `User`      (     FullName      ,       Email           , Password , ExpInYear , ProSkill  ,   ROLE   )
VALUES                  ('Đỗ Tuấn Minh'     , 'tuanminh@gmail.com'   , '220702',       5   ,   'DEV'   , 'MANAGER'),
                        ('Nguyễn Quốc'  , 'hoamai@gmail.com'    , '123456A',       5   ,   'TEST'  , 'MANAGER'),
                        ('Nguyễn Hoàng ' , 'hoanganh@gmail.com'  , '123456A',       1   ,   'SQL'   ,'EMPLOYEE'),
                        ('Nguyễn Tùng'   , 'huutung@gmail.com'   , '123456A',      NULL ,   'TEST'  ,'EMPLOYEE'),
                        ('Lê  Quỳnh'    , 'thuyquynh@gmail.com' , '123456A',       1   ,   'JAVA'  ,    NULL  ),
                        ('Minh'    , 'tuanminh@gmail.com'  , '123456A',      NULL ,   'JAVA'  ,    NULL  ),
                        ('Linh'  , 'linhnguyen@gmail.com', '123456A',       5   ,   'JAVA'  ,'EMPLOYEE'),
                        ('Trương Hoàng Minh', 'hoangminh@gmail.com' , '123456A',       5   ,   'SQL'   ,'EMPLOYEE'),
                        ('Nguyễn Lực'   ,  'daoluc@gmail.com'   , '123456A',       5   ,   'TEST'  ,'EMPLOYEE');

INSERT INTO `Project`   (ProjectName    , TeamSize)
VALUES                  ('Project DEV'  ,     1   ),
                        ('Project TEST' ,     1   ),
                        ('Project JAVA' ,    2  ),
                        ('Project SQL'  ,     1   ),
                        ('Project DEV'  ,    2   ),
                        ('Project SQL'  ,     2   ),
                        ('Project JAVA' ,     3   ),
                        ('Project TEST' ,     2   );

INSERT INTO `AccountProject`    (ProjectID,  UserID  )
VALUES                          (   1     ,     1    ),
                                (   2     ,     2    ),
                                (   3     ,     3    ),
                                (   4     ,     3    ),
                                (   1     ,     5    ),
                                (   7     ,     2    ),
                                (   8     ,     1    ),
                                (   2     ,     8    ),
                                (   1     ,     7    );