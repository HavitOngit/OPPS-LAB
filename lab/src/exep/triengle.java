package exep;

public class triengle {

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
    }

}

class Triangle {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Not a triangle");
        } else {
            System.out.println("Triangle created");
        }

    }
}