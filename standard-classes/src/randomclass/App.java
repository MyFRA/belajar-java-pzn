package randomclass;

import java.util.Random;

public class App {

    static void main() {

        /**
         * Random Class
         *
         * Random class adalah class yang bisa kita gunakan untuk men-generate random number
         *
         */

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(1000));
        }
    }

}
