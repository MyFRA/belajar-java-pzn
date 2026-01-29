public class TipeDataArray {

    public static void main(String[] args) {
        
        // Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        // Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Tomy";
        arrayString[1] = "Fra";
        arrayString[2] = "MyFRA";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int[] arrayInt = new int[]{
            10, 90, 80, 67, 29
        };

        long[] arrayLong = {
            10, 90, 80, 67, 29
        };

        System.out.println(arrayInt[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayInt.length);

        // Array Di Dalam Array
        String[][] members = {
            {"Tomy", "Wibowo"},
            {"MyFRA", "FRA"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][1]);
    }

}
