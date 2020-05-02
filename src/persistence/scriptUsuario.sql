use bd_aula-06;

create table usuario 
(
id bigint primary key auto_increment,
nome varchar(50),
email varchar (50),
senha varchar(50)
);

insert into usuario values
(null, 'Amanda', 'amanda@gmail.com', '1234');