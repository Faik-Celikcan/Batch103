package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println(names); // [Tom,Thomas,Tahsin,Trump,Taceddin]

        List<String> cities = new ArrayList<>();

        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities); // removeAll() kullandiginizda sadede ilk list degisir, parantezin icindeki list degismez

        System.out.println(names); // [Thomas, Tahsin]

        List<String> myNames = new ArrayList<>();


        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames); // Bir listin icindeki coklu elemanlarin var olup olmadigini kontrol eder.
                                                     // Hepsi varsa true, en az biri yoksa false verir.
        System.out.println(sonuc1); // true

        //        myNames.add("Thomas");
        //        myNames.add("Tahsineeeee"); false



        // Example 1 = "a" listinde "Shoes" elemanin ilk gorunumunu siliniz.




        List<String> a = new ArrayList<>();

        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        a.remove("Shoes");
        System.out.println(a);

        // Example 2 = "a" listinde "Shoes" elemanin tum gorunumunu siliniz.

        List<String> silinecekler = new ArrayList<>();

        silinecekler.add("Shoes");

        a.removeAll(silinecekler);

        System.out.println(a);

        // Example 3 = Bir tane salary listi olusturun, eger salary 1000 den az ise %20 10000 den cok ise %10 zam yapiniz

        List<Double> salary = new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        // [12345.0, 8674.5, 15000.75, 9500.0, 20500.0]

        System.out.println(salary);
        for(Double w:salary){

            if(w<10000){

              salary.set(salary.indexOf(w),w*1.2);

            }else{

                salary.set(salary.indexOf(w),(w*1.1));

            }

        }

        System.out.println(salary);

        // Example 4: Iki ArrayListin estit olup olmadigini kontrol eden kodu yaziniz.

        //Note : iki arraysListin esit olabilmesi icin elemanlar esit olmali ve ayni elemanlar ayni indexte olmali.


        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        //m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Way:

        int counter=0;

        for(int i=0;i<m.size();i++){

            if(m.size()!= n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;

            }else if(m.get(i) != n.get(i)) {

               counter++;

               System.out.println("Listler esit degildir");

               break;

           }
        }
        if(counter==0){

            System.out.println("Listler Esittir");
        }


        // 2.Way:
        boolean esitmi=m.equals(n);

        if(esitmi){

            System.out.println("Listler esittir");

        }else{

            System.out.println("Listler esit degildir");
        }

















    }
}
