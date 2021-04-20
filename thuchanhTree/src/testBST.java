public class testBST {
    public static void main(String[] args) {
        BTS<String> tree = new BTS<String>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.innorder();
        System.out.println("The number of nodes is: " + tree.size());
    }
}
