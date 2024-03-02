create database TallerSQL
use TallerSQL

create table Clientes(
ID int identity(1,1)  primary key not null,
Nombre varchar(100) not null,
Apellido varchar(100) not null,
Telefono char(9) not null,
Direccion varchar(30) not null,
Email varchar(100) not null);

insert into Clientes values ('Luis Fernando', 'Ventocilla Polin', '994022932', 'Puente Piedra', 'Luis@gmail.com') ;
insert into Clientes values ('Esteban Donato', 'Roman Payano', '954862317', 'Ate', 'Estaban@senati.pe');
insert into Clientes values ('Jeampier Francisco', 'Flores Alcashihuinca','975648534', 'Comas', 'Jeanpier@gmail.com');
insert into Clientes values ('Christiams Jesus', 'Veliz Aquino', '912684537','Olivos', 'Chistiams@senati.pe');
insert into Clientes values ('Guillermo Eduardo', 'De la Cruz Palacios', '932185467', 'Olivos', 'Guillermo@gmail.com');
insert into Clientes values ('Jhojan Beckhan', 'Barreto Felipe', '956334875', 'Ancón', 'Jhojan@senati.pe');
insert into Clientes values ('Diego Alnozo', 'Galarza Gonzales', '998005648', 'Chorrillos', 'Diego@gmail.com');
insert into Clientes values ('Leonardo Anders', 'Quispe Campones', '945130578', 'San Juan de Lurigamcho', 'Leonardo@ssenati.pe');
insert into Clientes values ('Erikson Luis', 'Valqui Torres', '948162035', 'Comas', 'Erikson@gmail.com');
insert into Clientes values ('Niel', 'Casafranca Leon', '999641003', 'Ate', 'Niel@senati.pe');

select * from Clientes

update Clientes set Nombre = 'Cristian Jesús' where ID = 4
update Clientes set Direccion = 'Comas' where ID = 8
update Clientes set Telefono = '987513545' where ID = 10
update Clientes set Email = 'Eduardo@gmail' where ID = 5
update Clientes set Email = 'Erikson@senati.pe' where ID = 9

delete Clientes where ID = 3
delete Clientes where ID = 7

