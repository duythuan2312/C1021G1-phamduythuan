USE case_study;
SELECT hop_dong.ma_hop_dong,nhan_vien.ho_ten,khach_hang.ho_ten,
khach_hang.so_dien_thoai,dich_vu.ten_dich_vu,SUM(so_luong) as "so_luong_dich_vu_di_kem" ,
   CASE
	WHEN  SUM(so_luong) > 0 THEN SUM(so_luong)
	ELSE 0
	END AS tong_so_luong_dich_vu_di_kem,hop_dong.tien_dat_coc
FROM hop_dong
LEFT JOIN nhan_vien ON hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
LEFT JOIN khach_hang ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang 
LEFT JOIN dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu 
LEFT JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
WHERE  dich_vu.ten_dich_vu NOT IN
(SELECT dich_vu.ma_dich_vu
FROM dich_vu  JOIN hop_dong  ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
WHERE year(hop_dong.ngay_lam_hop_dong) =2021 AND month(hop_dong.ngay_lam_hop_dong) in (1,2,3,4,5,6) )
AND (year(hop_dong.ngay_lam_hop_dong) = 2020 AND month(hop_dong.ngay_lam_hop_dong) in (10,11,12))
GROUP BY khach_hang.ho_ten;