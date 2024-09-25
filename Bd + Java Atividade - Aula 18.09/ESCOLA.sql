CREATE DATABASE ESCOLA;
USE ESCOLA;

CREATE TABLE ALUNO (
id INT auto_increment primary key,
nome VARCHAR (50),
idade INT,
curso VARCHAR (50)
);

CREATE TABLE PROFESSOR (
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR  (50),
idade INT,
disciplina VARCHAR (50)
);

CREATE TABLE MATRICULA (
id INT AUTO_INCREMENT PRIMARY KEY,
id_aluno INT,
id_professor INT,
data_matricula DATE,
FOREIGN KEY (id_aluno) REFERENCES ALUNO (id),
FOREIGN KEY (id_professor) REFERENCES professor (id)
);


INSERT INTO ALUNO (nome, idade, curso)
VALUES 
('João', 20, 'Matemática'),
('Maria', 22, 'História'),
('Pedro', 21, 'Ciência da Computação'),
('Ana', 19, 'Biologia'),
('Carlos', 23, 'Economia');


INSERT INTO PROFESSOR (nome, idade, disciplina)
VALUES 
('Ricardo', 40, 'Java'),
('Alexandre', 40, 'Algoritmos'),
('Herysson', 30, 'Banco de Dados');

INSERT INTO MATRICULA (id_aluno, id_professor, data_matricula)
VALUES 
('1', 1, '2024-01-02'),
('2', 1, '2024-01-10'),
('3', 2, '2024-01-09'),
('4', 3, '2024-02-01'),
('5', 3, '2024-02-05');

SELECT * FROM ALUNO;
SELECT * FROM PROFESSOR;
