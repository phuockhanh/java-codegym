import java.util.Scanner;
import java.util.Stack;

public class reverse {
    Scanner sc = new Scanner(System.in);
    public void revereseInt(){
        Stack st = new Stack<Integer>();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = (int) (Math.random()*10+1);
            st.push(arr[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            arr[i] =(int) st.pop();
            System.out.print(arr[i]+" ");
        }
    }
    public void reverseString(){
        Stack str = new Stack<String>();
        System.out.println("Nhap chuoi: ");
        String m = sc.nextLine();
        char[] c = m.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
            str.push(c[i]);
        }
        System.out.println();
        for(int i=0;i<c.length;i++){
            c[i] = (Character) str.pop();
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        reverse rv = new reverse();
        rv.revereseInt();
        rv.reverseString();
    }
}
