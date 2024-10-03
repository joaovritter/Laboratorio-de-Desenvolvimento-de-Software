CREATE DATABASE BDAULA01;
USE BDAULA01;
drop database BDAULA01;
CREATE TABLE PESSOA (
	id SMALLINT auto_increment PRIMARY KEY,
	nome VARCHAR (50) NOT NULL,
    sexo VARCHAR (50) NOT NULL,
    idioma VARCHAR (10) NOT NULL

);

INSERT INTO PESSOA (nome,sexo,idioma)
VALUES ("Ricardo", "M", "Português");

INSERT INTO PESSOA (nome,sexo,idioma)
VALUES ("Gerald", "M", "Inglês"),
	   ("William", "M", "Inglês"),
	   ("Umberto", "M", "Espanhol"),
	   ("Jostein", "M", "Alemão"),
	   ("Stephan", "M", "Holandês");
       
Select * from pessoa;
