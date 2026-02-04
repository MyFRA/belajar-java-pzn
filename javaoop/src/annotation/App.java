package annotation;

@Fancy(name = "Tomy", tags = {"ok"})
public class App {

    // Annotation adalah menambahkan metadata ke kode program yang kita buat
    // Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library/framework
    // Annotation sendiri bisa diakses menggunakan Reflection
    // Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
    // Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
    // @Target memberitahu annotation bisa digunakan dimana? Class, method, field dan lain-lain
    // @Retention memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection?


}
