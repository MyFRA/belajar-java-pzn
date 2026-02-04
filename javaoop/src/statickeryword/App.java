package statickeryword;

public class App {

    static void main() {

        // Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui object nya
        // Static hanya bisa mengakses static lainnya

        // Static dapat digunakan di
        // field atau disebut class variable, artinya field tsb bisa diakses langsung tanpa membuat object terlebih dahulu
        // method atau disebut class method, artinya method tsb bisa diakses langsung tanpa membuat object terlebih dahulu
        // block, static block akan otomatis dieksekusi ketika sebuah class di load
        // inner class, artinya inner class tsb bisa diakses secara langsung tanpa harus membuat object outer class terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya

        System.out.println(Constant.APPLICATION);
    }

}
