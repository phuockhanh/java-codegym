import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size mảng 1 : ");
        int size1 = sc.nextInt();
        System.out.println("Nhập size mảng 2 : ");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr3 = new int[size1+size2];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = (int)(Math.random()*9+1);
        }
        int[] arr2 = new int[size2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = (int)(Math.random()*9+1);
        }
        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        int j=arr1.length;
        for(int i=0;i<arr2.length;i++){
            arr3[j] = arr2[i];
            j++;
        }
        for(int i=0;i<arr3.length;i++){
            System.out.printf("%d ",arr3[i]);
        }
    }
}
