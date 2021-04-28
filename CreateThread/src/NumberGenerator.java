public class NumberGenerator {
    public static void main(String[] args) {
        Create ct1 = new Create();
        Create ct2 = new Create();
        Thread th1 = new Thread(ct1);
        Thread th2 = new Thread(ct2);
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
    }
}
