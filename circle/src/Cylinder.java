public class Cylinder extends Circle {
    public double height;
    public Cylinder(double radius,String color, double height){
        super(radius,color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume(){
        return getRadius()*getRadius()*Math.PI*this.height;
    }
    public String toString(){
        return super.toString() + " Height : "+height + " Volume : " + Volume();
    }
}
