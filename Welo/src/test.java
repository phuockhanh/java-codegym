import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count;
        int max =0;
        String str2="" ;
        String str1 = "";
        for(int i=0;i<ch.length-1;i++){
            str2 += ch[i];
            char s = ch[i];
            count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[j]>s){
                    str2+=ch[j];
                    s = ch[j];
                    count++;
                }
            }
            if(max<count){
                str1 = str2;
                max =count;
            }
        }
        System.out.println(str1);
    }
}
