package day25axception;

public class E03 {

    public static void main(String[] args) {

        String str="Ali";

        getNumOfChars(str);//3

        String  s = "";
        getNumOfChars(s);//0

        String t = null;

        getNumOfChars(t);////NullPointerException
        //eger length() methodunda null kullanırsanız bu exception ı alirsiniz

    }
    public static void getNumOfChars(String str){

        try {
            System.out.println(str.length());

        }catch (NullPointerException e){

            System.err.println("Nullin Lenght i Olmaz");

        }


    }
}
