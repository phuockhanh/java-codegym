import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Size của mảng : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Nhập pt thứ %d của mảng : ",i);
            arr[i] = sc.nextInt();
        }
        OutputArr(arr);
        deleteArr(3,arr);
    }
    public static void OutputArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.printf("Pt thứ %d của mảng là : %d\n",i,arr[i]);
        }
    }
    public static void deleteArr(int x,int[] arr){
        System.out.println("Mảng sau khi xóa : ");
        for(int i=x;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.printf("PT thứ %d là %d\n",i,arr[i]);
        }
    }
}
