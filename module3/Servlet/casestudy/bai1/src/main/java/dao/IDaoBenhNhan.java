package dao;

import model.BenhNhan;

import java.util.List;

public interface IDaoBenhNhan {
     List<BenhNhan> listBenhNhan();

     void removeBenhNhan(BenhNhan maBenhNhan);

     void updateBenhNhan(BenhNhan maBenhNhan);

}
