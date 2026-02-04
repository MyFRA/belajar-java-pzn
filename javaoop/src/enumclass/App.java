package enumclass;

public class App {

    // Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
    // Misal, gender, ada male dan female, atau tipe customer, ada standard, premium atau vip, dan lain-lain
    // Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang sudah ditentukan
    // Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu class enum tidak bisa extends class lain, namun masih tetap bisa implements interface
    static void main() {
        System.out.println(Level.STANDARD);
    }
}
