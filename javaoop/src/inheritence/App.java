package inheritence;

public class App {

    static void main() {

        Manager manager = new Manager();
        manager.name = "Tomy";
        manager.sayHello("FRA");

        VicePresident vicePresident = new VicePresident();
        vicePresident.name = "Wibowo";
        vicePresident.sayHello("FRA");
    }

}
