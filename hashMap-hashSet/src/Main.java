import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student st1= new Student("Khanh",20,"Male");
        Student st2= new Student("Duong",21,"Male");
        Student st3= new Student("Han",22,"Female");
        Student st4= new Student("Phong",23,"Male");
        Student st5= new Student("Huy",24,"Male");
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);
        map.put(4,st4);
        map.put(5,st5);
        for (Map.Entry<Integer,Student> entry:
             map.entrySet()) {
            System.out.println(entry.toString());
        }
        System.out.println("====================");
        Set<Student> map2 = new HashSet<>();
        map2.add(st1);
        map2.add(st2);
        map2.add(st3);
        map2.add(st4);
        map2.add(st5);
        for (Student student:
             map2) {
            System.out.println(student.toString());
        }
    }
}
