package ss100_CaseStudy.Model.facility;

public class Room extends Facility {
    private String freeserviceIncluded;

    public Room() {
    }

    public Room(String freeserviceIncluded) {
        this.freeserviceIncluded = freeserviceIncluded;
    }

    public Room(String idService,String serviceName, double usableArea, int rentalCosts, int maximumNumberofPeople, String pertiveType, String freeserviceIncluded) {
        super(idService,serviceName, usableArea, rentalCosts, maximumNumberofPeople, pertiveType);
        this.freeserviceIncluded = freeserviceIncluded;
    }

    public String getFreeserviceIncluded() {
        return freeserviceIncluded;
    }

    public void setFreeserviceIncluded(String freeserviceIncluded) {
        this.freeserviceIncluded = freeserviceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+
                "freeserviceIncluded='" + freeserviceIncluded + '\'' +
                '}';
    }
}
