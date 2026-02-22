package numberclass;

import static java.lang.Integer.parseInt;

public class App {

    static void main() {

        /**
         * Number Class
         *
         * Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
         * Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
         * Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya
         *
         */

        /**
         * Method di Number Class
         *
         * byte byteValue() Mengubah menjadi tipe byte
         * double doubleValue() Mengubah menjadi tipe double
         * float floatValue() Mengubah menjadi tipe float
         * int intValue() Mengubah menjadi tipe int
         * long longValue() Mengubah menjadi tipe long
         * short shortValue() Mengubah menjadi tipe short
         *
         */

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);

        /**
         * Konversi String ke Number
         *
         * Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number
         * parseXxx(String) digunakan untuk mengkonversi string ke tipe data number primitif
         * valueOf(String) digunakan untuk mengkonversi dari string ke tipe data number non primitif
         * Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi string ke number
         *
         */

        String sample = "1000";
        Integer sampleInt = Integer.valueOf(sample);
        int sampleIntPrimitif = parseInt(sample);

        System.out.println(sampleInt);
        System.out.println(sampleIntPrimitif);
    }

}
