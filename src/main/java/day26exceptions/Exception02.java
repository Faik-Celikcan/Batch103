package day26exceptions;

public class Exception02 {

    public static void main(String[] args) {

        char ch1=getCharFromString("Java",2);//v

        System.out.println(ch1);

        char ch2=getCharFromString("Selenium",8);//StringIndexOutOfBoundsException

        System.out.println(ch2);//StringIndexOutOfBoundsException: Eger bir Stringden characterler alirken olmayan bir
                                //index kullanilirsa StringIndexOutOfBoundsException alinir.
    }

    public static char getCharFromString(String str,int idx) {

        char c = ' ';

        try {

            c = str.charAt(idx);

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Index ile ilgili bir problem olustu ==> " + e.getMessage());

            e.printStackTrace();// detayli "log" icin genelde developerler kullanir.
        }
        return c;
    }
}
