package exep;

import java.util.Random;
import java.util.Scanner;

public class usersumd {
    public static void main(String[] args) {
        Random rd = new Random();

        boolean status = false;

        Scanner sc = new Scanner(System.in);
        try {
            while (!status) {
                int a = rd.nextInt(100);
                int b = rd.nextInt(100);
                int sum = a + b;

                System.out.println("Read following Number And Enter the Number: ");
                System.out.println(a + "+" + b + " = " + sum);

                int usera = sc.nextInt();
                int userb = sc.nextInt();

                if (usera == a && userb == b) {
                    System.out.println("Correct");
                    status = true;
                } else {

                    throw new InputMissMatchException("Wrong Answer");

                }
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        sc.close();

    }
}

class InputMissMatchException extends Exception {
    public InputMissMatchException(String message) {
        super(message);
    }

}
