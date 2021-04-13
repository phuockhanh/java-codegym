public class test {
    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<Integer>();
        ml.add(3);
        ml.add(46);
        ml.add(9);
        ml.add(7);
        ml.add(2,10);
        ml.add(3,15);
        ml.add(4,20);
        ml.display();
        System.out.println("-------------------");
        ml.display();
//        ml.clone();
        System.out.println(ml.contains(15));
        System.out.println(ml.indexOf(20));
        System.out.println(ml.get(2));
        ml.clear();
        ml.display();
    }
}
