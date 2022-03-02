SELECT * FROM khach_hang
WHERE (SELECT ROUND(DATEDIFF(CURDATE(), ngay_sinh) / 365, 0)) 
BETWEEN 18 AND 50
AND (dia_chi LIKE "%da nang" OR dia_chi LIKE "%quang tri");