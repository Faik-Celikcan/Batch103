package CalısmaYeri;

import java.util.ArrayList;
import java.util.List;

public class P4___4 {
// yapildi ama bu neden olmuyor
    public static void main(String[] args) {

        /*
     * İki Array'de ortak bulunan elementleri yazdırınız.
     * (case sensitivity olmadan)

     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

     * Output : [brad,sofia,emily]
     */


//        String arr[]={"John","Brad","Angel","Sofia","Emily"};
//        String brr[]={"sofia","brad","grace","emily","hazel"};

        List<String> list = new ArrayList<>();

        list.add("John");
        list.add("Brad");
        list.add("Angel");
        list.add("Sofia");
        list.add("Emily");

        List<String> list2 = new ArrayList<>();

        list2.add("sofia");
        list2.add("brad");
        list2.add("grace");
        list2.add("emily");
        list2.add("hazel");


        for(int i=0;i< list.size();i++){

            for(int k=0;k<list2.size();k++){


                if(list.get(i).equalsIgnoreCase(list2.get(k))){

                    System.out.println(list.get(i)+" ");
                }

            }

        }

    }
}
