package ss100_CaseStudy.Model.facility;

public class House extends Facility {
    private String roomStandard;
    private int numberFloors;

    public House() {
    }

    public House(String roomStandard, int numberFloors) {
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public House(String idService,String serviceName, double usableArea, int rentalCosts, int maximumNumberofPeople, String pertiveType, String roomStandard, int numberFloors) {
        super(idService,serviceName, usableArea, rentalCosts, maximumNumberofPeople, pertiveType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
