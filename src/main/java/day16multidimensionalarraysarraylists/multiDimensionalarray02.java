package day16multidimensionalarraysarraylists;

public class multiDimensionalarray02 {
    public static void main(String[] args) {

        // Bir multidimensional arraydeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz.

        int arr[][]={{2,5,1,},{83,75}};

        int maxElement= arr [0][0];

        for( int [] w:arr){

            for(int k:w ){

                maxElement = Math.max(maxElement,k);

            }

        }
        System.out.println(maxElement);

    }
}
