package ss100_CaseStudy.Model.Persson;

public class Customer extends Persson{
    private String typeOfGuest;
    private String address;

    public Customer(String s, String fullName, String dayOfBirth, String sex, String identityCardNo, String phoneNo, String email, String education, String position, double salary, String typeOfGuest, String address) {
    }

    public Customer(String id, String fullName, String dayOfBirth, String sex, String identityCardNo, String phoneNo, String email, String typeOfGuest, String address) {
        super(id, fullName, dayOfBirth, sex, identityCardNo, phoneNo, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
