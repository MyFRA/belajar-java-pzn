package trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

    // Di Java 7, terdapat fitur baru yang bernama try with resource
    // Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource (yang wajib di close) dalam block try
    // Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable
    static void main() throws FileNotFoundException {

        try (BufferedReader reader = new BufferedReader(new FileReader("sample"))) {
            while (true) {
                String text = reader.readLine();
                if(text == null) {
                    break;
                }

                System.out.println(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
