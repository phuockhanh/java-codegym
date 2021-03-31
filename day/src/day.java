import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input month : ");
        int month = sc.nextInt();
        switch (month){
            case 2:
                System.out.println("The month 2 has 28 or 29 days");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("The month has 31 days");
                break;
            case 4,6,9,11 :
                System.out.println("The month has 30 day");
                break;
        }
    }
}
