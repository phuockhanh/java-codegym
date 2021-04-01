public class snt {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if(checkNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkNumber(int i){
        int dem=0;
        for(int j=2;j<i-1;j++){
            if(i%j==0){
                dem++;
                break;
            }
        }
        if(dem==0){
            return true;
        }
        else{
            return false;
        }
    }
}
