package model;

public class Customer {
    private String nameCustomer;
    private String dayOfBirth;
    private String address;
    private String photo;

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Customer(String nameCustomer, String dayOfBirth, String address, String photo) {

        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.photo = photo;
    }
}
