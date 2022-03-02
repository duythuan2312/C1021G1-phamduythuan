package ss6_Inheritance.baitap;

public class MoveablePoint extends Point {
    private  float xSpeed = 0.0f;
    private  float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    public float[] getSpeed(){
        float[] array2 = new float[2];
        array2[0] = this.xSpeed;
        array2[1] = this.ySpeed;
        return array2;
    }

    @Override
    public String toString() {
MoveablePoint temp = this.getMove();
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                "Sum="+temp.getX()+
                "Sum=" +temp.getY()+
                '}';
    }
    public MoveablePoint getMove(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
        return this;
    }

}
