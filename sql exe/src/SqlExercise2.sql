
-- SQL Exercise 2
CREATE DATABASE ORG;
SHOW DATABASES;
USE ORG;

CREATE TABLE WORKER (
  WORKER_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FIRST_NAME CHAR(25),
  LAST_NAME CHAR(25),
  SALARY NUMERIC(15),
  JOINING_DATE DATETIME,
  DEPARTMENT CHAR(25)
);

-- inesrt data to worker
INSERT INTO WORKER 
  (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    ('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
    ('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
    ('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
    ('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
    ('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
    ('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
    ('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
    ('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
    ('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

-- create table bonus
CREATE TABLE BONUS (
  WORKER_REF_ID INTEGER,
  BONUS_AMOUNT NUMERIC(10),
  BONUS_DATE DATETIME,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

-- Task 1
insert into BONUS values (6, 32000, '21-11-02 09:00:00');
INSERT INTO BONUS VALUES (6, 20000, '22-11-02 09:00:00');
INSERT INTO BONUS VALUES (5, 21000, '21-11-02 09:00:00');
INSERT INTO BONUS VALUES (9, 30000, '21-11-02 09:00:00');
INSERT INTO BONUS VALUES (8, 4500, '22-11-02 09:00:00');

-- TASK 2
SELECT * FROM WORKER ORDER BY SALARY DESC LIMIT 1 OFFSET 1;

-- TASK 3
WITH MAX_SALARY AS(
SELECT MAX(W1.SALARY) AS SALARY, W1.DEPARTMENT 
FROM WORKER W1 GROUP BY W1.DEPARTMENT)
SELECT W2.FIRST_NAME, W2.LAST_NAME, W2.SALARY, W2.DEPARTMENT
FROM WORKER W2, MAX_SALARY 
WHERE W2.SALARY = MAX_SALARY.SALARY AND W2.DEPARTMENT = MAX_SALARY.DEPARTMENT;

-- TASK 4
SELECT W1.WORKER_ID, W1.SALARY FROM WORKER W1, WORKER W2 
WHERE W1.SALARY = W2.SALARY AND W1.WORKER_ID <> W2.WORKER_ID;

-- TASK 5
SELECT W.WORKER_ID, W.FIRST_NAME, W.LAST_NAME, W.SALARY, BONUS_AMOUNT FROM WORKER W, BONUS B WHERE W.WORKER_ID = B.WORKER_REF_ID AND YEAR(BONUS_DATE) = 2021;

-- TASK 6
-- SINCE WORKER IS THE PARENT OF BONUS, IF YOU WANT TO DELATE THE RECORD OF TABLE WORKER,
-- WE NEED TO DELETE THE RECORD OF TABLE BONUS FIRST

-- TASK 7
-- SAME AS TASK 6

