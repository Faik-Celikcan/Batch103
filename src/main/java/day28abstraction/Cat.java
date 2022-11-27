package day28abstraction;

public class Cat extends Mammal{


    @Override
    public void eat() {
        System.out.println("Cats Eat");
    }

    @Override
    public void move() {
        System.out.println("Cats Move");

    }
}
