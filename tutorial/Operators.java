package tutorial;

public class Operators {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("=== ARITHMETIC OPERATORS ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        System.out.println("\n=== RELATIONAL OPERATORS ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.println("\n=== LOGICAL OPERATORS ===");
        boolean x = true;
        boolean y = false;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Logical AND (x && y): " + (x && y));
        System.out.println("Logical OR (x || y): " + (x || y));
        System.out.println("Logical NOT (!x): " + (!x));
        System.out.println("Logical NOT (!y): " + (!y));

        System.out.println("\n=== COMPOUND EXAMPLE ===");
        System.out.println("(a > 10 && b < 5): " + (a > 10 && b < 5));
        System.out.println("(a == 15 || b == 10): " + (a == 15 || b == 10));
    }
}




