import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Nhap so muon tim: ");
        int number = sc.nextInt();
        int center = list.length/2;
        int left =0;
        int right = list.length;
        while (number!=list[center]){
            if(number>list[center]){
                left = center+1;
                center = (left+right)/2;
            }
            if(number<list[center]){
                right = center-1;
                center = (left+right)/2;
            }
            if(number==list[center]){
                System.out.println("tim thay: "+center);
            }
            if(left-right==1 || right-left==1){
                System.out.println("ko tim thay");
            }
        }
    }
}
