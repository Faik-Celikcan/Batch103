package day27exceptions;

public class Exceptions03 {

    public static void main(String[] args) throws IlegalGradeException {
        printGrades(60);

        checkNameFormat("Ali");

    }

    //Ogrenci notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IlegalGradeException {
        if(grade<0 || grade>100){
            throw new IlegalGradeException("Grade 0 dan az 100 den cok olamaz");
        }else{
            System.out.println(grade);
        }
    }

    // Verilen ismin ilk harfinin buyuk harf olmamasi Exception atan method yaziniz.
    public static boolean checkNameFormat(String name){

        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;

        }else {
            throw new IllegalNameException("Isimler Buyuk Harfle Baslamalidir");
        }

    }
}
