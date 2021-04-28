public class testThread {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        Thread thodd = new Thread(odd);
        Thread theven = new Thread(even);
        thodd.start();
        try {
            theven.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        theven.start();
    }
}
