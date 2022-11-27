package day28abstraction;

public class Dog extends Mammal{

    @Override
    public void eat() {
        System.out.println("Dogs Eat");
    }

    @Override
    public void move() {
        System.out.println("Dogs Move");
    }
}
