create database computador;
use computador;

create table tipo_producto(
id_tipo_producto int auto_increment,
nombreTpo varchar (45),
primary key(id_tipo_producto));

show columns from tipo_producto;

create table productos(
cod_producto varchar(10) primary key,
decripcion varchar (225),
pCompraUSD float,
pCompraPesos float,
pVentaPesos float,
id_tipo_producto int,
foreign key(id_tipo_producto) references tipo_producto(id_tipo_producto));

show columns from tipo_producto;

insert into tipo_producto(nombreTpo)values ("Memoria RAM");
insert into tipo_producto(nombreTpo)values ("Memoria ROM");

select * from tipo_producto;

insert into productos(cod_producto,decripcion,pCompraUSD,pCompraPesos,pVentaPesos,id_tipo_producto) values (001,'DDR3',3,120,200,1);

select * from productos;





