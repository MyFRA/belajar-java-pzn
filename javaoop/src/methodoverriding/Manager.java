package methodoverriding;

class Manager {

    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }

}
