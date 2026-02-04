package runtimeexception;

public class App {

    // Runtime exception adalah jenis exception yang tidak wajib di tangkap menggunakan try catch
    // Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang bisa menyebabkan runtime exception
    // Untuk membuat class runtime exception, kita wajib meng extends class RuntimeException
    // Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dan lain-lain
    static void main() {
        LoginRequest loginRequest =  new LoginRequest(null, "123");

        // Wajib pakai try catch
        try {
            ValidationUtil.validate(loginRequest);
        } catch (RuntimeException e) {
            System.out.println("Error " + e);
        }
    }
}
