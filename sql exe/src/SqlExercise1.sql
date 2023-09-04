-- SQL EXE 1
CREATE DATABASE BOOTCAMP_EXERCISE1;
USE BOOTCAMP_EXERCISE1;


CREATE TABLE REGIONS (
REGION_ID INTEGER ,
REGION_NAME VARCHAR(25) ,
PRIMARY KEY (REGION_ID)
);

CREATE TABLE COUNTRIES (
COUNTRY_ID CHARACTER(2) ,
COUNTRY_NAME VARCHAR(40) ,
REGION_ID INTEGER ,
PRIMARY KEY (COUNTRY_ID),
FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID)
);

CREATE TABLE LOCATIONS (
LOCATION_ID INTEGER ,
STREET_ADDRESS VARCHAR(25) ,
POSTAL_CODE VARCHAR(12) ,
CITY VARCHAR(30) ,
STATE_PROVINCE VARCHAR(12) ,
COUNTRY_ID CHARACTER(2) ,
PRIMARY KEY (LOCATION_ID),
FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)	
);

CREATE TABLE DEPARTMENTS (
DEPARTMENT_ID INTEGER ,
DEPARTMENT_NAME VARCHAR(30) ,
MANAGER_ID INTEGER ,
LOCATION_ID INTEGER ,
PRIMARY KEY (DEPARTMENT_ID),
FOREIGN KEY (LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
);

CREATE TABLE EMPLOYEES (
EMPLOYEE_ID INTEGER,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(25),
EMAIL VARCHAR(20),
PHONE_NUMBER VARCHAR(20),
HIRE_DATE DATE,
JOB_ID VARCHAR(10),
SALARY INTEGER,
COMMISSION_PCT INTEGER ,
MANAGER_ID INTEGER ,
DEPARTMENT_ID INTEGER,
PRIMARY KEY(EMPLOYEE_ID),
FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID),
FOREIGN KEY (JOB_ID) REFERENCES JOBS(JOB_ID),
FOREIGN KEY (EMPLOYEE_ID) REFERENCES JOB_HISTORY(EMPLOYEE_ID)
);

CREATE TABLE JOBS (
JOB_ID VARCHAR(10) ,
JOB_TITLE VARCHAR(35),
MIN_SALARY INTEGER ,
MAX_SALARY INTEGER ,
PRIMARY KEY (JOB_ID)
);

CREATE TABLE JOB_HISTORY (
EMPLOYEE_ID INTEGER,
START_DATE DATE,
END_DATE DATE,
JOB_ID VARCHAR(20),
DEPARTMENT_ID INTEGER,
PRIMARY KEY (EMPLOYEE_ID, START_DATE),
FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID),
FOREIGN KEY (JOB_ID) REFERENCES JOBS(JOB_ID)
);

DROP TABLE EMPLOYEES;
DROP TABLE JOB_HISTORY;
DROP TABLE JOBS;
DROP TABLE DEPARTMENTS;
DROP TABLE LOCATIONS;
DROP TABLE COUNTRIES;
DROP TABLE REGIONS;

SELECT * FROM REGIONS;
SELECT * FROM EMPLOYEES;

INSERT INTO REGIONS (REGION_ID) VALUES (1);
INSERT INTO REGIONS (REGION_ID) VALUES (2);
INSERT INTO REGIONS (REGION_ID) VALUES (3);

INSERT INTO COUNTRIES VALUES ('DE', 'GERMANY', 1);
INSERT INTO COUNTRIES VALUES ('IT', 'ITALY', 1);
INSERT INTO COUNTRIES VALUES ('JP', 'JAPAN', 3);
INSERT INTO COUNTRIES VALUES ('US', 'UNITED STATE', 2);

INSERT INTO LOCATIONS (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, COUNTRY_ID) VALUES (1000, '1297 VIA COLA DI RIE', 989, 'ROMA', 'IT');
INSERT INTO LOCATIONS (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, COUNTRY_ID) VALUES (1100, '93091 CALLE DELLA TE', 10934, 'VENICE', 'IT');
INSERT INTO LOCATIONS  VALUES (1200, '2017 SHINJUKU-KU', 1689, 'TOYKO','TOKYO PREFEC', 'JP');
INSERT INTO LOCATIONS  VALUES (1400, '2014 JABBERWOCKY RD', 26192, 'SOUTHLAKE', 'TEXAS', 'US');

INSERT INTO DEPARTMENTS VALUES (10, 'ADMINISTRATION', 200, 1100);
INSERT INTO DEPARTMENTS VALUES (20, 'MARKETING', 201, 1200);
INSERT INTO DEPARTMENTS VALUES (30, 'PURCHASING', 202, 1400);

INSERT INTO JOBS (JOB_ID) VALUES ('IT_PROG');
INSERT INTO JOBS (JOB_ID) VALUES ('MK_REP');
INSERT INTO JOBS (JOB_ID) VALUES ('ST_CLERK');

INSERT INTO JOB_HISTORY VALUES (102, '1993-01-13', '1998-07-24', 'IT_PROG', 20);
INSERT INTO JOB_HISTORY VALUES (101, '1989-09-21', '1993-10-27', 'MK_REP', 10);
INSERT INTO JOB_HISTORY VALUES (101, '1993-10-28', '1997-03-15', 'MK_REP', 30);
INSERT INTO JOB_HISTORY VALUES (100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30);
INSERT INTO JOB_HISTORY VALUES (103, '1998-03-24', '1999-12-31', 'MK_REP', 20);
INSERT INTO JOB_HISTORY VALUES (200, '1998-07-25', '1999-12-31', 'ST_CLERK', 10);

INSERT INTO EMPLOYEES VALUES (100, 'STEVEN', 'KING', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000, 0, 109, 10);
INSERT INTO EMPLOYEES VALUES (101, 'NEENA', 'KOCHHAR', 'NKOCHHAR', '515-1234568', '1987-06-18', 'MK_REP', 17000, 0, 103, 20);
INSERT INTO EMPLOYEES VALUES (102, 'LEX', 'DE HAAN', 'LDEHAAN', '515-1234569', '1987-06-19', 'IT_PROG', 17000, 0, 108, 30);
INSERT INTO EMPLOYEES VALUES (103, 'ALEXANDER', 'HUNOLD', 'AHUNOLD', '590-1234567', '1987-06-20', 'MK_REP', 9000, 0, 105, 20);
INSERT INTO EMPLOYEES VALUES (200, 'PETER', 'CHU', 'PETERCHU', '590-1234568', '1988-06-20', 'ST_CLERK', 29000, 0, 300, 10);

-- Q3
SELECT L.LOCATION_ID, L.STREET_ADDRESS, L.CITY, L.STATE_PROVINCE,C.COUNTRY_NAME  FROM LOCATIONS L, COUNTRIES C WHERE L.COUNTRY_ID = C.COUNTRY_ID;
-- Q4
SELECT FIRST_NAME, LAST_NAME,DEPARTMENT_ID FROM EMPLOYEES;
-- Q5
SELECT E.FIRST_NAME, E.LAST_NAME, E.DEPARTMENT_ID FROM EMPLOYEES E, DEPARTMENTS D, LOCATIONS L, COUNTRIES C WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID AND D.LOCATION_ID = L.LOCATION_ID AND L.COUNTRY_ID = C.COUNTRY_ID AND C.COUNTRY_NAME = 'JAPAN';
-- Q6
SELECT E.EMPLOYEE_ID, E.LAST_NAME, M.EMPLOYEE_ID, M.LAST_NAME FROM EMPLOYEES E, EMPLOYEES M WHERE E.MANAGER_ID = M.EMPLOYEE_ID;
-- Q7
SELECT E1.FIRST_NAME, E1.LAST_NAME, E1.HIRE_DATE FROM EMPLOYEES E1 WHERE EXISTS ( SELECT * FROM EMPLOYEES E2 WHERE E1.HIRE_DATE > '1987-06-19');
-- Q8
SELECT D.DEPARTMENT_NAME , COUNT(*) AS NUMBER_OF_EMPLOYEES FROM EMPLOYEES E, DEPARTMENTS D
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID GROUP BY D.DEPARTMENT_ID;
-- Q9
SELECT H.EMPLOYEE_ID, J.JOB_TITLE,DATEDIFF(START_DATE, END_DATE) AS NUMBER_OF_DAYS   FROM JOB_HISTORY H, JOBS J WHERE H.JOB_ID = J.JOB_ID AND DEPARTMENT_ID = 30;
-- Q10
SELECT DEPARTMENT_NAME,D.MANAGER_ID, CITY, COUNTRY_NAME  FROM LOCATIONS L, COUNTRIES C, DEPARTMENTS D, EMPLOYEES E WHERE L.LOCATION_ID = D.LOCATION_ID AND C.COUNTRY_ID = L.COUNTRY_ID AND D.MANAGER_ID = E.MANAGER_ID;
;
-- Q11
SELECT ((MIN_SALARY + MAX_SALARY) / COUNT(*)) AS AVERAGE_SALARY FROM EMPLOYEES E, JOBS J WHERE E.JOB_ID = J.JOB_ID GROUP BY E.JOB_ID;