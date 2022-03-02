package dethi1.model;

public class SavingAccount extends BankAccount {
    private double sotiengui;
    private String ngaygui;
    private String laixuat;
    private int kihan;

    public SavingAccount() {
    }

    public SavingAccount(String MTK, String name, String ngaytao, double sotiengui, String ngaygui, String laixuat, int kihan) {
        super(MTK, name, ngaytao);
        this.sotiengui = sotiengui;
        this.ngaygui = ngaygui;
        this.laixuat = laixuat;
        this.kihan = kihan;
    }

    public double getSotiengui() {
        return sotiengui;
    }

    public void setSotiengui(double sotiengui) {
        this.sotiengui = sotiengui;
    }

    public String getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(String ngaygui) {
        this.ngaygui = ngaygui;
    }

    public String getLaixuat() {
        return laixuat;
    }

    public void setLaixuat(String laixuat) {
        this.laixuat = laixuat;
    }

    public int getKihan() {
        return kihan;
    }

    public void setKihan(int kihan) {
        this.kihan = kihan;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                super.toString()+
                "sotiengui=" + sotiengui +
                ", ngaygui='" + ngaygui + '\'' +
                ", laixuat='" + laixuat + '\'' +
                ", kihan=" + kihan +
                '}';
    }
}
