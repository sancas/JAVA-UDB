CREATE DATABASE db_employees;
USE db_employees;

CREATE TABLE employees (
lname_txt CHAR(50),
fname_txt CHAR(50),
employee_num INTEGER PRIMARY KEY,
address1_txt CHAR(120),
address2_txt CHAR(120),
city CHAR(50),
state CHAR(2),
zip CHAR(10),
phone CHAR(14)
);

INSERT INTO employees VALUES('Jones', 'Bob', 1, '27 Mockingbird Lane', NULL, 'Springfield', 'MA', '11223-4321', '1-617-555-1212');
INSERT INTO employees VALUES('Smith', 'John', 2, '55 Boring Street Name', 'Apt 1', 'Rosswell', 'NM', '65444-4556', '1-800-AMA-LIEN');
INSERT INTO employees VALUES('Pattinson', 'Robert', 3, '29 Old Street Name', 'Apt 2', 'Kansas', 'NM', '65445-4556', '1-800-AME-LIEN');