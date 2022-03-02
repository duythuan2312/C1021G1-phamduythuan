USE case_study;
CREATE TEMPORARY TABLE update_gia 
SELECT dich_vu_di_kem.ma_dich_vu_di_kem FROM dich_vu_di_kem INNER JOIN hop_dong_chi_tiet
ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
INNER JOIN hop_dong ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
WHERE hop_dong_chi_tiet.so_luong > 10 AND year(hop_dong.ngay_lam_hop_dong) = 2020  ;

SELECT * FROM update_gia;

UPDATE dich_vu_di_kem
SET dich_vu_di_kem.gia = dich_vu_di_kem.gia * 2 WHERE dich_vu_di_kem.ma_dich_vu_di_kem IN
(SELECT * FROM  update_gia);

DROP TABLE update_gia;