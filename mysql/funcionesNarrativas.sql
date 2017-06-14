create schema ejemploFunciones;

use ejemploFunciones;
create table ejemplo01(
	id int auto_increment primary key,
    campo1 int
    
);

-- funciones matematicas
-- ABS

select abs(campo1) from ejemplo01;

-- acos entre -1 y 1

select acos(0.045) ;


select ceil(1.4);

select cos(45); -- radianes

select degrees(2*pi());

SELECT ceil(RAND()*10

);


SELECT ROUND(1.3748, 2);

SELECT SIGN(0.3);

select conv(16,10,8);

SELECT INSERT('Cuadrático', 4, 4, ’tárt’);