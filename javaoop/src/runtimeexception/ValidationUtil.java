package runtimeexception;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) {
        if(loginRequest.username() == null) {
            throw new BlankException("Username tidak boleh kosong");
        }
    }

}
