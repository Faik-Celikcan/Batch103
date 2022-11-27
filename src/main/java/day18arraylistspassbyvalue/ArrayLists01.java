package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {
        // Example 1: Bir integer Arraylistteki 7 Haric tum elemanlari 2 artiriniz.

        List<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for(Integer w:ages){

            if(w==7){
                continue;

            }
            //w=w+2 ==> Listler boyle update edilemezler.
            ages.set(ages.indexOf(w), w+2);

        }
        System.out.println(ages);

        // Example 2 : Size verilern ArrayListte 8 (inclusive) ve 8 den onceki tume elemanlari 2 katina cikariniz



        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w: nums){

            if(w==8){
                break;

            }
            nums.set(nums.indexOf(w),w*2);
        }
        System.out.println(nums);












    }
}
