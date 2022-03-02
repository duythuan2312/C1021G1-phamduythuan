CREATE DATABASE quan_li_vat_tu;
USE quan_li_vat_tu;

CREATE TABLE phieu_xuat (
so_px int PRIMARY KEY,
ngay_xuat DATETIME
);

CREATE TABLE vat_tu (
ma_vtu INT PRIMARY KEY,
ten_vtu VARCHAR(255)
);

CREATE TABLE chi_tiet_phieu_xuat (
dg_xuat DOUBLE NOT NULL,
sl_Xuat INT NOT NULL,
so_px INT,
ma_vtu INT,
PRIMARY KEY (So_PX,Ma_VTU),
FOREIGN KEY (So_PX) REFERENCES phieu_xuat(So_PX),
FOREIGN KEY (Ma_VTU) REFERENCES vat_tu(Ma_VTU)
);

CREATE TABLE phieu_nhap (
so_pn INT PRIMARY KEY,
ngay_nhap DATETIME
);

CREATE TABLE chi_tiet_phieu_nhap (
dg_nhap DOUBLE NOT NULL,
sl_nhap INT NOT NULL,
ma_vtu INT,
so_pn INT,
PRIMARY KEY(ma_vtu,so_pn),
FOREIGN KEY(ma_vtu) REFERENCES vat_tu(ma_vtu),
FOREIGN KEY(so_pn) REFERENCES phieu_nhap(so_pn) 
);
CREATE TABLE don_dh (
so_dh INT PRIMARY KEY,
ngay_dh DATETIME ,
man_cc INT,
FOREIGN KEY(man_cc) REFERENCES nha_CC(man_cc)
);
CREATE TABLE chi_tiet_don_dat_hang (
dg_dathang DOUBLE,
sl_dathang INT,
ma_vtu INT,
so_dh INT ,
PRIMARY KEY(ma_vtu,so_dh),
FOREIGN KEY (ma_vtu) REFERENCES vat_tu(Ma_VTU),
FOREIGN KEY (so_dh) REFERENCES don_dh(so_dh)
);
CREATE TABLE nha_cc (
man_cc INT PRIMARY KEY ,
tenn_cc VARCHAR(255),
dia_chi VARCHAR(255)
);
CREATE TABLE so_dien_thoai (
sdt VARCHAR(10) PRIMARY KEY,
man_cc INT,
FOREIGN KEY(man_cc) REFERENCES nha_cc(man_cc)
);
INSERT INTO phieu_xuat VALUES (1,"2022-12-1"),(2,"2021-1-12");
SELECT * FROM phieu_xuat;

