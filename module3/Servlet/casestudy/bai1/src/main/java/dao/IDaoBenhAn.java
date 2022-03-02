package dao;

import model.BenhAn;

import java.util.List;

public interface IDaoBenhAn {
    List<BenhAn> listBenhAn();

    void removeBenhAn(BenhAn maBenhAn);

    void updateBenhAn(BenhAn maBenhAn);
}
