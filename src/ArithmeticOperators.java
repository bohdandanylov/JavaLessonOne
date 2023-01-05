public class ArithmeticOperators {

    public static void operators() {

        int a = 12, b = 5, c = 2, d = 3, x = 5, y = 7, t = 5, o = 8;
        int e;
        int result1, result2;
        int num = 5;
        int m = 10, n = 2;
        int mnl = m << n;
        int mnr = m >> n;
        int mnru = m >>> n;
        String k;


        System.out.println("a is " + a + " and b is " + b + "\n");

        System.out.println("Arithmetic Operators");

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b) + "\n");

        System.out.println("Assignment Operators");

        e = x;
        System.out.println("e using =: " + e);
        e += x;
        System.out.println("e using +=: " + e);
        e *= x;
        System.out.println("e using *=: " + e); //a = 12, b = 5, c = 2, d = 3;

        System.out.println("a -= b = " + (a -= b));
        System.out.println("a /= b = " + (a /= b));
        System.out.println("a %= b = " + (a %= b));

        System.out.println("x %= b = " + (x %= b) + "\n");

        System.out.println("Relational Operators");

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println((a <= b) + "\n");

        System.out.println("Logical Operators"); //a = 12, b = 5, c = 2, d = 3;

        System.out.println((a > b) && (c > d));
        System.out.println((a > b) && (c < d));

        System.out.println((a < b) || (c > d));
        System.out.println((a > b) || (c < d));
        System.out.println((a < b) || (c < d));

        System.out.println(!(a == d));
        System.out.println(!(a > d) + "\n");

        System.out.println("Unary Operators");

        ++num;
        System.out.println("num: " + num);

        System.out.println("Value of a: " + a);                 // original value

        result1 = ++a;                                          // increment operator
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b);

        result2 = --b;                                          // decrement operator
        System.out.println("After decrement: " + result2  + "\n");

        System.out.println("Bitwise Operators");

        System.out.println("t & y = " + (t & y));               // 0101 & 0111 = 0101 == 5
        System.out.println("t | y = " + (t | y));               // 0101 | 0111 = 0111 == 7
        System.out.println("t ^ y = " + (t ^ y));               // 0101 ^ 0111 = 0010 == 2
        System.out.println("~ o = " + ~ t);                     // ~00000000 00000000 00000000 00000101==
                                                                // ==11111111 11111111 11111111 11111010
        System.out.println("Left shift " + m + " by " + n + " positions : " + mnl);
        System.out.println("Right shift " + m + " by " + n + " positions : " + mnr);
        System.out.println("Right shift " + m + " by " + n + " positions : " + mnru);

        k = (t > o) ? "T > O" : "T < O";
        System.out.println(k);

    }
}
