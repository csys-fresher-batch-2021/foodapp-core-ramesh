create table FOOD_LIST(
	hotel_id serial primary key,
	food_name varchar(50) not null ,
	price double precision not null,
	food_type varchar(50) not null,
	hotel_name varchar(50) not null
	CONSTRAINT food_type CHECK (food_type='veg' OR food_type='non-veg')
);
select *from food_list;
insert into food_list(food_name,price,food_type,hotel_name) values ('pongal',70.00,'veg','a2b');
select *from food_list;
insert into food_list(food_name,price,food_type,hotel_name) values ('puri',50.00,'veg','annaporna');
select *from food_list;
insert into food_list(food_name,price,food_type,hotel_name) values ('dosa',60.00,'veg','aryas');
select *from food_list;
insert into food_list(food_name,price,food_type,hotel_name) values ('idli',40.00,'veg','srkp');
select *from food_list;	
	
