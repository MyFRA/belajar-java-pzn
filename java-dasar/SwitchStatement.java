public class SwitchStatement {

    public static void main(String[] args) {
        
        char nilai = 'A';

        switch (nilai) {
            case 'A':
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Nilai Anda Cukup Baik");
                break;
            default:
                System.out.println("Anda Tidak Lulus");
        }

        switch (nilai) {
            case 'A' -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case 'B', 'C' -> System.out.println("Nilai Anda Cukup Baik");
            default -> System.out.println("Anda Tidak Lulus");
        }

        // Switch Tanpa Yield
        String ucapan;
        switch (nilai) {
            case 'A' -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case 'B', 'C' -> ucapan = "Nilai Anda Cukup Baik";
            default -> ucapan = "Anda Tidak Lulus";
        }
        System.out.println(ucapan);

        // Switch Dengan Yield
        String ucapan2 = switch (nilai) {
            case 'A': 
                yield "Wow, Anda Lulus Dengan Baik";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan2);
    }

}
