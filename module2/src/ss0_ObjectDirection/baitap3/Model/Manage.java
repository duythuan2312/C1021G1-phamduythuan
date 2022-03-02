package ss0_ObjectDirection.baitap3.Model;

public class Manage {
    private int id;
    private String name;
    private String genDer;
    private String homeTown;
    private String yearofBirth;
    private String speciaLize;
    private int leVel;
    private  double coefficientsSalary;
    private double alloWance;


    public Manage(int id, String name, String genDer, String homeTown, String yearofBirth, String speciaLize, int leVel, double coefficientsSalary, double alloWance) {
        this.id = id;
        this.name = name;
        this.genDer = genDer;
        this.homeTown = homeTown;
        this.yearofBirth = yearofBirth;
        this.speciaLize = speciaLize;
        this.leVel = leVel;
        this.coefficientsSalary = coefficientsSalary;
        this.alloWance = alloWance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getGenDer() {
        return genDer;
    }

    public void setGenDer(String genDer) {
        this.genDer = genDer;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getYearofBirth() {
        return yearofBirth;
    }

    public void setYearofBirth(String yearofBirth) {
        this.yearofBirth = yearofBirth;
    }

    public String getSpeciaLize() {
        return speciaLize;
    }

    public void setSpeciaLize(String speciaLize) {
        this.speciaLize = speciaLize;
    }

    public int getLeVel() {
        return leVel;
    }

    public void setLeVel(int leVel) {
        this.leVel = leVel;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getAlloWance() {
        return alloWance;
    }

    public void setAlloWance(double alloWance) {
        this.alloWance = alloWance;
    }
    public  double getrealReceiving(){
        double realReceiving = (this.coefficientsSalary + this.alloWance)*450000;
        return realReceiving;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", yearofBirth='" + yearofBirth + '\'' +
                ", speciaLize='" + speciaLize + '\'' +
                ", leVel=" + leVel +
                ", coefficientsSalary=" + coefficientsSalary +
                ", alloWance=" + alloWance +
                ",Thực nhận=" +getrealReceiving()+
                '}';
    }
}
