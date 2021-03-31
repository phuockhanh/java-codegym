import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        float height;
        float weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your weight : kg ");
        weight = sc.nextFloat();
        System.out.println("Input your height : meter ");
        height = sc.nextFloat();
        double bmi = weight/(Math.pow(height,2));
        if(bmi<18.5){
            System.out.println("Interpretation");

        }
        else if(bmi<25 && bmi>=18.5){
            System.out.println("UnderWeight");
        }
        else if(bmi<30 && bmi>=25){
            System.out.println("Normal");
        }
        else if(bmi>=30){
            System.out.println("Obese");
        }
    }
}
