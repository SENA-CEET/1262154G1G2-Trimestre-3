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

-- UPDATE CON MULTIPLES TABLAS

UPDATE ejemplo3.ANIMAL a, EDPF.customer c
set a.EDAD =12,
	c.first_name='papa'
where a.ID_ANIMAL=1 and c.type_document='CC' and c.number_document='1000336987';

-- update con una consulta
update EDPF.customer c set first_name =  (SELECT primer_nombre FROM observador_de_proyectos.cliente  where tipo_documento = 'CC' and numero_documento = '1.015.45')
where c.type_document='CC' and c.number_document='1000336987';




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

delete from EDPF.general_observation  where group_code =1 order by observation asc limit 1;

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

-- PARA METER UN CAMPO LONBLOG PARA UNA IMAGEN cambiar la ruta se la variable del archivo my.ini secure-file-priv

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

INSERT INTO ejemplo3.ANIMAL  (ID_ANIMAL,NOMBRE_ANIMAL, TIPO_ANIMAL, FOTO) 
VALUES ('15','PILI','PERRO', load_file('D:\imagenes\images2.jpg')) ON DUPLICATE KEY UPDATE TIPO_ANIMAL='gato' ;

desc ejemplo3.ANIMAL;

insert into ejemplo3.ANIMAL
set NOMBRE_ANIMAL='firulais',
	TIPO_ANIMAL= 'perro';
    


select load_file('C:/Program Files/MySQL/MySQL Workbench 6.3 CE/images/ima/descarga.jpg');

select load_file('C:/imagenes/descarga.jpg');

-- cuando necesito insertar varios registros en una sola sentencia insert
INSERT INTO EJEMPLO3.ANIMAL (NOMBRE_ANIMAL, TIPO_ANIMAL, FOTO) 
VALUES ('PILI','PERRO', load_file('C:/imagen/maxresdefault.jpg')),
('PILI','PERRO', load_file('C:/imagen/maxresdefault.jpg')),
('PILI','PERRO', load_file('C:/imagen/maxresdefault.jpg')),
('PILI','PERRO', load_file('C:/imagen/maxresdefault.jpg')),
('PILI','PERRO', load_file('C:/imagen/maxresdefault.jpg'));

-- replace

REPLACE INTO ejemplo3.ANIMAL (ID_ANIMAL,NOMBRE_ANIMAL, TIPO_ANIMAL, FOTO)
VALUES (9,'PILI','PERRO', 'iamgen');

commit;

-- distinc

SELECT DISTINCT ficha, grupo_codigo  FROM observador_de_proyectos.aprendiz;
use observador_de_proyectos;
select count(*) from cliente;
select count(*) from aprendiz;
select count(*) from cliente, aprendiz;

-- hora del servidor de base de datos
SELECT now() FROM dual;

-- condiciones del where

-- igual
SELECT * FROM TIENDA_ONLINE2.FACTURA F  WHERE F.ID_FACTURA=1;
select * from tienda_online2.factura f where f.ID_FACTURA=1;
select * from observador_de_proyectos.aprendiz a where a.ficha='866333 G1';

-- diferente
select * from tienda_online2.factura f where f.ID_FACTURA!=1;
select * from observador_de_proyectos.aprendiz a where a.ficha!='866333 G1';
select count(*) from observador_de_proyectos.aprendiz a where a.ficha!='866333 G1';

-- mayor
select * from tienda_online2.factura f where f.ID_FACTURA>2;
SELECT * FROM observador_de_proyectos.cliente t where t.primer_nombre>'an';

-- menor
select * from tienda_online2.factura f where f.ID_FACTURA<2;


-- mayor o igual
select * from tienda_online2.factura f where f.ID_FACTURA>=2;


-- menor o igual
select * from tienda_online2.factura f where f.ID_FACTURA<=2;

select i.PEDIDO_FACTURA_ID_FACTURA from tienda_online2.item i where i.PRODUCTO_ID_PRODUCTO='11';
select m.NOMNBRE_MUNICIPIO from tienda_online2.municipio m where m.DEPARTAMENTO_ID_DEPARTAMENTO=10;

select count(m.DEPARTAMENTO_ID_DEPARTAMENTO)
from tienda_online2.municipio m where m.DEPARTAMENTO_ID_DEPARTAMENTO=15 || m.DEPARTAMENTO_ID_DEPARTAMENTO=18;

select * from tienda_online2.cuenta cu where cu.SEGUNRO_NOMBRE is null;
select * from tienda_online2.cuenta cu where cu.SEGUNRO_NOMBRE is not null;

-- BETWEEN

select * from tienda_online2.producto p where p.ID_PRODUCTO >2 and p.ID_PRODUCTO<10;
select * from tienda_online2.producto p where p.ID_PRODUCTO BETWEEN 3 and 9;

SELECT * FROM observador_de_proyectos.aprendiz a where a.numero_documento between 1003711255 and 1012394521;

-- para ver si el autocommit esta prendido o apagado
SELECT @@AUTOCOMMIT;

-- descripcion de tablas

describe ejemplo3.ANIMAL;
desc ejemplo3.ANIMAL;

-- contar registros 

select count(*) from observador_de_proyectos.aprendiz;

-- insert a partir de una consulta

insert into EDPF.customer2(pn, sn, pa, sa) 
select  c.first_name, c.second_name, c.first_last_name, c.second_last_name 
	from EDPF.customer c 
    where c.number_document='1000336987' 
		and c.type_document='CC';

replace into EDPF.customer2(pn, sn, pa, sa) 
select  c.first_name, c.second_name, c.first_last_name, c.second_last_name 
	from EDPF.customer c 
    where c.number_document='1000336987' 
		and c.type_document='CC';
        
-- truncate
truncate table EDPF.general_observation;

select @@AUTOCOMMIT;
create schema EDPF;

-- cambiar el modo de auocommit
SET @@AUTOCOMMIT=1;
commit;
rollback;

-- shows
show databases;
use EDPF;
show tables;

show index from answer_group;

-- like sirve para haer consultar cuando no se conoce el contenido completo

SELECT * FROM EDPF.competence c where c.denomination like 'E%';

SELECT * FROM EDPF.competence c where c.denomination like '%fica%';

SELECT * FROM EDPF.competence c where c.denomination like '%a ';

SELECT * FROM EDPF.competence c where c.denomination like 'a%en%de%';



        


-- subconsultas

SELECT 
    *
FROM
    EDPF.learning_result l
WHERE
    l.competition_code = (SELECT 
            c.code_competence
        FROM
            EDPF.competence c
        WHERE
            c.denomination LIKE 'Especificar%');
            
SELECT 
    r.denomination as 'denominacion'
FROM
    (SELECT 
        *
    FROM
        EDPF.competence c
    WHERE
        c.denomination LIKE '%a%') r
WHERE
    r.code_competence = '220501006';

-- consultas con IN

SELECT * FROM EDPF.customer c where c.number_document='1000336987' or c.number_document= '1001276663' ;

SELECT * FROM EDPF.customer c where c.number_document in ('1000336987','1001276663') ;

SELECT * FROM EDPF.customer c where c.number_document='1000336987' or c.number_document= '1001276663' ;

SELECT c.number_document FROM EDPF.customer c where c.type_document='CC' ;

SELECT * FROM EDPF.customer c where c.number_document in (SELECT c.number_document FROM EDPF.customer c where c.type_document='CC') ;





    
