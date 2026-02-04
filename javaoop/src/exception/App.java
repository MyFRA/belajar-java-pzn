package exception;

public class App {

    // harus ada throws di method yang akan pakai
    // penggunaan pakai throw new
    static void main() {
        LoginRequest loginRequest =  new LoginRequest(null, "123");

        // Wajib pakai try catch
        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
