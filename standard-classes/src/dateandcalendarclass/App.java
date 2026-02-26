package dateandcalendarclass;

import java.util.Calendar;
import java.util.Date;

public class App {

    static void main() {

        /**
         * Date & Calendar Class
         *
         * Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class Date & Calendar yang bisa kita gunakan sebagai representasi tanggal
         * Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yang baru menggunakan Java Date Time API, namun itu akan kita bahas di course terpisah
         * Sekarang kita akan fokus menggunakan class Date dan Calendar
         *
         */

        /**
         * Hubungan Date dan Calendar
         *
         * Class Date adalah class representasi tanggal sampai presisi milisecond
         * Namun di class Date banyak method-method yang di deprecated, sehingga untuk memanipulasi date tanggal, kita sekarang harus melakukan kombinasi antara class Date dan Calendar
         * Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal
         *
         */
        Date date = new Date();
        Date dateWithMiliseconds = new Date(23587200000L);

        System.out.println(date);
        System.out.println(dateWithMiliseconds);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date dateFromCalendarClass = calendar.getTime();
        System.out.println(dateFromCalendarClass.getTime());
    }

}
