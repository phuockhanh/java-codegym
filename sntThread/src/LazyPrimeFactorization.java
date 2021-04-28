public class LazyPrimeFactorization implements Runnable {
    public boolean isPrime(int number){
        if(number>=2){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            if(isPrime(i)){
                System.out.println("Lazy: "+i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Lazy done!!");
    }
}
