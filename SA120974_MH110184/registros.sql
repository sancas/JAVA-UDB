insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Cristian', 'Sanchez', 'crice2o@dell.com', 'Male', 'estudiante', '123');
insert into estudiantes_materias (idEstudiante, idMateria) values (101, 1); --Inscribir al estudiante a la materia 1
insert into estudiantes_materias (idEstudiante, idMateria) values (101, 2); -- Inscribir al estudiante a la materia 2
insert into actividadesAEvaluar values (30);
insert into actividadesAEvaluar values (30);
insert into actividadesAEvaluar values (40);
insert into actividadesAEvaluar_materias (idActividadesAEvaluar, idMateria) values (1, 1);
insert into actividadesAEvaluar_materias (idActividadesAEvaluar, idMateria) values (2, 1);
insert into actividadesAEvaluar_materias (idActividadesAEvaluar, idMateria) values (3, 1);
insert into actividadesAEvaluar_materias (idActividadesAEvaluar, idMateria) values (1, 2);
insert into actividadesAEvaluar_materias (idActividadesAEvaluar, idMateria) values (2, 2);
insert into actividadesAEvaluar_materias (idActividadesAEvaluar, idMateria) values (3, 2);
ALTER TABLE `notas` CHANGE `nota` `nota` DECIMAL NOT NULL; -- Se necesita cambiar este tipo de dato en la base
insert into notas (idActividadesAEvaluar, idEstudiante, nota) values (1, 101, 6);
insert into notas (idActividadesAEvaluar, idEstudiante, nota) values (2, 101, 5);
insert into notas (idActividadesAEvaluar, idEstudiante, nota) values (3, 101, 10);
insert into notas (idActividadesAEvaluar, idEstudiante, nota) values (2, 101, 8);
insert into notas (idActividadesAEvaluar, idEstudiante, nota) values (3, 101, 9);
insert into notas (idActividadesAEvaluar, idEstudiante, nota) values (1, 101, 2);