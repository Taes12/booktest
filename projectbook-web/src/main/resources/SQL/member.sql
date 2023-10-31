## DROP DATABASE book;

CREATE DATABASE IF NOT EXISTS book;
use book;

DROP TABLE member;

CREATE TABLE IF NOT EXISTS member(
	no INTEGER AUTO_INCREMENT PRIMARY KEY,
    id VARCHAR(20) NOT NULL,
    pass VARCHAR(50) NOT NULL,
    name VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL,
    birth TIMESTAMP NOT NULL,
    zip INTEGER NOT NULL,
    address1 VARCHAR(100) NOT NULL,
    address2 VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    nickname VARCHAR(20) NOT NULL,
    point INTEGER NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO member(id, pass, name, email, birth, zip, address1, address2, phone, nickname, point)
VALUES ('test01', '1234', '김똥개', 'test01@naver.com', '1997-10-10', 07022, '서울특별시 동작구 사당로16길 149', '신성빌라 302호', '010-1111-1111', '테스트01', 100000);

commit;
SELECT * FROM member;