public class test {
    public static void main(String[] args) {
        MyLinkedList llist = new MyLinkedList(10);
        llist.add(1,4);
        llist.add(2,6);
        llist.add(2,8);
        llist.add(2,10);
        llist.remove(1);
        llist.removeFirst();
        llist.printList();
    }
}
