create database camara;
use camara;

create table album(
id int primary key auto_increment,
nombre varchar(50),
caantidadmaxima int,
fechacreacion date
);

insert into album(nombre,caantidadmaxima,fechacreacion) values ('boda',34,curdate());

create table foto(
id int primary key auto_increment, 
id_album int,
descripcion varchar(200),
nombrearchivo varchar(150),
tamaño int,
foreign key (id_album) references album(id)
);