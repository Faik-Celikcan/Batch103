package CalısmaYeri;

import java.util.Scanner;

public class P3___4 {
    public static void main(String[] args) {


        /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Yukseklik belirle");

        double yukseklik=input.nextDouble();

        double sum=0;

        int counter=0;

        if(yukseklik<1){

            System.out.println("1 Kere sekti");

        } else {

            for(double i=yukseklik;i>1;i=i*0.75){

                counter++;
                sum=sum+yukseklik;

            }

        }
        System.out.println(counter+" kadar sekti "+ sum+" kadar toplam yukseklige ulasti");


    }

}
