## DROP DATABASE book;

CREATE DATABASE IF NOT EXISTS book;
use book;

CREATE TABLE IF NOT EXISTS ORDERS_DETAILS (
	no INTEGER AUTO_INCREMENT PRIMARY KEY,
	orders_no INTEGER NOT NULL,
	member_no INTEGER NOT NULL,
	book_no INTEGER NOT NULL,
	quantity INTEGER NULL,
	FOREIGN KEY (orders_no) REFERENCES ORDERS (no),
	FOREIGN KEY (member_no) REFERENCES MEMBER (no)
);
INSERT INTO ORDERS_DETAILS(orders_no,member_no,book_no,quantity)
VALUES('1','1','1','3');
select * from orders_details;
commit;