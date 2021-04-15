public class Solution {
    public Node front;
    public Node rear;
    public Solution(){
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int data){
        Node temp = new Node(data);
        if(this.rear == null){
            this.front = this.rear = temp;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    public void deQueue(){
        Node temp = front;
        front = null;
        front = temp.next;
    }
    public void displayQueue(){
        Node temp = front;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.enQueue(10);
        sl.enQueue(5);
        sl.enQueue(15);
        sl.enQueue(25);
        sl.enQueue(30);
        sl.deQueue();
        sl.deQueue();
        sl.displayQueue();
    }
}
