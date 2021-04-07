public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    Point2D(){

    }
    Point2D(float x,float y){
        this.x = x;
        this.y = y;
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
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    public String toString(){
        return "x : " +x + " y :" +y;
    }
}
class Main{
    public static void main(String[] args) {
        Point2D point1 = new Point2D(2.5f,4.2f);
        point1.getXY();
        System.out.println(point1);
        Point2D point2 = new Point3D(2.6f,3.5f,0.5f);
        System.out.println(point2);
    }
}
