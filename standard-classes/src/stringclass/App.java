package stringclass;

public class App {

    static void main() {

        String name = "Tomy Wibowo";

        // Menjadi huruf kecil semua
        String nameLowerCase = name.toLowerCase();

        // Menjadi huruf besar semua
        String nameUpperCase = name.toUpperCase();

        // Mendapatkan panjang string
        int nameLength = name.length();

        // Mengecek apakah berawal dengan huruf
        boolean nameStartWithT = name.startsWith("T");

        // Mengecek apakah berakhir dengan huruf
        boolean nameEndWithO = name.endsWith("o");

        // Memecah string berdasarkan karakter sehingga menjadi array
        String[] nameSplitedArr = name.split(" ");

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(nameLength);
        System.out.println(nameStartWithT);
        System.out.println(nameEndWithO);
        for (int i = 0; i < nameSplitedArr.length; i++) {
            System.out.println(nameSplitedArr[i]);
        }
    }

}
