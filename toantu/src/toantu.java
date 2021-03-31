import java.util.Scanner;
public class toantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width : ");
        width = sc.nextFloat();
        System.out.println("Enter height : ");
        height = sc.nextFloat();
        float area = height*width;
        System.out.println("Area : " +area);
    }
}
