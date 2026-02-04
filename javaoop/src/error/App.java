package error;

public class App {

    // Error adalah jenis exception yang terakhir
    // Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch
    // Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try catch
    // Artinya, direkomendasikan untuk mematikan aplikasi
    // Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk membuat exception jenis Error, dan menghentikan aplikasi
    static void main() {
        connectDatabase("admin", null);
    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke Database");
        }
    }
}
