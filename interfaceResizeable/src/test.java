public class test {
    public static void main(String[] args) {
        Shape sp1 = new Shape("Red",true);
        System.out.println(sp1);
        double percent =(int) (Math.random()*101+100);
        Circle circle = new Circle(10);
        circle.resize(percent);
        System.out.println(circle);
        Square square = new Square(15);
        square.resize(percent);
        System.out.println(square);
    }
}
