-- Comando para dar permisos
show grants;
grant file ON *.*  to 'root'@'%' WITH GRANT OPTION;
flush privileges;