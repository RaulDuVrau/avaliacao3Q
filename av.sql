create database avaliacao
go

use avaliacao
go

create table musicais(
instrumento		varchar(20) not null,
tipo			varchar(20) not null,
marca			varchar(20) not null,
preco			int		    not null
)

select*from musicais