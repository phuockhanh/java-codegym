import java.util.Arrays;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head;
    public int tail;
    public int currentSize=0;
    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[capacity];
    }
    public void cansuCapa(){
        int newSize = queueArr.length*2;
        queueArr = Arrays.copyOf(queueArr,newSize);
    }
    public boolean isQueueFull(){
        if(currentSize>=queueArr.length){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isQueueEmpty(){
        if(currentSize==0){
            return true;
        }
        else{
        }
        return false;
    }
    public void enqueue(int item){
        if(currentSize==queueArr.length){
            cansuCapa();
        }
        queueArr[currentSize] = item;
        currentSize++;
    }
    public void dequeue(){
        sort1(queueArr);
    }
    public int[] sort1(int[] queueArr){
        for(int i=0;i<currentSize-1;i++){
            queueArr[i] = queueArr[i+1];
        }
        currentSize--;
        return queueArr;
    }
    public void display(){
        for(int i=0;i<currentSize;i++){
                System.out.print(queueArr[i]+" ");
        }
        System.out.println();
    }
}
