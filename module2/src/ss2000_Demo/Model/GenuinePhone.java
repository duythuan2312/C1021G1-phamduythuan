package ss2000_Demo.Model;

public class GenuinePhone  extends Phone{
    private String warrantyPeriod;
    private String warrantyCoverage;


    public GenuinePhone() {
    }

    public GenuinePhone(String phoneName, double price, int quantily, String producer, String warrantyPeriod, String warrantyCoverage) {
        super(phoneName ,price, quantily, producer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "GenuinePhone{" +
                super.toString()+
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
