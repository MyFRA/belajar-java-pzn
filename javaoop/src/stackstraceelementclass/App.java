package stackstraceelementclass;

public class App {

    // Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object
    // StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error
    // Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
    // Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console detail error StackTraceElement nya
    static void main() {
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

        try {
            String[] names = {
                    "Tomy", "Wibowo", "FRA"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraces = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }

    static void sampleError() {
        try {
            String[] names = {
                    "Tomy", "Wibowo", "FRA"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
