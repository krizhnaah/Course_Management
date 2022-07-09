--TO KILL SESSION

	--FIND SESSION ID(pid)
	
SELECT * FROM pg_stat_activity;

	--KILL SESSION
	
SELECT pg_terminate_backend(pid) 
FROM pg_stat_activity
WHERE pid = '80';

--CREATE DATABASE

DROP DATABASE IF EXISTS INSTITUTE_DB;
CREATE DATABASE INSTITUTE_DB;


-- CREATE SCHEMA 
DROP SCHEMA IF EXISTS PUBLIC CASCADE;
DROP SCHEMA IF EXISTS COURSE_SCHEMA CASCADE;
CREATE SCHEMA course_schema;

-- CREATE TABLES

--CORUSE TABLE

DROP TABLE IF EXISTS course_schema.course;
CREATE TABLE course_schema.course
(
	id SMALLINT PRIMARY KEY,
	name VARCHAR(30) NOT NULL UNIQUE,
	fee NUMERIC NOT NULL
);

--ALTER TABLE course_schema.course
--	ADD COLUMN course_fee NUMERIC;

--SUBJECT TABLE

DROP TABLE IF EXISTS course_schema.subject;
CREATE TABLE course_schema.subject
(
	id INT PRIMARY KEY,
	name VARCHAR(30) NOT NULL UNIQUE,
	duration TIME
);

--RELATION TABLE FOR COURSE AND SUBJECT

DROP TABLE IF EXISTS course_schema.course_subject_relation;
CREATE TABLE course_schema.course_subject_relation
(
	subject_id INT,
	course_id SMALLINT,
	
	FOREIGN KEY (subject_id) REFERENCES	course_schema.subject(id),
	FOREIGN KEY (course_id) REFERENCES	course_schema.course(id),
	
	CONSTRAINT course_subject_pk PRIMARY KEY(subject_id , course_id)
);



--STUDENT DEPENDENCES

--STATE TABLE

--DROP STATE TABLE


DROP TABLE IF EXISTS course_schema.state;
CREATE TABLE IF NOT EXISTS course_schema.state
(
	id SMALLINT PRIMARY KEY,
	name VARCHAR(30) NOT NULL UNIQUE
);
	

--city table

DROP TABLE IF EXISTS course_schema.city;
CREATE TABLE IF NOT EXISTS course_schema.city
(
	id SMALLINT PRIMARY KEY,
	name VARCHAR(30) NOT NULL UNIQUE,
	state SMALLINT,
	 
	FOREIGN KEY (state) REFERENCES course_schema.state(id)
);

--CREATE GENDER TABLE

DROP TABLE IF EXISTS course_schema.gender;
CREATE TABLE course_schema.gender
(
	id SMALLINT PRIMARY KEY,
	name VARCHAR(6)
);

-- EMPLOYEE TABLE

DROP TABLE IF EXISTS course_schema.designation;
CREATE TABLE course_schema.designation
(
	id SMALLINT PRIMARY KEY,
	name VARCHAR
);


DROP TABLE IF EXISTS course_schema.employee;
CREATE TABLE course_schema.employee
(
	id INT PRIMARY KEY,
	name VARCHAR(30) NOT NULL,
	age SMALLINT,
	gender SMALLINT NOT NULL,
	qualification VARCHAR(30),
	designation SMALLINT NOT NULL,
	hobby VARCHAR(50),
-- 	city VARCHAR(50) NOT NULL,
	city SMALLINT NOT NULL,
	doj DATE DEFAULT CURRENT_DATE,
	phone_num BIGINT NOT NULL,
	email VARCHAR(30) NOT NULL,
	pincode INT,
	
	FOREIGN KEY (gender) REFERENCES course_schema.gender(id),
	FOREIGN KEY (city) REFERENCES course_schema.city(id),
	FOREIGN KEY (designation) REFERENCES course_schema.designation(id)
);


DROP TABLE IF EXISTS course_schema.batch;
CREATE TABLE course_schema.batch
(
	id SMALLINT PRIMARY KEY,
	time TIME NOT NULL
);

DROP TABLE IF EXISTS course_schema.batch_employee_relation;
CREATE TABLE course_schema.batch_employee_relation
(
	employee_id INT,
	batch_id SMALLINT,
	
	FOREIGN KEY (employee_id) REFERENCES course_schema.employee(id),
	FOREIGN KEY (batch_id) REFERENCES course_schema.batch(id),
	
	CONSTRAINT batch_employee_pkey PRIMARY KEY (employee_id,batch_id)
);


--CREATE STUDENT TABLE

DROP TABLE IF EXISTS course_schema.student;
CREATE TABLE course_schema.student
(
	id INT PRIMARY KEY,
	name VARCHAR(30) NOT NULL,
	batch SMALLINT,
	age SMALLINT,
	gender SMALLINT NOT NULL,
	qualification VARCHAR(30),
-- 	city VARCHAR(50) NOT NULL,
	city SMALLINT NOT NULL,
	doj DATE DEFAULT CURRENT_DATE,
	paid_fee NUMERIC,
	phone_num BIGINT NOT NULL,
	email VARCHAR(30) NOT NULL,
	pincode INT,
	
	FOREIGN KEY (gender) REFERENCES course_schema.gender(id),
	FOREIGN KEY (city) REFERENCES course_schema.city(id),
	FOREIGN KEY (batch) REFERENCES course_schema.batch(id)
);


DROP TABLE IF EXISTS course_schema.student_batch_relation;
CREATE TABLE course_schema.student_batch_relation
(
	batch_id SMALLINT,
	student_id INT,
	
	
	FOREIGN KEY (batch_id) REFERENCES course_schema.batch(id),
	FOREIGN KEY (student_id) REFERENCES course_schema.student(id),
	
	CONSTRAINT student_batch_pk PRIMARY KEY(batch_id , student_id)
);




	
--relation table for student and course

DROP TABLE IF EXISTS course_schema.student_course_relation;
CREATE TABLE course_schema.student_course_relation
(
	course_id SMALLINT,
	student_id INT,
	
	FOREIGN KEY (course_id) REFERENCES course_schema.course(id),
	FOREIGN KEY (student_id) REFERENCES course_schema.student(id),
	
	CONSTRAINT student_course_pkey PRIMARY KEY (course_id, student_id)
);

--relation table for student and staff

--DROP TABLE IF EXISTS course_schema.student_staff_relation;
--CREATE TABLE course_schema.student_staff_relation
--(
--	staff_id INT,
--	student_id INT,
	
--	FOREIGN KEY (staff_id) REFERENCES course_schema.staff(staff_id),
--	FOREIGN KEY (student_id) REFERENCES course_schema.student(student_id),
	
--	CONSTRAINT student_staff_pkey PRIMARY KEY (staff_id, student_id)
--);

--relation table for course and staff

DROP TABLE IF EXISTS course_schema.subject_employee_relation;
CREATE TABLE course_schema.subject_employee_relation
(
	employee_id INT,
	subject_id INT,
	
	FOREIGN KEY (employee_id) REFERENCES course_schema.employee(id),
	FOREIGN KEY (subject_id) REFERENCES course_schema.subject(id),
	
	CONSTRAINT subject_employee_pkey PRIMARY KEY (employee_id, subject_id)
);

SELECT * FROM course_schema.STUDENT;