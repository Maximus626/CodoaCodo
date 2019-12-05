create database db;
use db;
create table productos(
idproducto int auto_increment primary key,
nombre varchar(50) not null,
precio decimal(10,2) not null,
fecha_alta date default '0000-00-00'
);

show tables; -- muestra todas las tabas de la bdd --
show columns from productos; -- muestra las columnas de la tabla --
show create table productos; -- muestra el codigo de creacion de a tabla --
rename table productos to producto; -- renombrar tabla --
show columns from producto;
alter table producto add existencia int  not null; -- agregar campo a la tabla --
alter table producto drop column existencia; -- eliminar campo de la tabla --
alter table producto change precio precios decimal(18,2) not null;

delimiter $
create procedure insertar(in nom varchar(50), in pre decimal(10,2) )
begin
insert into producto (nombre,precios,fecha_alta) values(nom,pre,curdate);
end $

call insertar('gallete', 10,5);
call insertar ('chocolate',34,5);
call insertar ('chocolate blanco', 34,5);
call insertar ('pepsi',70,5);

select * from producto;

-- llave foranea --


