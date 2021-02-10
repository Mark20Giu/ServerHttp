drop database if exists tpsit;
create database tpsit;
use tpsit;
create table if not exists Alunni(
	id int not null,
	nome varchar(40) not null,
    cognome varchar(40) not null,
    primary key (id)
);
insert into Alunni (id, nome, cognome)
values (1,"Aurora","Trentini"),
(2,"Ladislao","Ricci"),
(3,"Lucio","Capon"),
(4,"Selene","Costa"),
(5,"Bonifacio","Marino"),
(6,"Pietro","Colombo"),
(7,"Tranquillo","Udinesi"),
(8,"Greta","Buccho");
