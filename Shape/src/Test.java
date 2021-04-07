public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10 , "green", true);
        Shape s = new Circle(10);
        Shape shape = new Shape();
        Shape shape1 = new Shape("black", false);
        System.out.println(shape);
        System.out.println(shape1);
        System.out.println(circle);
        System.out.println(s);

    }
}
