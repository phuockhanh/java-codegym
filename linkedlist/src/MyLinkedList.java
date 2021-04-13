import java.awt.desktop.OpenFilesEvent;

public class MyLinkedList {
    private Node head;
    private int numNodes=0;
    public MyLinkedList(Object data){
        head = new Node(data);
        numNodes++;
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public boolean addLast(Object data){
        Node temp = head;
        for(int i=0; i<numNodes-1;i++){
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.next = null;
        numNodes++;
        return true;
    }
    public Object get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public void remove(int index){
        Node temp = head;
        Node deleteIndex;
        for(int i=0 ; i<index-1; i++){
            temp = temp.next;
        }
        deleteIndex = temp.next;
        temp.next = temp.next.next;
        deleteIndex = null;
        numNodes--;
    }
    public void removeFirst(){
        Node temp = head;
        head = temp.next;
        temp = null;
        numNodes--;
    }
    public void remove(Object data,Object data2){
        Node temp = head;
        Node deleteNode;
        for(int i=0;i<numNodes;i++){
            if(head.data == data){
                removeFirst();
                break;
            }
            if(temp.next.data == data){
                break;
            }
            temp = temp.next;
        }
        deleteNode = temp.next;
        temp.next = temp.next.next;
        deleteNode = null;
        numNodes--;
    }
    public int getSize(){
        return numNodes;
    }
    public MyLinkedList clone(){
        MyLinkedList listClone = new MyLinkedList(this.head);
        Node temp = head;
        System.out.println("+++ Clone +++");
        System.out.println("num:" + numNodes);
        for(int i=0;i<numNodes;i++){
            listClone.addLast(temp.data);
            temp = temp.next;
        }
        return listClone;
    }
    public boolean contains(Object data){
        Node temp = head;
        int count =0;
        for(int i=0;i<numNodes;i++){
            if(temp.data==data){
                count ++;
            }
            temp = temp.next;
        }
        if(count ==0){
            return false;
        }
        else{
            return true;
        }
    }
    public int indexOf(Object data){
        Node temp = head;
        int a=-1;
        for(int i=0;i<numNodes;i++){
            if(temp.data == data){
                a=i;
                break;
            }
            temp = temp.next;
        }
        return a;
    }
    public Object getFirst(){
        return head.data;
    }
    public Object getLast(){
        Node temp = head;
        for(int i=0;i<numNodes-1;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public void clear(){
        Node temp = head;
        for(int i=0;i<numNodes;i++){
            temp.data = null;
            temp = temp.next;
        }
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
