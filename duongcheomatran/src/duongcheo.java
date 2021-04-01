import java.util.Scanner;

public class duongcheo {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size của ma trận vuông : ");
        size = sc.nextInt();
        int[][] arr = new int[size][size];
        createArr(arr);
        outputArr(arr);
        System.out.println("Sum : "+tongDuongCheo(arr));
    }
    public static int[][] createArr(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (int) (Math.random()*9+1);
            }
        }
        return arr;
    }
    public static void outputArr(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf(" %d  ",arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int tongDuongCheo(int[][] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
