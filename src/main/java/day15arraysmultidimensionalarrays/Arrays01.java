package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // binarySearch() Method: Bu metod'u kullanarak bir elemanin array de olup olmadigini anlariz.
        // binarySearch() Methodunu kullanmadan once mutlaka Array.sort() kullanilmalidir.
        // binarySearch() Methodu aradiginiz eleman Arrayde varsa o elemanin indexini return eder

        // binarySearch() Methodu aradiginiz eleman Arrayde yoksa "=a" seklinde bir negatif sayi alirsiniz
        // bu sayidaki "-" isaretinin anlami bu eleman arrayde yok demektir. "a" nin anlami olsaydi kacinci
        // sirada olur demektir.

        // binarySearch() Methodu tekrarlayan elemanlar icin kullanilmaz.

        int arr[]={12,31,43,14};

        int sayi= 43;

        Arrays.sort(arr); //[12,14,31,43]

        int idx1=Arrays.binarySearch(arr,sayi); // 3

        System.out.println(idx1);

        int sayi2=58;

        int sonuc =Arrays.binarySearch(arr,sayi2);

        System.out.println(sonuc); // -5



    }
}
