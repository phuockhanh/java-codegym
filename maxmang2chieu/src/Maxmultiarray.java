import java.util.Scanner;

public class Maxmultiarray {
    public static void main(String[] args) {
        int size ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size mảng 2 chiều : ");
        size = sc.nextInt();
        int[][] arr = new int[size][];
        createArr(size,arr);
        outputArr(arr);
        maxArr(arr);
    }
    public static int[][] createArr(int size,int[][] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[(int)(Math.random()*(size-2)+2)];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random()*9+1);
            }
        }
        return arr;
    }
    public static void outputArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.printf("%d  ",arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void maxArr(int[][] arr){
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max==arr[i][j]){
                    System.out.printf("\n Max : %d o vi tri [%d][%d]",max, i, j);
                }
            }
        }
    }
}
