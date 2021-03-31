import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a : ");
        a = sc.nextFloat();
        System.out.println("Input b : ");
        b = sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Pt vô số nghiệm");
            }
            else{
                System.out.println("Pt vô nghiệm");
            }

        }
        else{
            float x = -b/a;
            System.out.println("Pt có nghiệm là : "+x);
        }
    }
}
