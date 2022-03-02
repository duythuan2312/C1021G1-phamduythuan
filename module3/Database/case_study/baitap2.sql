USE quan_li_ban_hang;
INSERT INTO customer VALUES (1,"Minh Quan",10),(2,"Ngoc Oanh",20),(3,"Hong Ha",50);

INSERT INTO orders(oID,cID,oDate,oTotalPrice) VALUES
 (1,1,"2006-3-21",null),
 (2,2,"2006-3-23",null),
 (3,1,"2006-3-16",null);
 SELECT * FROM orders;
 INSERT INTO product(pID,pName,pPirce) VALUES (1,"May Giat",3), (2,"Tu Lanh",5),(3,"Dieu Hoa",7),(4,"Quat",1),(5,"Bep Dien",2);
 SELECT * FROM product;
 INSERT INTO order_detail(oID,pID,odQTY) VALUES (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
 SELECT * FROM order_detail;
 SELECT oID,oDate,oTotalPrice FROM orders;

 SELECT  customer.cName, GROUP_CONCAT(product.pName) AS "Array product" FROM customer
 INNER JOIN orders on customer.cID = orders.cID 
 INNER JOIN order_detail on orders.oID = order_detail.oID 
 INNER JOIN product  on order_detail.pID = product.pID 
 GROUP BY customer.cName;
 
 
 SELECT  customer.cName,product.pName,order_detail.odQTY FROM customer
 LEFT JOIN orders on  customer.cID = orders.cID 
 LEFT JOIN order_detail on  orders.oID = order_detail.oID 
 LEFT JOIN product  on  order_detail.pID = product.pID 
 WHERE order_detail.odQTY IS NULL;
 
SELECT order_detail.oID,orders.oDate,SUM(order_detail.odQTY * product.pPirce) AS "toltal pirce" FROM
customer INNER JOIN orders on customer.cID = orders.cID 
INNER JOIN order_detail on order_detail.oID = orders.oID 
INNER JOIN product on product.pID = order_detail.pID
GROUP BY order_detail.oID;
