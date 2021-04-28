public class test {
    public static void main(String[] args) {
        new Thread(new OptimizedPrimeFactorization()).start();
        new Thread(new LazyPrimeFactorization()).start();
    }
}
