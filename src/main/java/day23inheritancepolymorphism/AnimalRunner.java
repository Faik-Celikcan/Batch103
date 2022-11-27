package day23inheritancepolymorphism;

public class AnimalRunner {

    public static final int age = 12; // finallere deger atamak zorunludur int age diye birakilmaz hata verir.
    public static void main(String[] args) {

         Cat cat=new Cat();

         cat.eat();

         //age++; hata verir final methodundan dolayi
    }
}
