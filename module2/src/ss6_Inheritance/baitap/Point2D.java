package ss6_Inheritance.baitap;

public  class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
     public void setXY( float x, float y){
        this.x = x;
        this.y = y;
     }
    public float[] getXY(){
        float[] arr1 = new float[2];
        arr1[0] = this.x;
        arr1[1] = this.y;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
