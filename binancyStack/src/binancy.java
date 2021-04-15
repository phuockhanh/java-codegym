import java.util.Scanner;
import java.util.Stack;

public class binancy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Stack st = new Stack<Integer>();
        while(number!=0){
            int c = number%2;
            st.push(c);
            number = number/2;
        }
        int length = st.size();
        for(int i=0;i<length;i++){
            System.out.print(st.pop()+ " ");
        }
    }
}
