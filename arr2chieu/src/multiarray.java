import java.util.Scanner;

public class multiarray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size cua mang : ");
        size = sc.nextInt();
        int[][] arr = new int[size][];
        createArrays(size,arr);
        outputArrays(arr);
        System.out.println("Nhap vi tri col tinh tong cua mang : ");
        int x = sc.nextInt();
        System.out.printf("\nSum : %d",sumCol(x,arr));
    }
    public static void createArrays(int size,int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int)(Math.random() * size + 1)];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random()*9+1);
            }
        }
    }
    public static void outputArrays(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf(" %d ",arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int sumCol(int x,int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(j==x){
                  sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}