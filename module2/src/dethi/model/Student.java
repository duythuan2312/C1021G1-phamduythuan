package dethi.model;

public class Student extends Persson{
    private String className;
    private double scores;

    public Student(String id, String name, String dayOfBirth, String gender, String className, double scores) {
        super(id, name, dayOfBirth, gender);
        this.className = className;
        this.scores = scores;
    }

    public Student() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "className='" + className + '\'' +
                ", scores=" + scores +
                '}';
    }
}
