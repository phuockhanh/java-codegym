import java.util.Comparator;

public class Student{
    public String name;
    public String gender;
    public int age;
    public Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
