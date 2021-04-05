import java.util.Date;

public class StopWatch {
    private long startTime ;
    private long endTime ;
    void start(){
         this.startTime = System.currentTimeMillis();
    }
    void stop(){
        this.endTime = System.currentTimeMillis();
    }
    long getElapsedTime(){
        return (this.endTime - this.startTime);
    }
    public static void main(String[] args) {
        StopWatch test = new StopWatch();
        int[] arr = new int[100000];
        test.start();
        for(int i=0;i<100000;i++){
            arr[i] = (int)(Math.random()*100+1);
        }
        test.stop();
        System.out.println(test.getElapsedTime());
    }
}
