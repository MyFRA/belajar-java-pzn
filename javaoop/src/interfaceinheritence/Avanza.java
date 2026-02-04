package interfaceinheritence;

public class Avanza implements Car, IsMaintenance {


    public void drive() {
        System.out.println("Drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Avanza";
    }

    public boolean isMaintenance() {
        return false;
    }
}
