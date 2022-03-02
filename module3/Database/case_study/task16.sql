USE case_study;
CREATE TEMPORARY TABLE table_nhan_vien 
SELECT nhan_vien.* FROM nhan_vien INNER JOIN hop_dong
ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
GROUP BY nhan_vien.ma_nhan_vien HAVING COUNT(hop_dong.ma_hop_dong) < 1;

SELECT * FROM table_nhan_vien;

SET SQL_SAFE_UPDATES=0;
DELETE  FROM  nhan_vien WHERE nhan_vien.ma_nhan_vien
IN (SELECT nhan_vien.ma_nhan_vien  FROM table_nhan_vien);
SET SQL_SAFE_UPDATES=1;

DELETE  FROM  nhan_vien WHERE nhan_vien.ma_nhan_vien
IN (SELECT nhan_vien.ma_nhan_vien  FROM table_nhan_vien);

DROP TABLE table_nhan_vien;