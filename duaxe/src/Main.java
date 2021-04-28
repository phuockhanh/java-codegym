public class Main {
    public static int end = 200;
    public static int step = 5;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        System.out.println("End : 100");
        new Thread(carA).start();
        new Thread(carB).start();
        new Thread(carC).start();
    }
}
