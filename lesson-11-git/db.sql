drop database if exists i_shop;
create database i_shop;
use i_shop;
select database();

create table user(
id int primary key auto_increment,
email varchar(255) not null,
firstName varchar(255) not null,
lastName varchar(255) not null,
role varchar(255) not null,
password varchar(25) not null
);

create table products(
id int primary key auto_increment,
name varchar(255) not null,
description varchar(255) not null,
price int not null);

create table bucket(
id int primary key auto_increment,
user_id int not null,
product_id int not null,
purchase_date timestamp not null,
constraint user_id_fk foreign key(user_id)
references i_shop.user(id) on delete cascade on update restrict,
constraint product_id_fk foreign key(product_id)
references i_shop.products(id) on delete cascade on update restrict);
select * from user;
