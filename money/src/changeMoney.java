import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        double usd ;
        double rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input USD");
        usd = sc.nextDouble();
        System.out.println(usd +" USD = "+(usd)*rate);
    }
}
