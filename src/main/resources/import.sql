-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into estado(nome, sigla) values('Michigan', 'MI');
insert into estado(nome, sigla) values('Ohio', 'OH');
insert into estado(nome, sigla) values('Massachussetts', 'MA');
insert into estado(nome, sigla) values('California', 'CA');
insert into estado(nome, sigla) values('Florida', 'FL');
insert into estado(nome, sigla) values('New York', 'NY');


insert into team(nome, cidade, id_estado) values ('Detroit Pistons', 'Detroit', 1);
insert into team(nome, cidade, id_estado) values ('Cleveland Cavaliers', 'Cleveland', 2);
insert into team(nome, cidade, id_estado) values ('Boston Celtics', 'Boston', 3);
insert into team(nome, cidade, id_estado) values ('Orlando Magic', 'Orlando', 5);
insert into team(nome, cidade, id_estado) values ('Golden State Warriors', 'Sao Francisco', 4);
insert into team(nome, cidade, id_estado) values ('Sacramento Kings', 'Sacramento', 4);
insert into team(nome, cidade, id_estado) values ('New York Knicks', 'New York', 6);
insert into team(nome, cidade, id_estado) values ('Brooklyn Nets', 'New York', 6);