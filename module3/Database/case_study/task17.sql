USE case_study;
CREATE TEMPORARY TABLE update_kh 
SELECT khach_hang.ma_khach_hang
FROM 
khach_hang LEFT JOIN loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
LEFT JOIN hop_dong ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
LEFT JOIN dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
LEFT JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
LEFT JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
WHERE loai_khach.ten_loai_khach = "Platinium"
GROUP BY hop_dong.ma_hop_dong
HAVING SUM(dich_vu.chi_phi_thue+(hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia))>10000000;

SELECT *  FROM update_kh ;


SET SQL_SAFE_UPDATES=0;
UPDATE loai_khach
SET ten_loai_khach = "Diamond" WHERE ten_loai_khach = "Platinium";
SET SQL_SAFE_UPDATES=1; 