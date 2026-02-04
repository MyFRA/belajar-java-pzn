package exception;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if(loginRequest.username() == null) {
            throw new ValidationException("Username tidak boleh kosong");
        }
    }

}
