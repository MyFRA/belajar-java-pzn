package anonymousclass;

public class App {

    // Anonymous class adalah class tanpa nama
    // Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung
    // Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat anonymous class tersebut
    // Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface  atau abstract class sederhana, tanpa harus membuat implementasi class nya

    static void main() {
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
    }
}
