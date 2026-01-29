public class ForEach {

    public static void main(String[] args) {
        
        // Tanpa For Each
        int[] numbers = {
            1, 2, 3, 4, 5
        };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Menggunakan ForEach
        String[] arrays = {
            "Tomy", "Wibowo", "MyFRA", "FRA"
        };
        for(String item: arrays) {
            System.out.println(item);
        }
    }

}
