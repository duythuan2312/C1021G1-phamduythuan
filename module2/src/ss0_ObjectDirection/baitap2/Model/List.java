//package ss0_ObjectDirection.baitap2.Model;
//
//import ss101_Dethi.model.Phone;
//
//public class List< extends Phone> implements Comparable<List<Phone>> {
//    private int mssv;
//    private String name;
//    private String dateBirth;
//    private String genDer;
//    private String nameClass;
//    private int department;
//
//    public List(int mssv, String name, String dateBirth, String genDer, String nameClass, int department) {
//        this.mssv = mssv;
//        this.name = name;
//        this.dateBirth = dateBirth;
//        this.genDer = genDer;
//        this.nameClass = nameClass;
//        this.department = department;
//    }
//
//    public List(int mssv) {
//        this.mssv = mssv;
//    }
//
//    public List(String name) {
//        this.name = name;
//    }
//
//    public int getMssv() {
//        return mssv;
//    }
//
//    public void setMssv(int mssv) {
//        this.mssv = mssv;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDateBirth() {
//        return dateBirth;
//    }
//
//    public void setDateBirth(String dateBirth) {
//        this.dateBirth = dateBirth;
//    }
//
//    public String getGenDer() {
//        return genDer;
//    }
//
//    public void setGenDer(String genDer) {
//        this.genDer = genDer;
//    }
//
//    public String getNameClass() {
//        return nameClass;
//    }
//
//    public void setNameClass(String nameClass) {
//        this.nameClass = nameClass;
//    }
//
//    public int getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(int department) {
//        this.department = department;
//    }
//
//    @Override
//    public String toString() {
//        return "List{" +
//                "mssv=" + mssv +
//                ", name='" + name + '\'' +
//                ", dateBirth='" + dateBirth + '\'' +
//                ", genDer='" + genDer + '\'' +
//                ", nameClass='" + nameClass + '\'' +
//                ", khoa=" + department +
//                '}';
//    }
//
//    @Override
//    public int compareTo(List<Phone> o) {
//        return getMssv()-o.getMssv();
//    }
//}
