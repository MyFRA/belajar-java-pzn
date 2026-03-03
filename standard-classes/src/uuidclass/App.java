package uuidclass;

import java.util.UUID;

public class App {

    static void main() {

        /**
         * UUID Class
         *
         * Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key misalnya
         * Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier
         * UUID adalah format standard untuk membuat unique value yang telah terjamin
         *
         */

        for (int i = 0; i < 100; i++) {
            System.out.println(UUID.randomUUID());
        }

    }

}
