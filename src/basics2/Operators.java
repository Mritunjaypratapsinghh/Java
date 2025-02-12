package basics2;

import java.security.KeyStore;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operators
        int a = 12;
        int b = 13;

        int result = a + b;
        System.out.println(result);

        int c = 10;
        int d = 5;

        int sub = c - d;

        System.out.println(sub);

        int e = 4;
        int f = 4;
        int mul = e * f;
        System.out.println(mul);

        int g = 10;
        int h = 3;

        int divide = g / h;
        double withoutTypeCasting = g / h;//here even we are storing result in double it does not give correct result because both operands are integer
        double div = (double) g / h;// we need to explicitly type caste either of the values to get correct division result in  decimals

        System.out.println(divide + " " + withoutTypeCasting + " " + div);


        int i = 10;
        int j = 3;

        int modulo = i % j;
        System.out.println(modulo);

        /*   Assignment Operator
        = , +=, -=, *=,  /=, %=
         */

        a += b;
        c -= d;
        e *= f;
        g /= h;
        i %= j;
        System.out.println(a + " " + c + " " + e + " " + g + " " + i);

        /*
        Relation operator: Always return Boolean Values
        ==, !=, >, <, >=, <=
         */

        boolean equal = a == b;
        boolean notEqual = a != b;
        boolean greaterThan = a > b;
        boolean lessThan = a < b;
        boolean greaterThanEqualTo = a >= b;
        boolean lessThanEqualTo = a <= b;

        System.out.println(equal + " " + notEqual + " " + greaterThan + " " + lessThan + " " + greaterThanEqualTo + " " + lessThanEqualTo);

        /*
        Logical Operators: return boolean value
        &&(AND), ||(OR), !(NOT)
         */
        boolean p = true;
        boolean q = false;
        boolean r = true;
        boolean And = p && q;//False
        boolean and = p && r;//True
        boolean or = p || q;//True
        boolean not = !q;// Works for single operand

        System.out.println(And + " " + and + " " + or + " " + not);

        /*
        Bitwise Operators
        ~(Bitwise Complement), << (Left Shift), >>(Right Shift), >>>(Unsigned Right Shift), & (Bitwise AND), ^(Bitwise Exclusive OR)
         */

        int x = 5;  // Binary:  0000 0101
        int y = 3;  // Binary:  0000 0011

        //Bitwise Complement (~) - Inverts all bits (Two's complement)
        int complementX = ~x;
        // 0000 0101 (5) → Invert bits
        // 1111 1010 (-6 in two's complement)
        System.out.println("~x = " + complementX); // Output: -6

        // Left Shift (<<) - Multiplies by 2^n
        int leftShift = x << 1;
        // 0000 0101 (5) << 1
        // 0000 1010 (10)
        System.out.println("x << 1 = " + leftShift); // Output: 10

        // Right Shift (>>) - Divides by 2^n
        int rightShift = x >> 1;
        // 0000 0101 (5) >> 1
        // 0000 0010 (2)
        System.out.println("x >> 1 = " + rightShift); // Output: 2

        //  Unsigned Right Shift (>>>) - Shifts right without sign extension
        int unsignedRightShift = -5 >>> 1;
        // 1111 1011 (-5 in two's complement) >>> 1
        // 0111 1101 (Unsigned shift right)
        System.out.println("-5 >>> 1 = " + unsignedRightShift); // Output: 2147483645


        // Bitwise AND (&) - Only 1 if both bits are 1
        int andResult = x & y;
        // 0000 0101 (5)
        // 0000 0011 (3)
        // ------------
        // 0000 0001 (1)
        System.out.println("x & y = " + andResult); // Output: 1

        // Bitwise OR (|) - 1 if either bit is 1
        int orResult = x | y;
        // 0000 0101 (5)
        // 0000 0011 (3)
        // ------------
        // 0000 0111 (7)
        System.out.println("x | y = " + orResult); // Output: 7

        // Bitwise XOR (^) - 1 if bits are different
        int xorResult = x ^ y;
        // 0000 0101 (5)
        // 0000 0011 (3)
        // ------------
        // 0000 0110 (6)
        System.out.println("x ^ y = " + xorResult); // Output: 6

        /*
        Increment Operator: ++
        / Decrement Operator: --
        Post-Increment (x++) - Uses current value first, then increment
        Post-Decrement(x--) - Uses current value first, then decrement
        Pre-Increment (++y) - Increments first, then uses the new value
        pre-Decrement (--y) - Decrement First, then uses the new value
        Addition Assignment (z += 1) - Increments, Decrements immediately, no return of old value
         */

        int incr = 10;
        System.out.println(incr++);//will print 10 and then increase+1 after printing
        System.out.println(incr);// 11
        System.out.println(++incr);//12

        System.out.println(incr--);//Print 12, then decrement to 11
        System.out.println(incr);//11
        System.out.println(--incr);//10

        /*
        Ternary Operator-   ?:  Works for Conditional Cases
         */
    }
}
