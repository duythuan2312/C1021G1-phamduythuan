package ss_ontap.baitap2.model;

public class Model implements Comparable<Model>{
    private String MSSV;
    private String name;
    private String dayOfBirth;
    private String gender;
    private String className;
    private String course;

    public Model() {
    }

    public Model(String MSSV, String name, String dayOfBirth, String gender, String className, String course) {
        this.MSSV = MSSV;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.className = className;
        this.course = course;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Model{" +
                "MSSV='" + MSSV + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Model o) {
        return this.MSSV.compareTo(o.getMSSV());
    }
}
