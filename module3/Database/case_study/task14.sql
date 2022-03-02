SELECT hop_dong.ma_hop_dong,loai_dich_vu.ten_loai_dich_vu,dich_vu_di_kem.ten_dich_vu_di_kem, 1 as "So_lan_su_dung"
FROM hop_dong 
INNER JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
INNER JOIN dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
INNER JOIN loai_dich_vu ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
WHERE hop_dong_chi_tiet.ma_dich_vu_di_kem IN
 (SELECT hop_dong_chi_tiet.ma_dich_vu_di_kem FROM
 hop_dong INNER JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong 
 GROUP BY hop_dong_chi_tiet.ma_dich_vu_di_kem
 HAVING COUNT(hop_dong_chi_tiet.ma_dich_vu_di_kem ) = 1)
 ORDER BY hop_dong.ma_hop_dong;
