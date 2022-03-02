USE case_study;
SELECT month(ngay_lam_hop_dong) AS "Thang",COUNT(ma_khach_hang) AS "so_luong_khach_hang" 
FROM hop_dong WHERE ngay_lam_hop_dong LIKE "2021%" 
GROUP BY month(ngay_lam_hop_dong) ORDER BY ngay_lam_hop_dong;