package stringtokenizer;

import java.util.StringTokenizer;

public class App {

    static void main() {

        /**
         * String Tokenizer
         *
         * StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil
         * Kita bisa memotong String dengan delimiter yang kita mau
         *
         * Perbedaan dengan split adalah, kalau split kan langsung dipotong jadi array. Nah kalau ini satu satu
         *
         */
        String name = "Tomy Wibowo";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }


    }

}
