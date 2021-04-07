public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point(0.5f,0.5f);
        System.out.println(pt1);
        MoveablePoint mp1 = new MoveablePoint(1f,0.5f,2f,2f);
        System.out.println(mp1);
        System.out.println(mp1.move());
    }
}
