-- Este script assume que você já possui a base de dados criada
-- Criação da tabela pessoa
CREATE TABLE pessoa (
	id serial primary key,
	nome text,
	arquivo bytea,
	nome_arquivo text
);

-- Criação da tabela arquivo para quem for testar o LeitorArquivo.java
CREATE TABLE arquivo (
	id serial primary key,
	nome text,
	binario bytea
);