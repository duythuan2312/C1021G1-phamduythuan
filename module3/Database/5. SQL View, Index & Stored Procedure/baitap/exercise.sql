USE demo;
CREATE UNIQUE INDEX demo_index ON products(product_code);
CREATE INDEX composite ON products(product_name,product_code);
SELECT product_Name,product_code FROM products;
EXPLAIN SELECT * FROM products;
CREATE VIEW product_view AS SELECT product_code,product_name,product_price,product_satus FROM products;
SELECT * FROM product_view;
UPDATE product_view
SET product_price = 200000 , product_code = "SP987",product_satus = "Chưa làm xong"
WHERE product_name = "Bánh Bèo";
DROP VIEW product_view;
DELIMITER //
CREATE PROCEDURE procedure_products()
BEGIN
SELECT * FROM 
products;
END //
DELIMITER  ;
CALL procedure_products();

DELIMITER //
CREATE PROCEDURE add_products(
id INT,
product_code VARCHAR(50),
product_name VARCHAR(50),
product_price INT,
product_amount INT,
product_description VARCHAR(50),
product_status VARCHAR(255))
BEGIN
INSERT INTO products values(id,product_code,product_name,product_price,product_amount,product_description,product_satus);
END //
DELIMITER //
CALL add_products(7,"SP367","Bún giò",70000,4,"Bún giò heo","Đang nấu");

DELIMITER //
CREATE PROCEDURE delete_product(product_id INT)
BEGIN
DELETE FROM products WHERE id = product_id;
END //
DELIMITER //
CALL delete_product(5);






