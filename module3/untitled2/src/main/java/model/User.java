package model;

public class User {
    private String user;
    private String passWork;

    public User() {
    }

    public User(String user, String passWork) {
        this.user = user;
        this.passWork = passWork;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWork() {
        return passWork;
    }

    public void setPassWork(String passWork) {
        this.passWork = passWork;
    }
}
