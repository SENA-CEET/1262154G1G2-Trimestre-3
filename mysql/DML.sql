#Sentencias DML

#Insert


INSERT INTO observador_de_proyectos.rol VALUES ('rolejemplo', 'este es un ejempoo', TRUE);
INSERT INTO observador_de_proyectos.tipo_documento VALUES ('CC', 'Cedula de ciudadania', TRUE);
INSERT INTO observador_de_proyectos.cliente VALUES ('CC', '80013231', 'hernando', 'enrique', 'moreno', 'moreno');
INSERT INTO observador_de_proyectos.cliente (tipo_documento, numero_documento, primer_nombre, primer_apellido)
VALUES ('CC', '8001323155', 'hernando', 'moreno');

INSERT INTO ejemplodml.cliente (
  tipo_documento,
  numero_documento,
  primer_nombre,
  segundo_nombre,
  prmer_apellido) VALUES (
  'cc',
  '79870',
  'asdfa',
  'asdfasdf',
  'asdfasdf'
);

#update

#UPDATE Syntax
#UPDATE table_name
#SET column1 = value1, column2 = value2, ...
#WHERE condition;

update observador_de_proyectos.cliente
set primer_Nombre= 'jose',
	segundo_Nombre = 'daniel',
    primer_apellido = 'velasquez',
    segundo_Apellido = 'ortega'
where tipo_Documento = 'CC' and numero_Documento = '8001323155';

insert into observador_de_proyectos.tipo_documento values('TI','targeta de identidad', true);
update observador_de_proyectos.cliente
set tipo_Documento= 'TI',
	numero_Documento = 'asd'
where tipo_Documento = 'CC' and numero_Documento = '8001323155';

#delete

#DELETE Syntax
#DELETE FROM table_name
#WHERE condition;

delete from observador_de_proyectos.cliente
where tipo_Documento = 'TI' and numero_Documento = 'asd';

delete from observador_de_proyectos.tipo_documento
where documento= 'CC';

#select
#select simple
select * from observador_de_proyectos.cliente;

#Mostrar columnas o valores
select tipo_documento, numero_documento from observador_de_proyectos.cliente order by numero_Documento desc limit 1;

select * from observador_de_proyectos.cliente c, observador_de_proyectos.tipo_documento t
where t.documento = c.tipo_Documento
;

select now() from dual;

#where
select * from observador_de_proyectos.cliente
where tipo_Documento= 'CC';

select * from observador_de_proyectos.cliente
where primer_Nombre= 'hernando';

#tener cuidado con esta consulta ya que no retorna nada debe cambiarse el = por is
select * from observador_de_proyectos.cliente
where segundo_Nombre = null;

select * from observador_de_proyectos.cliente
where segundo_Nombre is null;

create table ejemplodml.imagenes(
id_imagen int auto_increment primary key,
imagen longblob
);

insert into ejemplodml.imagenes(imagen) values (load_file('D:/imagenes/images2.jpg'));

create schema ejemplo3;
CREATE TABLE ejemplo3.ANIMAL(
ID_ANIMAL INT NOT NULL AUTO_INCREMENT,
NOMBRE_ANIMAL VARCHAR(40),
EDAD INT,
FECHA_NACIMIENTO DATE,
TIPO_ANIMAL ENUM ('PERRO', 'GATO'),
PRIMARY KEY(ID_ANIMAL)
);

ALTER TABLE ejemplo3.ANIMAL ADD COLUMN FOTO longblob;
INSERT INTO ejemplo3.ANIMAL (NOMBRE_ANIMAL, TIPO_ANIMAL, FOTO) 
VALUES ('PILI','PERRO', load_file('D:\imagenes\images2.jpg'));

select load_file('C:/Program Files/MySQL/MySQL Workbench 6.3 CE/images/ima/descarga.jpg');

show grants;
grant file ON *.*  to 'root'@'%' WITH GRANT OPTION;
flush privileges;





    
