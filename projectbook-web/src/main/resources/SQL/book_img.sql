## DROP DATABASE book;

CREATE DATABASE IF NOT EXISTS book;
use book;

CREATE TABLE IF NOT EXISTS BOOK_IMG(
	book_no INTEGER NOT NULL,
    img VARCHAR(100) NULL,
    FOREIGN KEY(book_no) references BOOK(no)
);
INSERT INTO BOOK_IMG(book_no,img)
VALUES('1','FILE ADDRESS');
COMMIT;
SELECT * FROM BOOK_IMG;