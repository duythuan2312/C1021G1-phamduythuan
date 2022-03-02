USE case_study;
SELECT * FROM nhan_vien
 WHERE ho_ten LIKE "H%" OR ho_ten LIKE "T%" OR ho_ten LIKE "K%" AND char_length(nhan_vien.ho_ten) < 15;
