public class BreakAndContinue {

    public static void main(String[] args) {
        
        // Break itu mengentikan perulangan
        int counter = 1;
        while (true) { 
            System.out.println("Perulangan Ke-" + counter);

            counter++;

            if(counter > 10) {
                break;
            }
        }

        System.out.println("---------------------");

        // Continue itu menskip perulangan, melanjutkan yang selanjutnya
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan Ke-" + i);
        }
    }

}
