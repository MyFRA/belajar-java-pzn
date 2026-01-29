public class OperasiMatematika {

    public static void main(String[] args) {
        
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        int c = 100;
        int d = 10;
        c += d;
        c -= d;
        c *= d;
        c /= d;
        c %= d;
        System.out.println(c);
     
        // Unary Operator
        int e = +100;
        int f = -10;
        e++;
        f--;

        System.out.println(e);
        System.out.println(f);
        System.out.println(!false);
    }

}
