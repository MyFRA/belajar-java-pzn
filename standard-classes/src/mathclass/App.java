package mathclass;

public class App {

    static void main() {

        /**
         * Math Class
         *
         * Class Math merupakan class utilities yang berisikan banyak sekali static method untuk operasi numerik, seperti trigonometrik, logarithm, akar pangkat dan lain lain
         *
         * double cos(double) menghitung cos di trigonometric
         * double sin(double) menghitung sin di trigonometric
         * double tan(double) menghitung tan di trigonometric
         * min(number1, number2) mengambil nilai terkecil
         * max(number1, number2) mengambil nilai terbesar
         * ...dan masih banyak lagi
         *
         */
        var min = Math.min(1000, 2000);
        System.out.println(min);

        int max = Math.max(1000, 2000);
        System.out.println(max);

        System.out.println(Math.PI);

    }

}
