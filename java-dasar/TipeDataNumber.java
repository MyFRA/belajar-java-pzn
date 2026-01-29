public class TipeDataNumber {
    public static void main(String[] args) {
        
        // Byte
        byte iniByte1 = -128;
        byte iniByte2 = 127;

        // Short
        short iniShort = -32768;
        short iniShort2 = 32767;

        // Int
        int iniInt = -2147483648;
        int iniInt2 = 2147483647;

        // Long
        long iniLong = -9223372036854775808L;
        long iniLong2 = 9223372036854775807L;

        // Print Out
        System.out.println(iniByte1);
        System.out.println(iniByte2);
        System.out.println(iniShort);
        System.out.println(iniShort2);
        System.out.println(iniInt);
        System.out.println(iniInt2);
        System.out.println(iniLong);
        System.out.println(iniLong2);

        // Floating Point Number
        // Ini Float
        float iniFloat = 10.12F;
        double iniDouble = 10.12;

        // Print Out
        System.out.println(iniFloat);
        System.out.println(iniDouble);

        // Literals
        int decimalInt = 25;
        int hexInt = 0xA13B;
        int binInt = 0b0101010101;
    
        // Print
        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binInt);

        // Underscore
        long balance = 1_000_000_000L;
        int sum = 60_000_000;

        // Print
        System.out.println(balance);
        System.out.println(sum);
    
    }
}
