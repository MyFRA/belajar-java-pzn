package stringbuilderandstringbuffer;

public class App {

    static void main() {

        /**
         * Immutable String
         *
         */

        /**
         * String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string,
         * sebenarnya yang dilakukan di Java adalah membuat String baru.
         *
         */

        /**
         * Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String
         * karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan
         * menggunakan StringBuffer atau StringBuilder
         *
         */

        /**
         * StringBuffer vs StringBuilder
         *
         * Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
         * Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe
         * Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak butuh paralel, cukup menggunakan StringBuilder
         * Karena StringBuffer dibuat agar thread safe, maka secara otomatis performa nya lebih lambat dibandingkan StringBuilder
         *
         */

        /**
         * StringBuilder
         *
         */
        StringBuilder builder = new StringBuilder();
        builder.append("Tomy");
        builder.append(" ");
        builder.append("Wibowo");

        String fullName = builder.toString();

        System.out.println(fullName);

        /**
         * StringBuffer
         *
         */
        StringBuffer buffer = new StringBuffer();
        buffer.append("Tomy");
        buffer.append(" ");
        buffer.append("Wibowo");

        String fullNameBuffer = buffer.toString();

        System.out.println(fullNameBuffer);
    }

}
