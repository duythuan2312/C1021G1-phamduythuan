package dethi2.model;

public class TaikhoanTT extends Taikhoan{
    private String soThe;
    private double sotienTrongTk;

    public TaikhoanTT(String MTK, String nameTK, String ngayTao, String soThe, double sotienTrongTk) {
        super(MTK, nameTK, ngayTao);
        this.soThe = soThe;
        this.sotienTrongTk = sotienTrongTk;
    }

    public TaikhoanTT() {
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public double getSotienTrongTk() {
        return sotienTrongTk;
    }

    public void setSotienTrongTk(double sotienTrongTk) {
        this.sotienTrongTk = sotienTrongTk;
    }

    @Override
    public String toString() {
        return "TaikhoanTT{" +
                super.toString()+
                "soThe='" + soThe + '\'' +
                ", sotienTrongTk=" + sotienTrongTk +
                '}';
    }
}
