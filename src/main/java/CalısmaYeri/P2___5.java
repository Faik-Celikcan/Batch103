package CalısmaYeri;

import java.util.*;

public class P2___5 {
    /*
         Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
         Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
         */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Gireceginiz Sayi Miktarini Giriniz");

            int girilecekSayi= input.nextInt();

            int arr[]=new int[girilecekSayi];

            System.out.println(girilecekSayi+" Tane Sayi giriniz");


            for(int i=0;i<girilecekSayi;i++){

                arr[i]=input.nextInt();

            }
            System.out.println("Indexini Gir");

            int index= input.nextInt();

            List<Integer> seko= new ArrayList<>();

            for(Integer w: arr){

                seko.add(w);

            }

            seko.remove(index);

            System.out.println(seko);
        }
}



