package equals;

public class App {

    static void main() {
        // Kalau compare better pakai equals daripada ==, khususnya string
        // Nah kalau object, method equals tinggal di override saja

        String first = "Tomy";
        first = first + " " + "Wibowo";

        System.out.println(first);

        String second = "Tomy Wibowo";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Tomy Wibowo";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }

}
