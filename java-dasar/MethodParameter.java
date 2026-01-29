public class MethodParameter {

    public static void main(String[] args) {
        sayHello("Tomy", "Wibowo");
        sayHello("My", "FRA");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
