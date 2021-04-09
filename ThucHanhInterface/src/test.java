public class test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for(int i=0; i < animal.length;i++){
            System.out.println(animal[i].makeSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for(int i =0; i < fruits.length;i++){
            System.out.println(fruits[i].howtoEat());
        }
    }
}
