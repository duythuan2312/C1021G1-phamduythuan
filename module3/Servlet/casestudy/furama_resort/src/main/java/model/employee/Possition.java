package model.employee;

public class Possition {
    private int possitionId;
    private String possitionName;

    public Possition(int possitionId, String possitionName) {
        this.possitionId = possitionId;
        this.possitionName = possitionName;
    }

    public Possition() {
    }

    public int getPossitionId() {
        return possitionId;
    }

    public void setPossitionId(int possitionId) {
        this.possitionId = possitionId;
    }

    public String getPossitionName() {
        return possitionName;
    }

    public void setPossitionName(String possitionName) {
        this.possitionName = possitionName;
    }
}
