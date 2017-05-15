CREATE DATABASE IF NOT EXISTS universidad;

CREATE TABLE school (
	id int primary key AUTO_INCREMENT,
	name varchar(45) NOT NULL
);

CREATE TABLE user (
	id int primary key AUTO_INCREMENT,
	username varchar(90) NOT NULL UNIQUE,
	password varchar(250) NOT NULL
);

CREATE TABLE teacher (
	id int primary key AUTO_INCREMENT,
	name varchar(45) NOT NULL,
	lastname varchar(45) NOT NULL,
	email varchar(250),
	isDirector bool NOT NULL default 0,
	userID int NOT NULL,
	schoolID int NOT NULL,
	CONSTRAINT fk_teacher_user foreign key(userID) REFERENCES user(id),
	CONSTRAINT fk_visit_school foreign key (schoolID)
	REFERENCES school(id)
);

CREATE TABLE visit (
	id int primary key AUTO_INCREMENT,
    institution varchar(250) NOT NULL,
	visitDate date NOT NULL,
	teacherID int NOT NULL,
	CONSTRAINT fk_visit_teacher foreign key (teacherID)
	REFERENCES teacher(id)
);

INSERT INTO school(name) VALUES 
('Computación'),
('Electrónica'),	
('Eléctrica'),
('Industrial'),
('Mecánica'),
('Biomédica')
;

INSERT INTO user (username, password) VALUES
('cristian.sanchez', 'xa3xi8yIGeE='),
('luis.valdiviezo', 'xa3xi8yIGeE='),
('gerardo.rodas', 'xa3xi8yIGeE='),
('maria.mendosa', 'xa3xi8yIGeE='),
('juan.merino', 'xa3xi8yIGeE='),
('carlos.morataya', 'xa3xi8yIGeE=')
;

INSERT INTO teacher (name, lastname, address, isDirector, userID, schoolID) VALUES
('Cristian', 'Sanchez', '', true, 1, 1),
('Luis', 'Valdiviezo', '', true, 2, 2),
('Gerardo', 'Rodas', '', true, 3, 3),
('Maria', 'Mendosa', '', true, 4, 4),
('Juan', 'Merino', '', true, 5, 5),
('Carlos', 'Morataya', '', true, 6, 6)
;
