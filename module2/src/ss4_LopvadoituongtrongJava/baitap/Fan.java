package ss4_LopvadoituongtrongJava.baitap;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;

    private int speed = slow ;
    private boolean on = false;
    private double radius = 5 ;
    private String color = "blue";

    public boolean getOn(){
        return on;
    }

    public int getSlow() {
        return slow;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        if (getOn()) {
            return "Fan{" +
                    "slow=" + slow +
                    ", medium=" + medium +
                    ", fast=" + fast +
                    ", speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan{" +
                    ",color'=" +color+
                    ", radius=" +radius+'\'' +
                    '}';
        }

    }

    public Fan(int speed , boolean on , double radius , String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(1,true,10,"blue");
        System.out.println(fan1.toString() +"Fan is on");

        Fan fan2 = new Fan(2,false,5,"yellow");
        System.out.println(fan2.toString() +"Fan is off");
    }


}
