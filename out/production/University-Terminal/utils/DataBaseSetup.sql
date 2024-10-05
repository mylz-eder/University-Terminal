-- this is the process of starting a database that this program can interact with
--
--     Enter Username: sys as sysdba
--     Enter Password:
--
--     ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
--     CREATE USER INTERNALLOGIN IDENTIFIED BY INTERNALLOGIN1234;
--     GRANT DBA TO INTERNALLOGIN;
--     QUIT
--
--     TERMINAL: SQL-PLUS
--
--     Enter Username: INTERNALLOGIN
--     Enter Password: INTERNALLOGIN1234
--
-- Connected to:
-- Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
-- Version 21.3.0.0.0
--

-- CREATE TABLE STUDENT_TBL (
-- ID NUMBER(20) PRIMARY KEY,
-- REGISTRATION_NUMBER NUMBER(15) NOT NULL UNIQUE,
-- USERNAME NVARCHAR2(20) NOT NULL UNIQUE,
-- PASSWORD NVARCHAR2(30) NOT NULL,
-- ACTIVE NUMBER(1) NOT NULL,
-- NAME NVARCHAR2(10) NOT NULL,
-- BIRTHDATE DATE NOT NULL,
-- PROGRAM NUMBER (6) NOT NULL
-- )

-- CREATE SEQUENCE STUDENT_SEQ START WITH 50000 INCREMENT BY 1

-- INSERT INTO STUDENT_TBL (ID, REGISTRATION_NUMBER, USERNAME, PASSWORD, ACTIVE, NAME, BIRTHDATE ,PROGRAM) VALUES (20, 501010, 'turd' , 'turd1234' , 1 , 'john', TO_DATE('2024-05-12', 'YYYY-MM-DD') , 400);

-- create table person_tbl (
--                             ID NUMBER(10) PRIMARY KEY,
--                             USERNAME NVARCHAR2(20) NOT NULL,
--                             SOCIAL_SECURITY NVARCHAR2(20) NOT NULL,
--                             FIRST_NAME NVARCHAR2(15) NOT NULL,
--                             LAST_NAME NVARCHAR2(25) NOT NULL,
--                             PHONE_NUMBER NVARCHAR2(14) NOT NULL,
--                             BIRTHDATE DATE NOT NULL,
--                             ACCESS_LEVEL NUMBER(1) NOT NULL
-- )



-- CREATE TABLE USER_TBL (
--             USER_ID NUMBER(10) PRIMARY KEY,
--             FIRST_NAME NVARCHAR2(15),
--             LAST_NAME NVARCHAR2(15),
--             USERNAME NVARCHAR2(30) NOT NULL,
--             PASSWORD NVARCHAR2(30) NOT NULL,
--             PHONE_NUMBER NVARCHAR2(15) NOT NULL,
--             EMAIL NVARCHAR2(50) NOT NULL,
--             SOCIAL_SECURITY NVARCHAR2(9) NOT NULL,
--             ADDRESS NVARCHAR2(70),
--             BIRTHDATE DATE NOT NULL,
--             ROLE NUMBER(1),
--             CREATED_AT TIMESTAMP,
--             LAST_UPDATED_AT TIMESTAMP
-- )
-- INSERT INTO USER_TBL (
--     USER_ID, FIRST_NAME, LAST_NAME,
--     USERNAME, PASSWORD,
--     PHONE_NUMBER, EMAIL,
--     SOCIAL_SECURITY, ADDRESS,
--     BIRTHDATE,
--     ROLE, CREATED_AT, LAST_UPDATED_AT
-- )
-- VALUES (
--            1001,
--            'John',
--            'Doe',
--            'johndoe123',
--            'password123!',
--            '123-456-7890',
--            'john.doe@example.com',
--            '123456789',
--            '123 Elm Street, Springfield, IL',
--            TO_DATE('1990-06-15', 'YYYY-MM-DD'),
--            1,
--            SYSTIMESTAMP,
--            SYSTIMESTAMP
--        );
--


-- CREATE SEQUENCE USER_SEQ START WITH 100 INCREMENT BY 1;

-- CREATE SEQUENCE STUDENT_SEQ START WITH 8000 INCREMENT BY 1;
--
-- CREATE SEQUENCE FACULTY_SEQ START WITH 40000 INCREMENT BY 1;
--
-- CREATE SEQUENCE TEACHER_SEQ START WITH 50000 INCREMENT BY 1;