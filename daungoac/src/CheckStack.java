import java.util.Scanner;
import java.util.Stack;

public class CheckStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        int count=0;
        int count1=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='('){
                for(int j=i+1;j<c.length;j++){
                    if(c[j]!=' ' && c[j]!=')'){
                        count1++;
                        break;
                    }
                }
                if(count1==0){
                    count++;
                    break;
                }
                stack.push(c[i]);
            }
            if(c[i]==')'){
                if(stack.size()==0){
                    count++;
                    break;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.size()==0&&count==0){
            System.out.println("Well");
        }
        else{
            System.out.println("????????");
        }
    }
}
