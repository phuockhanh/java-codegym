import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void testmap(Map<Integer,String> test){
        test.put(1,"Khanh");
        test.put(2,"Duong");
        test.put(3,"Phong");
        test.put(5,"Huy");
        test.put(4,"Tin");
        for (Map.Entry<Integer,String> entry:
             test.entrySet()) {
            System.out.println(entry.getKey() + "-------" +entry.getValue());
        }
        System.out.println("=============================");
    }
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        System.out.println("hashMap: ");
        testmap(hashMap);
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(4,0.75f);
        System.out.println("linkedhashmap: ");
        testmap(linkedHashMap);
        Map<Integer,String> treeMap = new TreeMap<>();
        System.out.println("TreeMap: ");
        testmap(treeMap);
    }
}
