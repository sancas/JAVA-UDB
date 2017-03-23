CREATE DATABASE db_authors;

USE db_authors;

CREATE TABLE authors (
au_id varchar(11) NOT NULL PRIMARY KEY,
au_lname varchar(40) NOT NULL,
au_fname varchar(40) NOT NULL,
phone varchar(12) NOT NULL,
address varchar(40) NOT NULL,
city varchar(20) NOT NULL,
state varchar(5) NOT NULL,
zip varchar(5) NOT NULL);

CREATE TABLE editorial (
nombre varchar(150) primary key unique not null,
sitioWeb varchar(100) not null,
telefono varchar(10) not null,
direccion varchar(200) not null,
mail varchar(200));

INSERT INTO authors VALUES('A0001', 'Garcia Marquez', 'Gabriel', '0052775754', 'Iztapalapa', 'Mexico DF', 'DIF', '00-16');
INSERT INTO authors VALUES('A0002', 'Verne', 'Julio', 'N/A', 'Paris', 'Paris', 'FR-75', '75001');

INSERT INTO editorial VALUES('" + jtxtNombre + "', '" + jtxtSitioWeb + "', '" + jtxtTelefono + "', '" + jtxtDireccion + "', '" + jtxtEmail + "')";