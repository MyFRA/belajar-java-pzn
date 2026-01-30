package methodoverriding;

public class VicePresident extends Manager {

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Vice President " + this.name);
    }

}
