CREATE TABLE teacher (
	id int primary key identity(1,1),
	name varchar(45) NOT NULL,
	lastname varchar(45) NOT NULL,
	address varchar(45),
	isDirector boolean NOT NULL,
	userID int NOT NULL,
	shcoolID int NOT NULL
	CONSTRAINT fk_teacher_user foreign key(userID)
	REFERENCES user(id),
	CONSTRAINT fk_visit_school foreign key (schoolID)
	REFERENCES school(id),
	DEFAULT false FOR isDirector
)

CREATE TABLE school (
	id int primary key identity(1,1),
	name varchar(45) NOT NULL
)

CREATE TABLE visit (
	id int primary key identity(1,1),
	visitDate date NOT NULL,
	teacherID int NOT NULL,
	CONSTRAINT fk_visit_teacher foreign key (teacherID)
	REFERENCES teacher(id),
)

CREATE TABLE user (
	id int primary key identity(1,1),
	username varchar(15) NOT NULL UNIQUE,
	password varchar(250) NOT NULL,
)

INSERT INTO user(username, password) VALUES("sancas",	)
INSERT INTO teacher(name, lastname, isDirector, userID)