CREATE DATABASE BDAULA01;
USE BDAULA01;
drop database BDAULA01;
CREATE TABLE PESSOA (
	id INT auto_increment PRIMARY KEY,
	nome VARCHAR (50) NOT NULL,
    sexo VARCHAR (50) NOT NULL,
    idioma VARCHAR (10) NOT NULL

);

INSERT INTO PESSOA (nome,sexo,idioma)
VALUES ("Joãozão", "M", "Português"),
	   ("Marcelo","M", "Inglês"),
       ("Ritter","M","Espanhol");
       
Select * from pessoa;

CREATE TABLE VEICULO (
	id INT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(30),
    placa VARCHAR(7),
    id_pessoa INT NOT NULL,
    FOREIGN KEY (id_pessoa) REFERENCES PESSOA(id)
);

INSERT INTO VEICULO (modelo, placa, id_pessoa)
VALUES ("Lancer", "IVR3103", 1),
	   ("Grand Cherokee", "OZQ6D69",3),
       ("Uno","UNO1234",2);
       
       
select * from veiculo;