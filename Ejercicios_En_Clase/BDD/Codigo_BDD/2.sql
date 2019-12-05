create database primeratabla;
create schema primeratabla;

drop database primeratabla; 

use primeratabla;

create table coche(
numero_chasis varchar(45) not null,
matricula varchar(45) not null,
dni_propietario varchar(45) not null
);

desc coche;
select * from coche;

insert into coche(numero_chasis, matricula, dni_propietario)
	   VALUES('5tfem5f10ax007210', '4817 BFK', '45338600L'),
			 ('6hsen2j98as001982', '8810 CLM', '02405068K'),
			 ('5rgsb7a19js001982', '0019 GGL', '40588860J');
             
-- SEGUNDO ejercicio --

use primeratabla;

create table adminstrador(
id_administrador int not null,
nombre varchar(45) not null,
telefono varchar(45) not null
);

select * from administrador;

insert into administrador(id_administrador,nombre,telefono)
values(1,'pepe','123334');

-- TERCER ejercicio --

use primeratabla;

create table adminstradores(
id_administrador int not null auto_increment,
nombre varchar(45) not null,
telefono varchar(45) not null,
primary key(id_administrador)
);

select * from administradores;
desc administradores;

insert into administradores(nombre,telefono)
values('pepe','123334');

insert into administradores(nombre,telefono)
values('daniel','123456');

-- CUARTO ejercicio --

use primeratabla;

create table especies(
cod_especie varchar(30) not null,
nombre_espeie varchar(20) not null,
tipo varchar(10) not null,
periodos_migratorios varchar(30),
caracteristicasgenerales varchar(30) not null,
primary key (cod_especie)
);

-- QUINTO ejercicio --

use primeratabla;

update administradores set nombre='popo' where id_administrador=1;
select * from administradores;

-- QUINTO ejercicio --

use primeratabla;
delete from administradores where id_administrador=2;
select * from administradores;

delete from administradores where nombre='daniel';

