import java.util.Scanner;

public class Search {
    public static int search(int[] arr, int l, int r, int number){
        while (r>=l){
            if(number>arr[(l+r)/2]){
                return search(arr,(l+r)/2+1,r,number);
            }
            else if(number<arr[(l+r)/2]){
                return search(arr,l,(l+r)/2-1,number);
            }
            else{
                return (l+r)/2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(search(list,0,list.length-1,number));
    }
}
