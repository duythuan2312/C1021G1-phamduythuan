USE case_study;

CREATE TEMPORARY TABLE delete_table
SELECT khach_hang.ma_khach_hang,hop_dong.ngay_lam_hop_dong FROM khach_hang JOIN hop_dong
ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
WHERE hop_dong.ngay_lam_hop_dong < 2021-01-1;

SELECT * FROM delete_table;

SET FOREIGN_KEY_CHECKS=OFF;
DELETE FROM khach_hang WHERE khach_hang.ma_khach_hang
IN (SELECT delete_table.ma_khach_hang FROM delete_table);
SET FOREIGN_KEY_CHECKS=ON;

DROP TABLE delete_table;