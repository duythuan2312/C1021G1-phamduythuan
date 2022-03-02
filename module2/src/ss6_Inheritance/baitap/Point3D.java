package ss6_Inheritance.baitap;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x ,float y ,float z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public float[] getXYZ(){
        float[] arr2 = new float[3];
        arr2[0] = this.x;
        arr2[1] = this.y;
        arr2[2] = this.z;
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
