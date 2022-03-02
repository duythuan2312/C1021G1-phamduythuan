SELECT hop_dong.ma_khach_hang,khach_hang.ho_ten,COUNT(ma_hop_dong) FROM hop_dong INNER JOIN
khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang 
INNER JOIN loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
 WHERE ten_loai_khach LIKE "Diamond" 
 GROUP BY  hop_dong.ma_khach_hang
 ORDER BY COUNT(ma_hop_dong) ASC ;