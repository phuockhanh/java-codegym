public class test {
    public static void main(String[] args) {
        MyLinkedList llist = new MyLinkedList(10);
        llist.add(1,4);
        llist.add(2,6);
        llist.add(2,8);
        llist.add(2,10);
        llist.remove(1);
        llist.removeFirst();
        llist.addLast(24);
        llist.remove(24,4);
        llist.printList();
//        System.out.println("-----------");
//        llist.clone().printList();
//        System.out.println(llist.indexOf(8));
//        System.out.println(llist.contains(12));
//        System.out.println(llist.getLast());
//        llist.clear();
//        llist.printList();
    }
}
