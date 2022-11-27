package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*
        Method Overloading nasil yapilir?
        1) Method isimleri farkli olmalidir
        2) Method parametreleri farkli olmalidir.
             i)Parametre sayilari degistirilebilir
            ii)Parmetrelerin data tiplerini degistirebilirsiniz.
           iii)Parametre yerleriniz degistirebilirisiniz ancak
               data tipleri farkli ise.
        3) Method ismi + Parametreler = Method Signature
        Method Signature disinda ne degistirirseniz degistirin java o methodlari farkli kabul etmez.
     */

    public static void main(String[] args) {

        add(3,5); // en iyi 1 oldugu icin bu calisir
        add(3,5.0); // en iyi 3 oldugu icin bu calisir
        //  add(3.0,4.0); hata verir



        String s = "Ali" ;

    }
    public static void add(int a,int b){

        System.out.println(a+b); // 1

    }
    public static void add(int a,int b,int c){

        System.out.println(a+b+c); // 2

    }
    public static void add(int a,double b) {

        System.out.println(a + b); // 3
    }
    public static void add(double a,int b) {

        System.out.println(a + b); // 4
    }




}
