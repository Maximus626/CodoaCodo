create database test;
use test;
create table usuario(
id_usuario int primary key auto_increment not null,
nombre varchar(150) not null,
apellido varchar(150)not null,
fecha_reg timestamp default current_timestamp);

select * from usuario;

desc usuario;

delimiter $
create procedure insertar(in nom varchar(150), in ape varchar(150))
begin
insert into usuario(nombre,apellido) values(nom,ape);
end $

call insertar('pepe','argento');
call insertar ('daniel','cobo');

select * from usuario;

-- Segundo ejercicio --

delimiter $
create procedure borrar(in id int)
begin
delete from usuario where id_usuario=id;
end $

call borrar(2);
select * from usuario;

-- Tercer ejercicio --

delimiter $
create procedure actualizar(in id int, in nom varchar(150), in ape varchar(150))
begin
update usuario set nombre=nom , apellido=ape where id_usuario=id;
end $

call actualizar(1,'daniel','escada');
select * from usuario;
