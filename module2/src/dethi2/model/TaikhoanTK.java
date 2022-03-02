package dethi2.model;

public class TaikhoanTK extends Taikhoan {
    private double sotienguiTk;
    private String ngayGui;
    private double laiXuat;
    private int kiHan;

    public TaikhoanTK(String MTK, String nameTK, String ngayTao, double sotienguiTk, String ngayGui, double laiXuat, int kiHan) {
        super(MTK, nameTK, ngayTao);
        this.sotienguiTk = sotienguiTk;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public TaikhoanTK() {
    }

    public double getSotienguiTk() {
        return sotienguiTk;
    }

    public void setSotienguiTk(double sotienguiTk) {
        this.sotienguiTk = sotienguiTk;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaikhoanTK{" +
                super.toString()+
                "sotienguiTk=" + sotienguiTk +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiXuat=" + laiXuat +
                ", kiHan=" + kiHan +
                '}';
    }
}
