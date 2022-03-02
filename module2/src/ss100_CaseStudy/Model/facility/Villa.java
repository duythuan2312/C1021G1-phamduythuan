package ss100_CaseStudy.Model.facility;

import java.util.Objects;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberLoors;

    public Villa(String roomStandard, double poolArea, int numberLoors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberLoors = numberLoors;
    }

    public Villa(String idService,String serviceName, double usableArea, int rentalCosts, int maximumNumberofPeople, String pertiveType, String roomStandard, double poolArea, int numberLoors) {
        super(idService,serviceName, usableArea, rentalCosts, maximumNumberofPeople, pertiveType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberLoors = numberLoors;
    }

    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberLoors() {
        return numberLoors;
    }

    public void setNumberLoors(int numberLoors) {
        this.numberLoors = numberLoors;
    }

    @Override
    public String toString() {
        return "Villa" +
                super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberLoors=" + numberLoors+
                '}'
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return Objects.equals(roomStandard, villa.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomStandard);
    }
}
