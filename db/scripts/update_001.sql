CREATE TABLE post (
   id SERIAL PRIMARY KEY,
   name TEXT,
   created DATE
);

CREATE TABLE candidate (
   id SERIAL PRIMARY KEY,
   name TEXT,
   cityid INT,
   registered DATE
);

CREATE TABLE users (
   id SERIAL PRIMARY KEY,
   name TEXT,
   email TEXT,
   password TEXT
);

CREATE TABLE city (
   id SERIAL PRIMARY KEY,
   name TEXT
);

insert into city(name) values ('Moskow');
insert into city(name) values ('Vodsk');
insert into candidate(name, cityid, registered) values ('Novosibirsk', 2, 12.10);
