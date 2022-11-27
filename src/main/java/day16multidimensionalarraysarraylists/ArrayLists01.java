package day16multidimensionalarraysarraylists;
import java.util.List;
import java.util.ArrayList;
public class ArrayLists01 {

        /*
        ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.

        Array ile ArrayList'in farki nedir?
            1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
              Array'ler eleman sayisinda "fixed" dirler.
              ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
            2)Array'lerin icine "primitive" ve "reference" lar konabilir.
              ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
            3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
                  eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin
     */
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol:
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol:
        List<Integer> nums = new ArrayList<>();


        //ArrayList'ler nasil yazdirilir?
        System.out.println(nums);// []

        //ArrayList'lere nasil eleman eklenir?
        //add() her zaman elemani en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);// [21, 18, 20]

        nums.add(1, 50);
        System.out.println(nums);// [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);// [21, 50, 18, 20, 23, 185]
        System.out.println(prices);// [23, 185]

        nums.addAll(2, prices);
        System.out.println(nums);// [21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayisi nasil bulunur?

        int elemanSayisi = nums.size();

        System.out.println(elemanSayisi);//8

        //ArrayListlerde herhangi bir eleman nasil secilir?

        //get() methodu istenen bir indexteki elemani verir.

        int el1=nums.get(3);

        System.out.println(el1); //185

        //ArrayListin bos olup olmadigini nasil anlariz?

        boolean bos1=nums.isEmpty();

        System.out.println(bos1);


        boolean bos2=ages.isEmpty();

        System.out.println(bos2);

        // ArrayListde bir eleman nasil degistirilir?

        nums.set(3,200);

        System.out.println(nums);

        //Example 1: nums ArrayListindeki tum tek sayilari 11 artirdiktan sonra ekranan yaziniz.

        for (int w : nums){

            if (w%2!=0){

                nums.set(nums.indexOf(w),w+11);

            }

        }
        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]

        // remove metodunun icine tam sayi koyarsaniz java onu index olarak kabul eder.

        // Example 2: ArrayList den 34 elemanininin ilk gorunumunu siliniz
        // Note 1: Tum tam sayilar Java icin aksi soylenmedikce primitivedir yani "int" dir
        // Note 2: Primitiveler ArrayListlerin elemani olamazlar.
        // Note 3: Primitiveler i Wrapper Classa Cevirirseniz, non primitive ler ArrayListlerin elemani olur, index olamaz

        Integer sayi=34;

        nums.remove(sayi);

        System.out.println(nums);

    }
}
