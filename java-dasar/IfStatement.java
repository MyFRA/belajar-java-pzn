
public class IfStatement {
    public static void main(String[] args) {
        int nilai = 70;
        int absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda B");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
