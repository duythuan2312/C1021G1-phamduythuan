package ss100_CaseStudy.Model.Persson;

public class Employee extends Persson {
    private String education;
    private String position;
    private double salary;

    public Employee(String id, String fullName, String dayOfBirth, String sex, String identityCardNo, String phoneNo, String email, String education, String position, double salary) {
        super(id, fullName, dayOfBirth, sex, identityCardNo, phoneNo, email);
        this.education = education;
        this.position = position;
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"+
                ""+super.toString()+
                "education='" + education + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
