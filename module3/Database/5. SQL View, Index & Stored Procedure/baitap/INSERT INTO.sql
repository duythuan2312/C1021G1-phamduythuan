CREATE DATABASE demo;
USE demo;
CREATE TABLE products (
id int,
product_code CHAR(5),
product_Name VARCHAR(255),
product_price DOUBLE,
product_amount INT,
product_description VARCHAR(255),
product_satus VARCHAR(255),
PRIMARY KEY(id)
);
INSERT INTO products VALUES 
(1,"SP345","Bánh mì",15000,3,"Bánh Mì Sữa","Đang làm"),
(2,"SP123","Bánh Bèo",10000,1,"Nhân thịt","Đã làm xong"),
(3,"SP234","Mỳ Quảng",15000,2,"Gà","Đang làm"),
(4,"SP678","Bò giác vàng",2000000,7,"Vàng 999","Đang đem ra"),
(5,"SP589","Bánh mì",12000,2,"Bánh Mì Thịt","Ăn Xong");
