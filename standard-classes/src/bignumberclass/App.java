package bignumberclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class App {

    static void main() {

        /**
         * Big Number
         *
         * Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas Long dan Double, di Java sudah disediakan class untuk handle data besar tersebut
         * BigInteger adalah class untuk handle tipe data Integer, dan
         * BigDecimal adalah class untuk handle tipe data floating point
         *
         */

        /**
         * Method di BigInteger & BigDecimal
         *
         * add +
         * substract -
         * multiply *
         * divide /
         * mod %
         * ...dan masih banyak lagi
         *
         */

        BigInteger a = new BigInteger("10000000000000");
        BigInteger b = new BigInteger("1000000000000000000");

        BigInteger c = a.add(b);

        System.out.println(c);

        BigDecimal d = new BigDecimal("10000000000000.5");
        BigDecimal e = new BigDecimal("1000000000000000000.2");

        BigDecimal f = d.add(e);

        System.out.println(f);
    }

}
