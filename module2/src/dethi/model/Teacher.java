package dethi.model;

public class Teacher extends Persson {
    private String specialize;

    public Teacher(String id, String name, String dayOfBirth, String gender, String specialize) {
        super(id, name, dayOfBirth, gender);
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()+
                "specialize='" + specialize + '\'' +
                '}';
    }
}
