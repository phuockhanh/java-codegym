import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis =null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("from.txt");
            fos = new FileOutputStream("to.txt");
            int code;
            while ((code = fis.read())!=-1){
                fos.write(code);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
