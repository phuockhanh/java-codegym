public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Cluck-cluck";
    }
    @Override
    public String howtoEat(){
        return "could be fried";
    }
}
