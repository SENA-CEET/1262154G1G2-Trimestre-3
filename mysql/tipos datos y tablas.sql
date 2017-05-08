#TIPOS DE DATOS Y TABLAS



create schema ejemplotiposdatos;

#tipos de datos numericos ojo esta tabla no cumple la regla de integridad de entidad
CREATE TABLE ejemplotiposdatos.tabla1 (
    campo1 TINYINT,
    campo2 TINYINT UNSIGNED,
    campo3 SMALLINT,
    campo4 SMALLINT UNSIGNED,
    campo5 MEDIUMINT,
    campo6 MEDIUMINT UNSIGNED,
    campo7 INT,
    campo8 INT UNSIGNED,
    campo9 BIGINT,
    campo10 bigint unsigned,
    
    campo11 bit,
    
    campo12 bool,
    campo13 boolean,
    
    campo14 integer,
    campo15 integer unsigned,
    
    campo16 decimal,
    campo17 dec,
    
    campo18 float,
    campo19 float unsigned,
    
    campo20 double,
    campo21 double unsigned,
    campo22 double precision,
    campo23 double precision unsigned,
    campo24 real,
    campo25 real unsigned,
    
    campo26 numeric
    
    
    
    
);

#borrar tablas
drop table ejemplotiposdatos.tabla1;

#tipos de datos date and time
#borrar tabla
drop table ejemplotiposdatos.tabla2;

#crear la tabla
create table ejemplotiposdatos.tabla2(
	campo1 date,
    campo2	datetime,
    campo3 timestamp,
    campo4 time,
    campo5 year

);


#tipos de datos cadena
#borrar tabla
drop table ejemplotiposdatos.tabla3;

#crear la tabla
create table ejemplotiposdatos.tabla3(
	campo1 char primary key,
    campo2 char(4),
    campo3 varchar(100),
    campo4 tinyblob,
    campo5 tinytext,
    
    
    campo6 blob,
    campo7 text,
    campo8 mediumblob,
    campo9 mediumtext,
    campo10 longblob,
    campo11 enum('casa','carro','camion'),
    campo12 set('a','b'),
    campo13 binary,
    campo14 varbinary(12)
    

);


