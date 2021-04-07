public class Point3D extends  Point2D {
    public float z = 0.0f;
    Point3D(){
        super();
    }
    Point3D( float x, float y,float z){
        super(x,y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXY() {
        float[] arr = new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }
    public String toString(){
        return "x : " +x + " y :" +y + " z : " +z;
    }
}
