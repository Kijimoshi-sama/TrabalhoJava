CREATE DATABASE meu_banco_de_dados;

USE seu_banco_de_dados;

CREATE TABLE pessoas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    tipo VARCHAR(20) NOT NULL
);