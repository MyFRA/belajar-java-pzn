package polymorphism;

public class App {

    static void main() {

        //  Polymorphism yaitu kemampuan sebuah object berubah bentuk menjadi object lain
        Employee employee = new Employee("Tomy");
        employee = new Manager("Wibowo");
        employee = new Manager("FRA");

        VicePresident vicePresident = new VicePresident();

        System.out.println(vicePresident.name);
        System.out.println(employee);
    }

}
