package ss0_ObjectDirection.baitap1.model;

public class Candidates {
    private int id;
    private String name;
    private String datebirth;
    private double mathscore;
    private double literature;
    private double english;

    public Candidates(int id, String name, String datebirth, double mathscore, double literature, double english) {
        this.id = id;
        this.name = name;
        this.datebirth = datebirth;
        this.mathscore = mathscore;
        this.literature = literature;
        this.english = english;
    }

    public Candidates(int id) {
        this.id = id;
    }

    public Candidates(String name) {
        this.name = name;
    }

    public Candidates(double english) {
        this.english = english;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public double getMathscore() {
        return mathscore;
    }

    public void setMathscore(double mathscore) {
        this.mathscore = mathscore;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }
    public double getSum(){
        double sum = (this.mathscore + this.english + this.literature);
        return sum;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datebirth=" + datebirth +
                ", mathscore=" + mathscore +
                ", literature=" + literature +
                ", english=" + english +
                ",Sum=" +getSum()+
                '}';
    }
}
