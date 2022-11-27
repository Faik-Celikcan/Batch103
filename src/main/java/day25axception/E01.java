package day25axception;

public class E01 {

    /*1)"Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
      2) Exception lar ile calismanin iki yolu vardir
            a) try-catch block kullanma ve exception olussa bile calısmayı devam ettirme
            b) throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamız
            gerekiyor ise bu dosyamız eger silinmis ise java dosyayi bulamaz ve uygulanın devam etmesi gerekmez)
      3) Eger exception'ı handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
      4) try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
      5) try catch olmaksizin yanliz kullanilamaz.
      6) Eger yazmis oldugunuz harhangi bir kod satirinda  problem olabiliecegini dusunuyorsaniz  try-catch block iciene koymalisiniz
      7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
      8) e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
         System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
         e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder
         System.err.println("burasi renkli"); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz
      9)Eger try body icindeki kod sorunusuz calisirsa catch blok devreye girmez



    * */


    public static void main(String[] args) {

//        divide(6,2); //3
//        divide(0,2); //0
//        divide(6,0); // Hata verir. Matematikte bir sayi 0 ile bolunmez.

        divide2(5,0);
    }
    //1. Yol Tavsiye edilmez.
    public static void divide(int a,int b){

        if(b==0){

            System.out.println("Bir Sayi sifir ile bolunemez");

        }else {

            System.out.println(a/b);
        }


    }

    // 2. Yol try-catch kullanarak exception i handle etmek tavsiye edilir.
    public static void divide2(int a ,int b ){

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Bolme islminde bir problem olustu"+ e.getMessage());
        }
        // java matematik ile ilgili karsilasilmasi muhtemek tum istisnalari hatalari ArithmeticException classinda koymustur.
        // Matematikteki tum istisnalari detaylari bilmek zorunda degiliz.


    }
}
