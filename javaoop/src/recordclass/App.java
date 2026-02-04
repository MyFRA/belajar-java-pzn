package recordclass;

public class App {

    // Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashCode dan toString method
    // Record class digunakan untuk mempermudah pembuatan jenis class tersebut
    // Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString method secara otomatis dan juga constructor secara otomatis
    // Saat membuat record class, secara otomatis kita akan meng-extend class java.lang.Record, yang artinya kita tidak bisa extend class lain. Namun kita tetap bisa meng-implement interface

    static void main() {
        LoginRequest loginRequest = new LoginRequest("myfra", "123");

        System.out.println(loginRequest);
        System.out.println(loginRequest.password());
    }
}
