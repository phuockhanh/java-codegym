import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        this.size = capacity;
    }
    public void ensuare(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void ensuare(int minCapacity){
        int newSize = elements.length+minCapacity;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size == elements.length){
            ensuare();
        }
        elements[size++] = e;
    }
    public void add(int index, E e){
        if(size==elements.length){
            ensuare();
        }
        for(int i=size;i>index;i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size ++;
    }
    public E remove(int index){
        if(size==elements.length){
            ensuare();
        }
        for(int i =index;i<size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return (E) elements;
    }
    public int getSize(){
        return this.size;
    }
    public E clone(){
        Object elementClone[] = new Object[getSize()];
        for(int i =0;i<size;i++){
            elementClone[i] = elements[i];
        }
        System.out.println("Array clone : ");
        for(int i=0;i<size;i++){
            System.out.println(elementClone[i]);
        }
        return (E) elementClone;
    }
    public boolean contains(E o){
        char c2[] = o.toString().toCharArray();
        int dem=0;
        for(int i=0;i<size;i++){
            int c=0;
            char c1[] = elements[i].toString().toCharArray();
            if(c1.length>=c2.length){
                for(int j=0;j<c1.length;j++){
                    if(c1[j]==c2[0]&& j+c2.length<=c1.length){
                        for(int k=j;k<j+c2.length;k++){
                            if(c1[k]!=c2[k-j]){
                                c++;
                                break;
                            }
                        }
                        if(c==0){
                            dem=1;
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                }
            }
        }
        if(dem==1){
            return true;
        }
        else{
            return false;
        }
    }
    public int indexOf(E o){
        int count=0;
        int a=0;
        for(int i=0;i<size;i++){
            if(o==elements[i]){
                count++;
                a=i;
            }
        }
        if(count==0){
            return -1;
        }
        else{
            return a;
        }
    }
    public E get(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }
    public void clear(){
        for(int i=0;i<size;i++){
            elements[i] = null;
        }
    }
    public void display(){
        for(int i =0;i<size;i++){
            System.out.println(elements[i]);
        }
    }
}
