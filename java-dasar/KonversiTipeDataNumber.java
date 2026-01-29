public class KonversiTipeDataNumber {

    public static void main(String[] args) {
        // Konversi Tipe Data Number
        // Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        byte iniByteKonv = 10;
        short iniShortKonv = iniByteKonv;
        int iniIntKonv = iniShortKonv;
        long iniLongKonv = iniIntKonv;
        float iniFloatKonv = iniLongKonv;
        double iniDoubleKonv = iniFloatKonv;
        
        // Narrowing Casting (Manual): double -> float -> long -> int -> char -> short -> byte
        float iniFloatKonvNarrow = (float) iniDoubleKonv;
        long iniLongKonvNarrow = (long) iniFloatKonvNarrow;
        int iniIntKonvNarrow = (int) iniLongKonvNarrow;
        char iniCharKonvNarrow = (char) iniIntKonvNarrow;
        short iniShortKonvNarrow = (short) iniCharKonvNarrow;
        byte iniByteKonvNarrow = (byte) iniShortKonvNarrow;

        // Print
        System.out.println(iniByteKonvNarrow);
    }

}
