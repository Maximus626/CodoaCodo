create database empresa;
use empresa;

create table persona(
registro int auto_increment primary key,
nombre varchar(50),
apellido varchar (50),
telefono int,
direccion varchar(150),
sexo char(1),
check(sexo in('f','m'))
);

create table cliente(
registro int auto_increment primary key,
cedula varchar(50),
referenciaper int,
correo varchar(150),
pagina_web varchar(150),
foreign key (referenciaper) references persona (registro)
);

insert into persona(nombre,apellido,telefono,direccion,sexo)values ('troy','inostroza',7413456,'mozart 2474','m');
insert into persona(nombre,apellido,telefono,direccion,sexo)values ('emi','perez',7363632,'roller coler 2474','m');
insert into persona(nombre,apellido,telefono,direccion,sexo)values ('fabiana','nahir',74182636,'mozart 2474','f');

insert into cliente(referenciaper,cedula,correo,pagina_web)values (1,123456789,'troy@inostroza.com','www.inostroza.com');
insert into cliente(referenciaper,cedula,correo,pagina_web)values (2,987654321,'emiliano@perez.com','www.perez.com');
insert into cliente(referenciaper,cedula,correo,pagina_web)values (3,123456789,'fabiana@nahir.com','www.nahir.com');

select * from persona order by nombre asc;
select * from cliente order by correo desc;
-- ingresar regitros --
-- order by --
-- ordenar por asendente y decendente --
