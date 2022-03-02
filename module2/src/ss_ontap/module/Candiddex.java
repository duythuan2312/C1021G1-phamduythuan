package ss_ontap.module;

public class Candiddex {
        private int id;
        private static int idAuto = 0;
        private String name;
        private String dayOfBirth;
        private double toan;
        private double van;
        private  double anh;

    public Candiddex() {
    }

    public Candiddex(String name, String dayOfBirth, double toan, double van, double anh) {
        idAuto++;
        this.id = idAuto;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdAuto() {
        return idAuto;
    }

    public static void setIdAuto(int idAuto) {
        Candiddex.idAuto = idAuto;
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

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getAnh() {
        return anh;
    }

    public void setAnh(double anh) {
        this.anh = anh;
    }
    public double getSum(){
        double sum = this.toan + this.van + this.anh;
        return sum;
    }

    @Override
    public String toString() {
        return "Candiddex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", toan=" + toan +
                ", van=" + van +
                ", anh=" + anh +
                '}';
    }
}
