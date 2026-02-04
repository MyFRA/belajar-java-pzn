package interfaceinheritence;

public class App {

    // Di interface, child class bisa implement lebih dari 1 interface
    // Interface bisa implement interface lain, bisa lebih dari 1. Namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci extends

    static void main() {
        Avanza avanza = new Avanza();

        avanza.drive();
        System.out.println(avanza.getTire());
    }

}
