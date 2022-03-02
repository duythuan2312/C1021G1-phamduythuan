package dethi2.model;

public class Taikhoan {
    private int id;
    private int idAuto = 0;
    private String MTK;
    private String nameTK;
    private String ngayTao;

    public Taikhoan(String MTK, String nameTK, String ngayTao) {
        idAuto++;
        this.id = idAuto;
        this.MTK = MTK;
        this.nameTK = nameTK;
        this.ngayTao = ngayTao;
    }

    public Taikhoan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getMTK() {
        return MTK;
    }

    public void setMTK(String MTK) {
        this.MTK = MTK;
    }

    public String getNameTK() {
        return nameTK;
    }

    public void setNameTK(String nameTK) {
        this.nameTK = nameTK;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "Taikhoan{" +
                "id=" + id +
                ", idAuto=" + idAuto +
                ", MTK='" + MTK + '\'' +
                ", nameTK='" + nameTK + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                '}';
    }
}
