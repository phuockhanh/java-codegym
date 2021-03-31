import java.util.Scanner;

public class changeNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println("Input your number,max : 999,min : 0");
        int a,b,c;
        a = number/100;
        b = (number - a*100)/10;
        c = number - a*100 - b*10;
        String arr[] = {"","one","two","three","four","five","six","seven","eight","nine"};
            String firstText="";
            String middleText = "";
            String lastText ="";
            for(int i=0;i<arr.length;i++){
                if(a==i && a!=0){
                    firstText = arr[i]+" hundred";
                }
                if(b == i && b != 0 && a!=0){
                    middleText  = arr[i]+"ty";
                }
                if(c==i){
                    lastText = arr[i];
                }
            }
            if(a==0 && b==1){
                System.out.println((lastText+"teen"));
            }
            else{
                System.out.println(firstText+" "+middleText+" "+lastText);
            }
    }
}

