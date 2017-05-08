# sirve para mostrar los motores de bases de datos con lo que cuenta mi mysql server
show engines;  
# este sirve para ver la base de datos
show databases;
#sirve para ver los esquemas en mysql
show schemas;

#seleccionar una base de datos por defecto
use prueba;

#SCHEMAS
#Crear un schema
create schema prueba;
#borrar un esquema
drop schema prueba;
drop schema ejemplo2;
#crear un esquema si no existe
create schema if not exists prueba;

#DATABASES
#crear base de datos
create database prueba;
#borrar base de datos
drop database prueba;
#con condicion
create database if not exists prueba;




