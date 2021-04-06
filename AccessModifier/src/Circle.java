public class Circle {
    public double radius = 1.0;
    public String color = "red";
    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println(c1.getArea());
    }
}
