package defaultmethodinterface;

public class App {

    // Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena harus meng-override method tersebut.
    // Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface

    static void main() {
        Avanza avanza = new Avanza();

        avanza.drive();
        System.out.println(avanza.getTire());
    }

}
