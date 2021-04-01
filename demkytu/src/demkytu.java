import java.util.Scanner;

public class demkytu {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm : ");
        name = sc.nextLine();
        char[] arr = name.toCharArray();
        System.out.println("Nhập ký tự cần tìm : ");
        char search = sc.next().charAt(0);
        System.out.println(search);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(search == arr[i]){
                count ++;
            }
        }
        System.out.println(count);
    }
}
