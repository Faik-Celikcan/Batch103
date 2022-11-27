package day20stringbuilderstringbuffer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: Tom,Ali'den 3 yil 8 ay 13 gün sonra dogdu. Ali ise Veli'den 1 yil 15 gun once dogdu.
        //           Tom'undogum tarihi 18 Kasim 2011 ise Veli ve Ali'nin dogum tarilerini bulunuz.


        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER,18);

        LocalDate dobAli=dobTom.minusYears(3).minusMonths(8).minusDays(13);

        LocalDate dobVeli = dobAli.plusYears(1).plusDays(15);

        System.out.println("Ali: "+ dobAli);
        System.out.println("Veli: "+ dobVeli);
    }
}
