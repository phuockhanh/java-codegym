public class TwentySnt {
    public static void main(String[] args) {
        int i=2,count=0;
        while(i>=2){
            int j=2;
            if(i==2 || i==3){
                count++;
                System.out.println(i);
            }
            while (j<=i-1){
                if(i%j==0){
                    break;
                }
                j++;
                if(j==(i-1)){
                    System.out.println(i);
                    count++;
                }
            }
            if(count==20){
                break;
            }
            i++;
        }
    }
}
