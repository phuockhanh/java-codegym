import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    List<Product> list = new ArrayList<Product>();
    public void add(Product pd){
        list.add(pd);
    }
    public void remove(double id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.remove(i);
                break;
            }
        }
    }
    public void edit(double id, Product pdedit){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.get(i).setId(pdedit.getId());
                list.get(i).setName(pdedit.getName());
                list.get(i).setPrice(pdedit.getPrice());
                break;
            }
        }
    }
    public void display(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void searchProduct(String name){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName() == name){
                System.out.println(list.get(i));
                break;
            }
        }
    }
    public void sortProduct(){
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice()>o2.getPrice()){
                    return 1;
                }
                else if(o1.getPrice()==o2.getPrice()){
                    return 0;
                }
                else {
                    return -1;
                }
            }
        });
    }
}
