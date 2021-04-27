import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {
    public static void main(String[] args){
        Country ct1 = new Country("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        Country ct2 = new Country("1.0.1.0","1.0.3.255","16777472","16778239","CN","China");
        Country ct3 = new Country("1.0.4.0","1.0.7.255","16778240","16779263","AU","Australia");
        Country ct4 = new Country("1.0.8.0","1.0.15.255","16779264","16781311","CN","China");
        Country ct5 = new Country("1.0.16.0","1.0.31.255","16781312","16785407","JP","Japan");
        List<Country> list = new ArrayList<>();
        list.add(ct1);
        list.add(ct2);
        list.add(ct3);
        list.add(ct4);
        list.add(ct5);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("country.csv");
            for(int i=0;i<list.size();i++){
                byte[] b = list.get(i).toString().getBytes();
                fos.write(b);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
