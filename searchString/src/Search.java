import java.util.Scanner;

public class Search {
    public static void searchString(String str){
        char[] ch = str.toCharArray();
        int[] numberCount = new int[ch.length];
        String[] str2 = new String[ch.length];
        int max =0;
        for(int i=0;i<ch.length-1;i++){
            str2[i]="";
            str2[i]+=ch[i];
            int count = 1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[j]>ch[i]){
                    str2[i] += ch[j];
                    count++;
                }
                else{
                    break;
                }
            }
            if(max<count){
                max = count;
            }
            numberCount[i] = count;
        }
        for(int i=0;i<numberCount.length;i++){
            if(max == numberCount[i]){
                System.out.println(str2[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        searchString(str);
    }
}
