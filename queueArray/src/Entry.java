public class Entry {
    public static void main(String[] args) {
        MyQueue mqe = new MyQueue(10);
        mqe.enqueue(5);
        mqe.enqueue(10);
        mqe.enqueue(15);
        mqe.enqueue(20);
        mqe.enqueue(25);
        mqe.enqueue(30);
        mqe.enqueue(35);
        mqe.enqueue(40);
        mqe.enqueue(45);
//        mqe.enqueue(50);
//        mqe.enqueue(55);
        mqe.display();
        System.out.println("================");
        mqe.dequeue();
//        mqe.dequeue();
        mqe.display();
    }
}
