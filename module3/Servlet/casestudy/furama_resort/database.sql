
create database furama_case_study;
use furama_case_study;
create table `user`(
username varchar(255) primary key,
`password` varchar(255)
);
create table `role` (
role_id int primary key AUTO_INCREMENT,
role_name varchar(255)
);
create table user_role (
role_id int not null,
username varchar(255) not null,
foreign key (username) references `user`(username),
foreign key (role_id) references `role`(role_id)
);
create table division (
division_id int primary key AUTO_INCREMENT,
division_name varchar(45)
);
create table education_degree (
education_degree_id int primary key AUTO_INCREMENT,
education_degree_name varchar(45)
);
create table position (
position_id int primary key AUTO_INCREMENT,
position_name varchar(45)
);
create table customer_type (
customer_type_id int primary key AUTO_INCREMENT,
customer_type_name varchar(45)
);
create table service_type (
service_type_id int primary key AUTO_INCREMENT,
service_type_name varchar(45)
);
create table customer (
customer_id int primary key AUTO_INCREMENT,
customer_name varchar(45),
customer_birthday date not null,
customer_gender bit(1) not null,
customer_id_card varchar(45) not null,
customer_phone varchar(45) not null,
customer_email varchar(45),
customer_address varchar(45),
customer_type_id int not null,
foreign key (customer_type_id) references customer_type(customer_type_id)
);
create table rent_type (
rent_type_id int primary key AUTO_INCREMENT,
rent_type_name varchar(45),
rent_type_cost double
);
create table service (
service_id int primary key AUTO_INCREMENT,
service_name varchar(45) not null,
service_area int,
service_cost double not null,
service_max_people int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
rent_type_id int not null,
service_type_id int not null,
foreign key (rent_type_id) references rent_type (rent_type_id),
foreign key (service_type_id) references service_type (service_type_id)
);
create table attach_service (
attach_service_id int primary key AUTO_INCREMENT,
attach_service_name varchar(45) not null,
attach_service_cost double not null,
attach_service_unit varchar(255) not null,
attach_service_status varchar(45)
);
create table employee (
employee_id int primary key AUTO_INCREMENT,
employee_name varchar(45) not null,
employee_birthday varchar(45) not null,
employee_id_card varchar(45) not null,
employee_salary double not null,
employee_phone varchar(45) not null,
employee_email varchar(45),
employee_address varchar(45),
position_id int not null,
education_degree_id int not null,
division_id int not null,
username varchar(255),
foreign key (position_id) references position (position_id),
foreign key (education_degree_id) REFERENCES education_degree (education_degree_id),
foreign key (division_id) references division (division_id),
foreign key (username) references `user`(username)
);
create table contract (
contract_id int primary key AUTO_INCREMENT,
contract_start_date varchar(45) not null,
contract_end_date varchar(45) not null,
contract_deposit double not null,
contract_total_money double not null,
employee_id int not null,
customer_id int not null,
service_id int not null,
foreign key (employee_id) references employee (employee_id),
foreign key (customer_id) references customer (customer_id),
foreign key (service_id) references service (service_id)
);
create table contract_detail (
contract_detail_id int primary key AUTO_INCREMENT,
quantity int not null,
contract_id int not null,
attach_service_id int not null,
foreign key (contract_id) references contract (contract_id),
foreign key (attach_service_id) references attach_service (attach_service_id)
);


insert into  position values ("1", "Qu???n L??"),("2", "Nh??n Vi??n");
insert into  position values ("3", "L??? t??n");
insert into  position values ("4", "Ph???c v???");
insert into  position values ("5", "Chuy??n vi??n");
insert into  position values ("6", "gi??m s??t");
insert into  position values ("7", "gi??m ?????c");
insert into education_degree values (1, "Trung C???p"), (2, "Cao ?????ng"), (3, "?????i H???c"),(4, "Sau ?????i H???c");
insert into division values ("1","Sale-Marketting"), ("2","H??nh Ch??nh"), ("3","D???ch V???"),("4","Qu???n L??"); 

INSERT INTO attach_service(attach_service_name,attach_service_cost,attach_service_unit,attach_service_status)
VALUE ("massage",10000,"gi???","ti???n nghi" ),
		("karaoke",5000,"gi???","ti???n nghi, hi???n t???i" ),
        ("th???c ??n",15000,"su???t","?????y ????? ????? ??n, tr??ng mi???ng"),
        ("n?????c u???ng",7000,"chai","?????y ????? ????? u???ng"),
        ("thu?? xe",50000,"chi???c","h???ng 1 chi???c");


insert into employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email,
 employee_address, position_id, education_degree_id, division_id)
values
(1, "Nguy???n V??n An", "1970-11-07","456231786", 10000000, "0123456789", "annguyen@gmail.com", "295 Nguy???n T???t Th??nh, ???? N???ng", 1, 3, 1),
(2, "L?? V??n B??nh", "1997-04-09", "654231234", 7000000, "0984534758", "binhlv@gmail.com", "22 Y??n B??i, ???? N???ng", 1, 2, 2),
(3, "H??? Th??? Y???n", "1995-12-12", "999231723", 14000000, "0456764542", "thiyen@gmail.com", "K234/11 ??i???n Bi??n Ph???, Gia Lai", 1, 3, 2),
(4, "V?? C??ng To???n", "1980-04-04", "123231365", 17000000, "0379853432", "toan0404@gmail.com", "77 Ho??ng Di???u, Qu???ng Tr???", 1, 4, 4),
(5, "Nguy???n B???nh Ph??t", "1999-12-09", "454363232", 6000000, "0902433454", "phatphat@gmail.com", "43 Y??n B??i, ???? N???ng", 2, 1, 1),
(6, "Kh??c Nguy???n An Nghi", "2000-11-08", "964542311", 7000000, "0978650000", "annghi20@gmail.com", "294 Nguy???n T???t Th??nh, ???? N???ng", 2, 2, 3),
(7, "Nguy???n H???u H??", "1993-01-01", "534323231", 8000000, "0941234553", "nhh0101@gmail.com", "4 Nguy???n Ch?? Thanh, Hu???", 2, 3, 2),
(8, "Nguy???n H?? ????ng", "1989-09-03", "234414123", 9000000, "0642123111", "donghanguyen@gmail.com", "11 H??ng V????ng, H?? N???i", 2, 4, 4),
(9, "T??ng Hoang", "1982-09-03", "256781231", 6000000, "0245144444", "hoangtong@gmail.com", "213 H??m Nghi, ???? N???ng", 2, 4, 4),
(10, "Nguy???n C??ng ?????o", "1994-01-08", "755434343", 8000000, "0988767111", "ngu???enongdao12@gmail.com", "6 Ho?? Kh??nh, ?????ng Nai", 2, 3, 2);


insert into rent_type(rent_type_id,rent_type_name,rent_type_cost) values
(1,'year',20000),
(2,'month',2000),
(3,'day',500),
(4,'hour',200);
insert into service_type(service_type_id,service_type_name) values
(1,"Villa"),
(2,'House'),
(3,'Room');
insert into service(service_name,service_area,service_cost,service_max_people,standard_room,description_other_convenience,pool_area,number_of_floors,rent_type_id,service_type_id)
values("Villa Beach Front","25000",10000000,10,"vip","C?? h??? b??i",500,4,3,1),
("House Princess 01","14000",5000000,7,"vip","C?? th??m b???p n?????ng",null,3,2,2),
("Room Twin 01","5000",1000000,2,"vip","C?? tivi",null,null,4,3),
("Villa No Beach Front","22000",9000000,8,"normal","C?? h??? b??i",300,3,3,1),
("House Princess 02","10000",4000000,5,"normal","C?? th??m b???p n?????ng",null,2,3,2),
("Room Twin 02","3000",900000,2,"normal","C?? tivi",null,null,4,3);

insert into customer_type(customer_type_name) values ("Diamond"),("Platinium"),("Gold"),("Silver"),("Member");

insert into customer(customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id)
values ("Nguy???n Th??? H??o","1970-11-07",b'0',"643431213","0945423362","thihao07@gmail.com","23 Nguy???n Ho??ng,???? N???ng",5),
("Ph???m Xu??n Di???u","1992-08-08",b'1',"865342123","0954333333","xuandieu92@gmail.com","K77/22 Th??i Phi??n, Qu???ng Tr???",3),
("Tr????ng ????nh Ngh???","1990-02-27",b'1',"488645199","0373213122","nghenhan2702@gmail.com","K323/12 ??ng ??ch Khi??m, Vinh",1),
("D????ng V??n Quan","1981-07-08",b'1',"543432111","0490039241","duongquan@gmail.com","K453/12 L?? L???i, ???? N???ng",1),
("Ho??ng Tr???n Nhi Nhi","1995-12-09",b'0',"795453345","0312345678","nhinhi123@gmail.com","224 L?? Th??i T???, Gia Lai",4),
("T??n N??? M???c Ch??u","2005-12-06",b'0',"732434215","0988888844","tonnuchau@gmail.com","37 Y??n Th???, ???? N???ng",4),
("Nguy???n M??? Kim","1984-04-08",b'0',"856453123","0912345698","kimcuong84@gmail.com","K123/45 L?? L???i, H??? Ch?? Minh",1),
("Nguy???n Th??? H??o","1999-04-08",b'0',"965656433","0763212345","haohao99@gmail.com","55 Nguy???n V??n Linh, Kon Tum",3),
("Tr???n ?????i Danh","1994-07-01",b'1',"432341235","0643343433","danhhai99@gmail.com","24 L?? Th?????ng Ki???t, Qu???ng Ng??i",1),
("Nguy???n T??m ?????c","1989-07-01",b'1',"344343432","0987654321","tdactam@gmail.com","22 Ng?? Quy???n, ???? N???ng",2);


insert into contract values (1,"08-12-2020","08-12-2020",0,0,3,1,3),
(2,"14-07-2020","21-07-2021",200000,0,7,3,1),
(3,"15-03-2021","17-03-2021",50000,0,7,3,1),
(4,"14-01-2021","18-01-2021",100000,0,7,5,5),
(5,"14-07-2021","15-07-2021",0,0,7,2,6),
(6,"01-06-2021","03-06-2021",0,0,7,7,6),
(7,"02-09-2021","05-09-2021",100000,0,7,4,4),
(8,"17-06-2021","18-06-2021",150000,0,3,4,1),
(9,"19-11-2020","19-11-2020",0,0,3,4,3),
(10,"12-04-2021","14-04-2021",0,0,10,3,5),
(11,"25-04-2021","25-04-2021",0,0,2,2,1),
(12,"25-05-2021","27-05-2021",0,0,7,10,1)
;
select customer_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id,customer_type_name from customer where customer_id =?;


UPDATE customer set customer_name = "phamduythuan123",customer_birthday= "2003-12-23",customer_gender=b'1',customer_id_card="18785564",customer_phone="0345789277",customer_email= "phamduythuan123", customer_address ="da nag",customer_type_id=1 where customer_id = 16;
SELECT * FROM customer inner join customer_type on customer.customer_type_id = customer_type.customer_type_id;
select customer_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id from customer where customer_id ;