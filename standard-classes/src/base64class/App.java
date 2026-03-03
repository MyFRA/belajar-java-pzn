package base64class;

import java.util.Base64;

public class App {

    static void main() {

        /**
         * Base64 Class
         *
         * Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64
         * Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa digunakan untuk mengubah binary data ke text yang aman
         * Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing
         *
         */
        String query = "belajar() pemrograman() java";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);

    }

}
