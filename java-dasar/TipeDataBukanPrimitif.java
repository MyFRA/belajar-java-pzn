public class TipeDataBukanPrimitif {

    public static void main(String[] args) {
        
        // Default value tipe data bukan primitif itu null
        Integer age = 23;
        Character letter = 'A';
        Boolean benar = true;
        Float phi = 3.14F; 

        System.out.println(age);
        System.out.println(letter);
        System.out.println(benar);
        System.out.println(phi);

        // Konversi dari tipe primitif
        int agePrimitif = 30;
        Integer ageObject = agePrimitif;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

        System.out.println(shortAge);
        System.out.println(byteAge);
    }

}
