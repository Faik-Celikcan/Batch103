package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
        1) Java variable larin orjinal degerlerini korumak ister
        2) Variable methotlar icinde kullanildiginda, Java methodun icine orginal degeri koymaz, o degerin kopyasini
        uretir ve methoda o kopyayi yollar, Method kopya ustunde degisiklik yapar dolayisiyla variable in orginal degeri
        korunmus olur. Bu sisteme "Pass By Value " denir.

        Note: Java "Pass By Value " kullanir. "Pass By Reference " kullanmaz.
        Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir. Bu isi developerlere birakmistir.
        Bu tarz diller "Pass By Reference " kullanir

     */

    public static void main(String[] args) {

        int x= 5;

        // static method olan "main method" un icindeki hersey static olmalidir

         change(x); // kopyasinin 3 kati = 15

        System.out.println(x); // 5

        int ucret = 100;

        int kopya=indirim(ucret);

        System.out.println(ucret); // 100 orjinal degismez
        System.out.println(kopya); // 90


    }
    public static void change (int a){
        System.out.println(a*3);

    }
    // void disindaki return typ lerde method body'si icinde "return" keyword kullanilmalidir
    public static int indirim(int gomlekUcreti){

        return gomlekUcreti - 10;


    }

}
