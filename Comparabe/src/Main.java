import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Khanh",20,"Male");
        Student st2 = new Student("Huy",21,"Male");
        Student st3 = new Student("Duong",23,"Male");
        Student st4 = new Student("Phong",25,"Male");
        Student st5 = new Student("Tin",19,"Male");
        List<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Student st: list){
            System.out.println(st.toString());
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student st1 , Student st2){
                if(st1.getAge()>st2.getAge()){
                    return 1;
                }
                else if(st1.getAge()==st2.getAge()){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        });
        System.out.println("So sanh theo tuoi");
        for(Student st: list){
            System.out.println(st.toString());
        }
    }
}
