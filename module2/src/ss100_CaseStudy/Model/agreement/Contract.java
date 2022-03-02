package ss100_CaseStudy.Model.agreement;

public class Contract {
    private String someContracts;
    private String bokingCode;
    private int advanceDepositamount;
    private int totalPaymentAmount;
    private String id;

    public Contract(String someContracts, String bokingCode, int advanceDepositamount, int totalPaymentAmount, String id) {
        this.someContracts = someContracts;
        this.bokingCode = bokingCode;
        this.advanceDepositamount = advanceDepositamount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.id = id;
    }

    public Contract() {
    }

    public String getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(String someContracts) {
        this.someContracts = someContracts;
    }

    public String getBokingCode() {
        return bokingCode;
    }

    public void setBokingCode(String bokingCode) {
        this.bokingCode = bokingCode;
    }

    public int getAdvanceDepositamount() {
        return advanceDepositamount;
    }

    public void setAdvanceDepositamount(int advanceDepositamount) {
        this.advanceDepositamount = advanceDepositamount;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts='" + someContracts + '\'' +
                ", bokingCode='" + bokingCode + '\'' +
                ", advanceDepositamount=" + advanceDepositamount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                ", id='" + id + '\'' +
                '}';
    }
}
