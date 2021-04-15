import java.util.LinkedList;

public class MyGenericStack<E> {
    public LinkedList<E> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(E e){
        stack.addFirst(e);
    }
    public E pop(){
        stack.removeFirst();
        return (E) stack;
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return false;
        }
        else{
            return true;
        }
    }
}
