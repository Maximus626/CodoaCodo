create database innerjoin;
use innerjoin;

create table domicilio(
id_domicilio int(11) not null,
id_persona int (11) not null,
pais varchar(45) default null,
cod_postal varchar (45) default null,
primary key (id_domicilio)
);

create table persona(
id_persona int (11) not null auto_increment,
paterno varchar(45) default null,
materno varchar(45) default null,
nombre varchar(45) default null,
primary key(id_persona)
);

 insert into persona(paterno, materno,nombre) values ('mendez','martinez','jose');
 insert into persona(paterno, materno,nombre) values ('lopez','perez','andres');
 
 SELECT * FROM innerjoin.persona;
 
  insert into domicilio(id_domicilio, id_persona, pais, cod_postal) values (1,1,'argentina','1234');
  insert into domicilio(id_domicilio, id_persona, pais, cod_postal) values (2,2,'chile','2442');
  
  SELECT * FROM innerjoin.domicilio;
  
  select tp.nombre, td.pais from persona as tp inner join domicilio as td on tp.id_persona = td.id_persona;