create database bd_aula06;

use bd_aula06;

create table produto
(
id bigint primary key auto_increment,
nome varchar(50),
preco double,
imagem varchar(255)
);

insert into produto values (null, 'havaiana', 20, 'https://havainas.vteximg.com.br/arquivos/ids/234045-1000-1000/4000029_0001_C_chinelos_havaianas_top_branco.jpg?v=637013044002000000');

