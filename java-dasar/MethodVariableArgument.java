public class MethodVariableArgument {

    public static void main(String[] args) {

        int[] numbers = {80, 100};

        sayCongratsWithoutVariableArgument("FRA", numbers);
        sayCongratsWithVariableArgument("Tomy", 70, 80, 90);
    }

    static void sayCongratsWithoutVariableArgument(String name, int[] values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    static void sayCongratsWithVariableArgument(String name, int... values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
