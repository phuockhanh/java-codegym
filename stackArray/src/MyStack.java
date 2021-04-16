import java.util.Arrays;

public class MyStack<E> {
    public E[] arr;
    public int size=0;
    public static final int DEFAULT_CAPACITY = 10;
    public MyStack(){
        arr = (E[])new Object[DEFAULT_CAPACITY];
    }
    public void cansuCapa(){
        int newSize = arr.length*2;
        arr = Arrays.copyOf(arr,newSize);
    }
    public void push(E e){
        if(size==arr.length){
            cansuCapa();
        }
        arr[size] = e;
        size++;
    }
    public E pop(){
        if(isEmpty()){
            System.out.println("Found");
            return (E) arr;
        }
        else{
            E index = arr[arr.length-1];
            arr[arr.length-1] = null;
            size--;
            return index;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
