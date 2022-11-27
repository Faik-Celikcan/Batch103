package day28abstraction;

public abstract class Animal {

    //body'si olmayan method'lar "abstract method" olarak adlandırılır.
    //Bir method'u abstract yapmak için; i)Method body'i sil  ii)"abstract" keyword kullan
    //"abstract methdod"lar "abstract class" içinde olmalıdır

    public abstract void eat();

    //"abstract class" larda hem "abstract" hem de "concrete"(non-abstract) method
    public void drink(){
        System.out.println("Animal Drink");
    }

    public abstract void move();




}

