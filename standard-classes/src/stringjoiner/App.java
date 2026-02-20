package stringjoiner;

import java.util.StringJoiner;

public class App {

    static void main() {
        /**
         * StringJoiner Class
         *
         * StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter
         * StringJoiner juga mendukung prefix dan sufix jika kita ingin menambahkannya
         * Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau misalnya
         */

        String[] names = {"Tomy", "Wibowo", "Ganteng"};
        StringJoiner joiner = new StringJoiner("||", "[", "]");
        for (var name : names) {
            joiner.add(name);
        }

        System.out.println(joiner.toString());
    }

}
