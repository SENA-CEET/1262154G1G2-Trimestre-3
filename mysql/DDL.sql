#Sentencias DML

#Gestion de tablas

#describe la estrucutra de la tabla;

DESCRIBE ejemplodml.ejemplo1;

CREATE SCHEMA ejemplodml;

CREATE TABLE IF NOT EXISTS ejemplodml.ejemplo (
  id INT
);

DROP TABLE ejemplodml.ejemplo;

#llaves primarias

CREATE TABLE IF NOT EXISTS ejemplodml.ejemplo (
  id INT PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS ejemplodml.ejemplo (
  id INT,
  PRIMARY KEY (id)
);

#llaves compuestas
CREATE TABLE IF NOT EXISTS ejemplodml.ejemplo (
  id     INT,
  id2    INT,
  campo1 INT UNIQUE,


  PRIMARY KEY (id, id2)
);

#columns definitions
DROP TABLE ejemplodml.ejemplo2;
CREATE TABLE IF NOT EXISTS ejemplodml.ejemplo2 (
  id     INT PRIMARY KEY AUTO_INCREMENT,
  id2    INT,
  campo1 INT UNIQUE,
  campo2 INT NOT NULL,
  campo3 INT NULL
  COMMENT 'este campo sirve para almacenar algo'


);

CREATE TABLE ejemplodml.producto (
  id_producto     VARCHAR(256) PRIMARY KEY,
  nombre_producto VARCHAR(100),
  precio          NUMERIC,
  descripcion     VARCHAR(1000),
  foto            LONGBLOB
);

CREATE TABLE ejemplodml.cliente (
  tipo_Documento   VARCHAR(40),
  numero_Documento VARCHAR(40),
  primer_Nombre    VARCHAR(100) NOT NULL,
  segundo_Nombre   VARCHAR(100),
  prmer_Apellido   VARCHAR(100) NOT NULL,
  segundo_Apellido VARCHAR(100),
  sexo             VARCHAR(20) DEFAULT 'masculino',
  PRIMARY KEY (tipo_Documento, numero_Documento)
);
#esta es con el constrint por default
CREATE TABLE ejemplodml.factura (
  id_Factura       INT PRIMARY KEY AUTO_INCREMENT,
  fecha            TIMESTAMP,
  valor_potal      NUMERIC,
  forma_pago       VARCHAR(40),

  tipo_Documento   VARCHAR(40) NOT NULL,
  numero_Documento VARCHAR(40) NOT NULL,

  FOREIGN KEY (tipo_Documento, numero_Documento) REFERENCES ejemplodml.cliente (tipo_Documento, numero_Documento)


);
#esta es la tabla con la el nombre del constraint
CREATE TABLE ejemplodml.factura (
  id_Factura       INT PRIMARY KEY AUTO_INCREMENT,
  fecha            TIMESTAMP,
  valor_potal      NUMERIC,
  forma_pago       VARCHAR(40),clientecliente

  tipo_Documento   VARCHAR(40) NOT NULL,
  numero_Documento VARCHAR(40) NOT NULL,
  CONSTRAINT documero_FK
  FOREIGN KEY (tipo_Documento, numero_Documento) REFERENCES ejemplodml.cliente (tipo_Documento, numero_Documento)


);
#esta es la tabla con la relacion identificable
CREATE TABLE ejemplodml.factura (
  id_Factura       INT AUTO_INCREMENT,
  fecha            TIMESTAMP,
  valor_potal      NUMERIC,
  forma_pago       VARCHAR(40),

  tipo_Documento   VARCHAR(40) NOT NULL,
  numero_Documento VARCHAR(40) NOT NULL,
  CONSTRAINT documero_FK
  FOREIGN KEY (tipo_Documento, numero_Documento) REFERENCES ejemplodml.cliente (tipo_Documento, numero_Documento),
  PRIMARY KEY (id_Factura, tipo_Documento, numero_Documento)


);

show index from ejemplodml.factura;

DESCRIBE ejemplodml.cliente;

#Modificación de la estructura de las tablas

#anadir una columna
ALTER TABLE ejemplodml.cliente
  ADD COLUMN (telefono VARCHAR(20));

#eliminar una columna
ALTER TABLE ejemplodml.cliente
  DROP campo;
#modifica una columna
ALTER TABLE ejemplodml.cliente
  MODIFY telefono NUMERIC;
#modificar el tamaño de un campo
ALTER TABLE ejemplodml.cliente
  MODIFY sexo VARCHAR(10);
#desactivar la reglas de integridad referencial
ALTER TABLE ejemplodml.factura
  DISABLE KEYS;
ALTER TABLE ejemplodml.cliente
  ENABLE KEYS;


CREATE TABLE ejemplodml.factura (
  id_Factura  INT PRIMARY KEY AUTO_INCREMENT,
  fecha       TIMESTAMP,
  valor_potal NUMERIC,
  forma_pago  VARCHAR(40)

);

ALTER TABLE ejemplodml.factura
  ADD COLUMN tipo_Documento VARCHAR(40) NOT NULL;
ALTER TABLE ejemplodml.factura
  ADD COLUMN numero_Documento VARCHAR(40) NOT NULL;
ALTER TABLE ejemplodml.factura
  ADD CONSTRAINT documerno_FK FOREIGN KEY (tipo_Documento, numero_Documento) REFERENCES ejemplodml.cliente (tipo_Documento, numero_Documento);
ALTER TABLE ejemplodml.factura
  ADD PRIMARY KEY (id_Factura, tipo_Documento, numero_Documento);
ALTER TABLE ejemplodml.factura
  DROP PRIMARY KEY;

ALTER TABLE ejemplodml.factura
  MODIFY COLUMN id_Factura INT;

#borrar tabla
DROP TABLE factura;

#cascade
CREATE TABLE ejemplodml.factura (
  id_Factura       INT AUTO_INCREMENT,
  fecha            TIMESTAMP,
  valor_potal      NUMERIC,
  forma_pago       VARCHAR(40),

  tipo_Documento   VARCHAR(40) NOT NULL,
  numero_Documento VARCHAR(40) NOT NULL,
  CONSTRAINT documero_FK
  FOREIGN KEY (tipo_Documento, numero_Documento) REFERENCES ejemplodml.cliente (tipo_Documento, numero_Documento) on update  cascade,
  PRIMARY KEY (id_Factura, tipo_Documento, numero_Documento),
  INDEX ADFASDF (ADSFASDF ASC, ASDFAS ASC, ASD ASC)


);

#INDICE

#CREATE INDEX NOMBRE ON BASEDEDATO.SCHEMA.TABLA(CAMPO1 ASC, CAMPO DESC);




