CREATE DATABASE case_study;
USE case_study;
CREATE TABLE vi_tri (
ma_vi_tri INT AUTO_INCREMENT,
ten_vi_tri VARCHAR(45),
PRIMARY KEY (ma_vi_tri)
);
CREATE TABLE trinh_do (
ma_trinh_do INT AUTO_INCREMENT,
ten_trinh_do VARCHAR(50),
PRIMARY KEY (ma_trinh_do)
);
CREATE TABLE bo_phan (
ma_bo_phan INT AUTO_INCREMENT,
ten_bo_phan VARCHAR(55),
PRIMARY KEY (ma_bo_phan)
);
CREATE TABLE nhan_vien (
ma_nhan_vien INT AUTO_INCREMENT,
ho_ten VARCHAR(55) NOT NULL,
ngay_sinh DATE NOT NULL,
so_cmnd VARCHAR(45) NOT NULL,
luong DOUBLE NOT NULL,
so_dien_thoai VARCHAR(50) NOT NULL,
email VARCHAR(55),
dia_chi VARCHAR(255),
ma_vi_tri INT NOT NULL,
ma_trinh_do INT NOT NULL,
ma_bo_phan INT NOT NULL,
PRIMARY KEY (ma_nhan_vien),
FOREIGN KEY(ma_vi_tri) REFERENCES vi_tri(ma_vi_tri),
FOREIGN KEY(ma_trinh_do) REFERENCES trinh_do(ma_trinh_do),
FOREIGN KEY(ma_bo_phan) REFERENCES bo_phan(ma_bo_phan)
);
CREATE TABLE loai_khach (
ma_loai_khach INT AUTO_INCREMENT,
ten_loai_khach VARCHAR(255),
PRIMARY KEY (ma_loai_khach)
);
CREATE TABLE khach_hang (
ma_khach_hang INT AUTO_INCREMENT,
ma_loai_khach INT NOT NULL,
ho_ten VARCHAR(45) NOT NULL,
ngay_sinh DATE NOT NULL,
gioi_tinh BIT(1) NOT NULL,
so_cmnd VARCHAR(45) NOT NULL,
so_dien_thoai VARCHAR(45) NOT NULL,
email VARCHAR(55),
dia_chi VARCHAR(255),
PRIMARY KEY (ma_khach_hang),
FOREIGN KEY(ma_loai_khach) REFERENCES loai_khach(ma_loai_khach)
);
CREATE TABLE kieu_thue (
ma_kieu_thue INT AUTO_INCREMENT,
ten_kieu_thue VARCHAR(255),
PRIMARY KEY (ma_kieu_thue)
);
CREATE TABLE loai_dich_vu (
ma_loai_dich_vu INT AUTO_INCREMENT,
ten_loai_dich_vu VARCHAR(45),
PRIMARY KEY (ma_loai_dich_vu)
);

CREATE TABLE dich_vu (
ma_dich_vu INT AUTO_INCREMENT,
ten_dich_vu VARCHAR(55) NOT NULL,
dien_tich INT,
chi_phi_thue DOUBLE NOT NULL,
so_nguoi_toi_da INT,
ma_kieu_thue INT NOT NULL,
ma_loai_dich_vu INT NOT NULL,
tieu_chuan_phong VARCHAR(55),
mo_ta_tien_nghi_khac VARCHAR(255),
dien_tich_ho_boi DOUBLE,
so_tang INT,
PRIMARY KEY(ma_dich_vu),
FOREIGN KEY(ma_kieu_thue) REFERENCES kieu_thue(ma_kieu_thue),
FOREIGN KEY(ma_loai_dich_vu) REFERENCES loai_dich_vu(ma_loai_dich_vu)
);

CREATE TABLE hop_dong (
ma_hop_dong INT  AUTO_INCREMENT,
ngay_lam_hop_dong DATETIME NOT NULL,
ngay_ket_thuc DATETIME NOT NULL,
tien_dat_coc DOUBLE NOT NULL,
ma_nhan_vien INT NOT NULL,
ma_khach_hang INT NOT NULL,
ma_dich_vu INT NOT NULL,
PRIMARY KEY (ma_hop_dong),
FOREIGN KEY (ma_nhan_vien) REFERENCES nhan_vien(ma_nhan_vien),
FOREIGN KEY (ma_khach_hang) REFERENCES khach_hang(ma_khach_hang),
FOREIGN KEY (ma_dich_vu) REFERENCES dich_vu(ma_dich_vu)
);
CREATE TABLE dich_vu_di_kem (
ma_dich_vu_di_kem INT AUTO_INCREMENT,
ten_dich_vu_di_kem VARCHAR(255) NOT NULL,
gia DOUBLE NOT NULL,
don_vi VARCHAR(255) NOT NULL,
trang_thai VARCHAR(55),
PRIMARY KEY(ma_dich_vu_di_kem)
);
CREATE TABLE hop_dong_chi_tiet (
ma_hop_dong_chi_tiet INT AUTO_INCREMENT,
ma_hop_dong INT NOT NULL,
ma_dich_vu_di_kem INT NOT NULL,
so_luong INT NOT NULL,
PRIMARY KEY(ma_hop_dong_chi_tiet),
FOREIGN KEY(ma_hop_dong) REFERENCES hop_dong(ma_hop_dong),
FOREIGN KEY(ma_dich_vu_di_kem) REFERENCES dich_vu_di_kem(ma_dich_vu_di_kem)
);
INSERT INTO vi_tri VALUES (null,"Quản lý"),(null,"Nhân Viên");
-- SELECT * FROM vi_tri;
INSERT INTO trinh_do VALUES (null,"Trung Cấp"),(null,"Cao Đẳng"),(null,"Đại Học"),(null,"Sau Đại Học");
-- SELECT * FROM trinh_do;
INSERT INTO bo_phan VALUES (null,"Sale-Marketing"),(null,"Hành Chính"),(null,"Phục Vụ"),(null,"Quản lý");
-- SELECT * FROM bo_phan;
INSERT INTO nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) VALUES 
    ("Nguyễn Văn A","2003-1-23","206400646123",10000000,"0905123456","annguyen@gmai.com","295,Nguyễn Tất Thành,Đà Nẵng",1,3,1),
	("Lê Văn Bình","1997-04-09","123456799",80000000,"0905456781","binhvanle@gmail.com","22 Yên Bái,Đà Nẵng",1,2,2),
	("Hồ Thị Yến","1993-05-03","464564564564",90000000,"0905456781","yenthhiho@gmail.com","k/234/11,Điện Biên Phủ,Đà Nẵng",1,3,2),
	("Võ Công Toản ","1996-12-20","132131321321",70000000,"0702465789","toan0404@gmail.com","77 Hoàng Diệu, Quảng Trị",1,4,4),
	("Nguyễn Bỉnh Phát","1997-12-01","312312313",60000000,"09054534581","phatphat@gmail.com","43 Yên Bái, Đà Nẵng",2,1,1),
	("Khúc Nguyễn An Nghi","1997-11-21","1315545654",60000000,"0987456123","annghi20@gmail.com","294 Nguyễn Tất Thành, Đà Nẵng",2,2,3),
	("Nguyễn Hữu Hà","1997-5-6","21321364",8700000,"07023694561","nhh0101@gmail.com","4 Nguyễn Chí Thanh, Huế",2,3,2),
	("Nguyễn Hà Đông","1997-7-12","312313123",1200000,"01785123146","donghanguyen@gmail.com","111 Hùng Vương, Hà Nội",2,4,4),
	("Tòng Hoang","1997-8-24","7897854645",45000000,"07023649874","hoangtong@gmail.com","213 Hàm Nghi, Đà Nẵng",2,4,4),
	("Nguyễn Công Đạo","1997-9-23","789987654345",6560000000,"0395123456","nguyencongdao12@gmail.com","6 Hoà Khánh, Đồng Nai",2,3,2);
SELECT * FROM nhan_vien;
INSERT INTO loai_khach VALUES(null,"Diamond"), (null,"Platinium"),(null,"Gold"),(null,"Silver"),(null,"Member");
SELECT * FROM loai_khach;
INSERT INTO khach_hang(ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach) VALUES 
("Nguyễn Thị Hào","1970-11-07",b'0',"643431213","0945423362","thihao07@gmail.com","23 Nguyễn Hoàng,Đà Nẵng",5),
("Phạm Xuân Diệu","1992-08-08",b'1',"865342123","0954333333","xuandieu92@gmail.com","K77/22 Thái Phiên, Quảng Trị",3),
("Trương Đình Nghệ","1990-02-27",b'1',"488645199","0373213122","nghenhan2702@gmail.com","K323/12 Ông Ích Khiêm, Vinh",1),
("Dương Văn Quan","1981-07-08",b'1',"543432111","0490039241","duongquan@gmail.com","K453/12 Lê Lợi, Đà Nẵng",1),
("Hoàng Trần Nhi Nhi","1995-12-09",b'0',"795453345","0312345678","nhinhi123@gmail.com","224 Lý Thái Tổ, Gia Lai",4),
("Tôn Nữ Mộc Châu","2005-12-06",b'0',"732434215","0988888844","tonnuchau@gmail.com","37 Yên Thế, Đà Nẵng",4),
("Nguyễn Mỹ Kim","1984-04-08",b'0',"856453123","0912345698","kimcuong84@gmail.com","K123/45 Lê Lợi, Hồ Chí Minh",1),
("Nguyễn Thị Hào","1999-04-08",b'0',"965656433","0763212345","haohao99@gmail.com","55 Nguyễn Văn Linh, Kon Tum",3),
("Trần Đại Danh","1994-07-01",b'1',"432341235","0643343433","danhhai99@gmail.com","24 Lý Thường Kiệt, Quảng Ngãi",1),
("Nguyễn Tâm Đắc","1989-07-01",b'1',"344343432","0987654321","tdactam@gmail.com","22 Ngô Quyền, Đà Nẵng",2);
SELECT * FROM khach_hang;
INSERT INTO kieu_thue VALUES (null,"year"),(null,"month"),(null,"day"),(null,"hour");
SELECT * FROM kieu_thue;
INSERT INTO loai_dich_vu VALUES (null,"Villa"),(null,"House"),(null,"Room");
SELECT * FROM loai_dich_vu;
INSERT INTO dich_vu(ten_dich_vu, dien_tich, chi_phi_thue, so_nguoi_toi_da, tieu_chuan_phong, mo_ta_tien_nghi_khac, dien_tich_ho_boi, so_tang,ma_kieu_thue, ma_loai_dich_vu) VALUES
("Villa Beach Front","25000",10000000,10,"vip","Có hồ bơi",500,4,3,1),
("House Princess 01","14000",5000000,7,"vip","Có thêm bếp nướng",null,3,2,2),
("Room Twin 01","5000",1000000,2,"vip","Có tivi",null,null,4,3),
("Villa No Beach Front","22000",9000000,8,"normal","Có hồ bơi",300,3,3,1),
("House Princess 02","10000",4000000,5,"normal","Có thêm bếp nướng",null,2,3,2),
("Room Twin 02","3000",900000,2,"normal","Có tivi",null,null,4,3);
 SELECT * FROM dich_vu;
 INSERT INTO dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) VALUES
 ("Karaoke",10000,"giờ","tiện nghi,hiện tại"),	
 ("Thuê xe máy",10000,"chiếc","hỏng 1 xe"),
 ("Thuê xe đạp",20000,"chiếc","Tốt"),
 ("Buffet buổi sáng",15000,"suất","đầy đủ đồ ăn, tráng miệng"),
 ("Buffet buổi trưa",90000,"suất","đầy đủ đồ ăn, tráng miệng"),
 ("Buffet buổi tối",16000,"suất","đầy đủ đồ ăn, tráng miệng");
 SELECT * FROM dich_vu_di_kem;
 INSERT INTO hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) VALUES
 ("2020-12-08","2020-12-08",0,3,1,3),
 ("2020-07-14","2020-07-21",200000,7,3,1),
 ("2021-03-15","2021-03-17",50000,3,4,2),
 ("2021-01-14","2021-01-18",100000,7,5,5),
 ("2021-07-14","2021-07-15",0,7,2,6),
 ("2021-06-01","2021-06-03",0,7,7,6),
 ("2021-09-02","2021-09-05",100000,7,4,4),
 ("2021-06-08","2021-06-18",150000,3,4,1),
 ("2021-11-08","2021-11-19",0,3,4,3),
 ("2021-04-08","2021-04-14",0,10,3,5),
 ("2021-04-08","2021-04-25",0,2,2,1),
 ("2021-05-08","2021-05-27",0,7,10,1);
 SELECT * FROM hop_dong;
 INSERT INTO hop_dong_chi_tiet(so_luong,ma_hop_dong,ma_dich_vu_di_kem) VALUES
 (5,2,4),
 (8,2,5),
 (15,2,6),
 (1,3,1),
 (11,3,2),
 (1,1,3),
 (2,1,2),
 (2,12,2);
 SELECT * FROM hop_dong_chi_tiet;
 
 
 
