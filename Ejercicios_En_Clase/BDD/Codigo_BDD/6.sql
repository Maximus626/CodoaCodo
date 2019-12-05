create database muchosamuchos;
use muchosamuchos;

create table alumno(
dni int not null primary key,
nombre varchar(50) not null
);

insert into alumno (dni,nombre) values (123456789,'maria');
insert into alumno (dni,nombre) values (987654321,'airam');
insert into alumno (dni,nombre) values (123459876,'marai');

select * from alumno;

create table asignatura(
clave int auto_increment primary key,
nombre varchar(50)
);

insert into asignatura (nombre) values ('BDD');
insert into asignatura (nombre) values ('JAVA');
insert into asignatura (nombre) values ('PHP');

create table matricula(
dni int,
clave_mat int,
primary key(dni,clave_mat),
foreign key(dni) references alumno(dni),
foreign key(clave_mat) references asignatura(clave)
);

insert into matricula (dni,clave_mat) values (123456789,1);
insert into matricula (dni,clave_mat) values (987654321,2);
insert into matricula (dni,clave_mat) values (123459876,3);
