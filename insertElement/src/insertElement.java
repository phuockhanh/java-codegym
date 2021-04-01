import java.sql.Array;
import java.util.Scanner;

public class insertElement {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size của mảng : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        createArray(arr);
        outputArray(arr);
        insertArray(12,3,arr);
    }
    public static int[] createArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*9+1);
        }
        return arr;
    }
    public static void outputArray(int[] arr){
        System.out.println("Mang sau khi chen");
        for(int i=0;i<arr.length;i++){
            System.out.printf("Arr[%d] : %d \n",i,arr[i]);
        }
    }4
    public static void insertArray(int ele,int x,int[] arr){
        int[] newarray = new int[arr.length+1];
        int j=0;
        for(int i=0;i<newarray.length;i++){
            if(i==x){
                newarray[i] = ele;
            }
            else{
                newarray[i] = arr[j];
                j++;
            }
        }
        outputArray(newarray);
    }
}
