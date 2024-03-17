import java.util.Scanner;

public class pac9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = getGCD.gcd(num1, num2);
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
        sc.close();

    }

}

class getGCD {

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int k = 2;
        while (k <= num1 && k <= num2) {
            if (num1 % k == 0 && num2 % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }

}
