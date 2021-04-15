import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack stack = new Stack<Character>();
        Queue queue = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] s = st.toCharArray();
        int count =0;
        for(int i=0;i<s.length;i++){
            stack.push(s[i]);
            queue.add(s[i]);
        }
        for(int i=0;i<s.length;i++){
            if(stack.peek()!= queue.peek()){
                count++;
            }
        }
        if(count==0){
            System.out.println("YES");
        }
        else{
            System.out.println(count);
            System.out.println("NO");
        }
    }
}
