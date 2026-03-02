package runtimeclass;

public class App {

    static void main() {
        /**
         * Runtime Class
         *
         * Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan
         * Informasi itu terdapat di class Runtime
         * Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses object tersebut menggunakan static method getRuntime() milik class Runtime
         *
         */

        /**
         * Method di Runtime Class
         *
         * int availableProcessors() -> Mendapatkan jumlah core cpu
         * long freeMemory() -> Mendapatkan jumlah memory bebas di JVM
         * long totalMemory() -> Mendapatkan jumlah total memory di JVM
         * long maxMemory() -> Mendapatkan jumlah maksimum memory di JVM
         * void gc() -> Menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai
         *
         */

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }


}
