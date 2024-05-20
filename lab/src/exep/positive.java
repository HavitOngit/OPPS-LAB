package exep;

import java.util.Scanner;

public class positive {

    public static void main(String[] args) throws NagativeInputExce {
        try {

            String store;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a Integers saparate with ',' (comma): \n--ex. 1,2,3,4,5");

            store = sc.nextLine();

            String[] arr = store.split(",");

            int sum = 0;

            for (String i : arr) {
                if (Integer.parseInt(i) < 0) {
                    throw new NagativeInputExce("input must be positive Integer");
                } else {
                    sum += Integer.parseInt(i);
                }
            }

            System.out.println("Sum of the given integers: " + sum);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

}

class NagativeInputExce extends Exception {
    public NagativeInputExce(String message) {
        super(message);
    }
}
