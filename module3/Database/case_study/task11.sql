USE case_study;
SELECT dich_vu_di_kem.ma_dich_vu_di_kem , dich_vu_di_kem.ten_dich_vu_di_kem
FROM loai_khach
INNER JOIN khach_hang ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
INNER JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
INNER JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
WHERE  loai_khach.ten_loai_khach = "Diamond" AND (khach_hang.dia_chi LIKE "%Vinh" OR "%Quảng Ngãi");
