import java.lang.reflect.Array;
import java.util.Arrays;

public class Mylist<E> {
    public int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;
    public Mylist(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        else{
            elements[size++] = e;
        }
    }
    public E get(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }

}
