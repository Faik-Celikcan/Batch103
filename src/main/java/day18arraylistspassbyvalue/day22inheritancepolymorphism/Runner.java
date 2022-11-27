package day18arraylistspassbyvalue.day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //Inheritance'da "variable'lar secilirken Java object'in data type'ina bakar."
        //Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.
        //O Class'da bulamamzsa Parent Class'lara bakar.
        //Hicbir Parent Class'da bulamazsa hata verir

        Cat cat1= new Cat();

        System.out.println(cat1.a);// 14

        System.out.println(cat1.b);//34

        System.out.println(cat1.c);//45

        cat1.eat();//Cat Eat

        Mammal cat2 = new Cat();

        System.out.println(cat2.a);// 13

        cat2.eat();//Cat Eat

        Animal cat3 = new Cat();

        System.out.println(cat3.a);// 12

        cat3.eat();//Cat Eat

        //Object olustururken Object'in data type'i Child Class'lardan secilemez
        //Inheritance'da "method'lar secilirken Java Constructor'a bakar"
        //Oncelikle, istediginiz method'u Constructori kullanilan Class'dan alir.
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir yerde o method'u bulamazsa hata verir.


        Cat cat4 = new Cat();

        cat4.drink();// Mammal drink

        cat4.eat();//Cat Eat

        Mammal cat5= new Mammal();// Cat cat4 =new Mammal() seklinde olamaz

        cat5.eat();//Mammal Eat

        Animal  cat6=new Animal();

        cat6.eat();//Animal Eat







    }
}
