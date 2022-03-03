package com.phamduythuan.model;

import java.util.Date;

public class Declaration {
    private String fullName;
    private Date birthday;
    private String gender;
    private String country;
    private String CMND;
    private String vehicle;
    private int seats;
    private Date departureDay;
    private Date andDate;
    private String move;
    private String city;
    private String district;
    private String commune;
    private String address;
    private String phone;
    private String email;
    private String symptom;
    private String history;

    public Declaration() {
    }

    public Declaration(String fullName, Date birthday, String gender, String country,
                       String CMND, String vehicle, int seats, Date departureDay,
                       Date andDate, String move, String city, String district, String commune,
                       String address, String phone, String email, String symptom, String history) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.CMND = CMND;
        this.vehicle = vehicle;
        this.seats = seats;
        this.departureDay = departureDay;
        this.andDate = andDate;
        this.move = move;
        this.city = city;
        this.district = district;
        this.commune = commune;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.symptom = symptom;
        this.history = history;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Date getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(Date departureDay) {
        this.departureDay = departureDay;
    }

    public Date getAndDate() {
        return andDate;
    }

    public void setAndDate(Date andDate) {
        this.andDate = andDate;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
