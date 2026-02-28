package systemclass;

public class App {

    static void main() {

        /**
         * System Class
         *
         * Class System adalah class yang berisikan banyak utility static method di Java, contohnya sebelumnya kita sudah sering menggunakan method println milik field out di class System
         *
         */

        /**
         * Method di System Class
         *
         * String getenv(key) -> Mendapatkan environment variable sistem operasi
         * void exit(status) -> Mengentikan program Java
         * long currentTimeMilis() -> Mendapatkan waktu saat ini dalam milisecond
         * long nanoTime() -> Mendapatkan waktu saat ini dalam nanosecond
         * void gc() -> Menjalankan Java garbace collection
         * ... dan masih banyak lagi
         *
         */

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv("HOME"));
        System.gc();
        System.exit(1);
        System.out.println("Hi");

    }

}
