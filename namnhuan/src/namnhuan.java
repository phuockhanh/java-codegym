import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        int year ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Year : ");
        year = sc.nextInt();
        if(year%4 ==0 && year%100!=0 || year%400 ==0){
            System.out.println(year + " la nam nhuan");
        }
        else{
            System.out.println(year + " Khong phai la nam nhuan");
        }
    }
}
