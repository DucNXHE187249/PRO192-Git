import java.util.Scanner;
import java.lang.Math;

class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
        super(message);
    }
}
class IllegalRightTriangleException extends Exception {

    public IllegalRightTriangleException(String message) {
        super(message);
    }
}
class RightTriangle {
    private int a;
    private int b;
    private int c;
    public RightTriangle(int a, int b, int c) throws IllegalTriangleException,
    IllegalRightTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Triangle sides must be positive integers.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Invalid triangle sides.");
        }
        if (Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2) && Math.pow(a, 2) + Math.pow(c, 2) != Math.pow(b, 2) && Math.pow(b, 2) + Math.pow(c, 2) != Math.pow(a, 2)) {
            throw new IllegalRightTriangleException("Not a right triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
        public int getA() {
            return a;
        }
    public int getB() {
        return b;
    }
    
    public int getC() {
        return c;
    }
}
public class Triangle{
    public static void main (String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insert 3 sides: ");

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            RightTriangle triangle = new RightTriangle(x, y, z);
            System.out.println("Triangle sides: " + triangle.getA() + ", " + triangle.getB() + ", " +
            triangle.getC());
        } catch (IllegalTriangleException e) {
            System.out.println("IllegalTriangleException: " + e.getMessage());
        } catch (IllegalRightTriangleException e) {
            System.out.println("IllegalRightTriangleException: " + e.getMessage());
        }
    }
}