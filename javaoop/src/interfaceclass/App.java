package interfaceclass;

public class App {

    // Yang lebih tepat untuk kontrak adalah interface
    // Interface disini bukanlah User Interface
    // Interface mirip seperti abstract class, yang membedakan adalah di Interface, semua method otomatis abstract, tidak memiliki block
    // Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
    // Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements

    static void main() {
        Avanza avanza = new Avanza();

        avanza.drive();
        System.out.println(avanza.getTire());
    }

}
