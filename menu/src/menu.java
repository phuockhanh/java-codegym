import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int number;
        System.out.println("Input your number : ");
        System.out.println("1 : Vẽ Hình chữ nhật ");
        System.out.println("2 : Vẽ Tam giác ");
        System.out.println("3 : Vẽ Tam giác ngược ");
        System.out.println("4 : Vẽ Tam giác bên phải ");
        System.out.println("5 : Vẽ Tam giác bên phải bị ngược ");
        System.out.println("6 : Vẽ Tam giác cân ");
        System.out.println("7 : Exit ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while(number!=7){
            menu(number);
        }
    }
    public static void menu(int number){
        if(number==1){
            Hcn();
        }
        if(number==2){
            TamGiac();
        }
        if(number==3){
            TamGiacNguoc();
        }
        if(number==4){
            TamGiacPhai();
        }
        if(number==5){
            TamGiacPhaiNguoc();
        }
        if(number==6){
            TamGiacCan();
        }
        System.out.println("Input your number : ");
        System.out.println("1 : Vẽ Hình chữ nhật ");
        System.out.println("2 : Vẽ Tam giác ");
        System.out.println("3 : Vẽ Tam giác ngược ");
        System.out.println("4 : Vẽ Tam giác bên phải ");
        System.out.println("5 : Vẽ Tam giác bên phải bị ngược ");
        System.out.println("6 : Vẽ Tam giác cân ");
        System.out.println("7 : Exit ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if(number==7){
            System.exit(0);
        }
    }
    public static void Hcn(){
        for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void TamGiac(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void TamGiacNguoc(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=5-i+1){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
    public  static void TamGiacPhai(){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j>i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public  static void TamGiacPhaiNguoc(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>5-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void TamGiacCan(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>5-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
