## DROP DATABASE book;

CREATE DATABASE IF NOT EXISTS book;
use book;

DROP TABLE IF EXISTS book;

CREATE TABLE IF NOT EXISTS BOOK (
	no INTEGER AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(50) NOT NULL,
	author VARCHAR(50) NOT NULL,
	publisher VARCHAR(50) NOT NULL,
	publication_date TIMESTAMP NOT NULL,
	description VARCHAR(1200) NULL,
	price INTEGER NOT NULL,
	discount INTEGER NULL
);
INSERT INTO book(title,author,publisher, publication_date,description, price, discount)
VALUES ('book1','authortest01','publishertest01','2020-1-1','test01','10000','5');
commit;
select * from book;