PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE USER(USER_ID VARCHAR(10),USER_NAME VARCHAR(20));
INSERT INTO USER VALUES('Maple','黄先生');
COMMIT;