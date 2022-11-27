package day21accessmodifiersinheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        /*
         1) "Inheritance" sayesinde
             i) Code tekrarlarindan kurtuluruz.
            ii) Code tamiri(maintenance) kolay olur.
           iii) Child Class'lari daha atomic yapmis oluruz.

         2) Bir Class'i baska bir Class'i Child Class'i yapmak icin "extends" keyword kullanilir. Ilk yazilan Class
            Child, ikinci yazilan Class paret olur.

         3) Child Class object'leri Parent Class'dan method ve variabnle lari kullanabilirler.

         4) Parent Class object'leri Child Class'dan method ve variabnle lari kullanamazlar.

         5) Objact Class her Class'in parrent'idir. Java da Object Class haric her Class'in parrent'i vardir.
            Java'da parrent'i olmayan tek Class Object Class'dir

         6) "private"  method ve variable'lar child class'lar tarafindan kullanilamaz
            "protected"  method ve variable'lar child class'lar tarafindan kullanilabilir.
            "default"  method ve variable'lar ayni package'teki child class'lar tarafindan kullanilabilir.
            "public"  method ve variable'lar child class'lar tarafindan kullanilabilir.
            Note: child class'lar tarafinda kullanilabilir olmak inherit edilebilir demektir.

         7) 4 tip inheritance vardir.
            i) Multilevel Inheritance : Java bunu kabul eder.
           ii) Hierarchical Inheritance : Bir parent icin coklu chil, Java bunu kabul eder.
          iii) Multiple Hierarchical : Bir Child'a coklu parent, Java bunu desteklemez.(Java does not support Multiple inheritance)
           iv) Single Inheritance : Bir Child Class icin bir Parent Class demektir, Java bunu destekler.

         */

        Cat c1 = new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();

        d1.eat();
        d1.drink();
        d1.bark();


    }

}
