package exep;

import java.util.Random;
import java.util.Scanner;

public class array100 {
    public static void main(String[] args) {

        int[] arr = new int[100];

        Random rd = new Random();

        // fill array with random integers
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(1000);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index of Number: ");
        int index = sc.nextInt();

        try {

            System.out.println("Number at index " + index + " is: " + arr[index]);

        } catch (Exception e) {

            throw new ArrayIndexOutOfBoundsException("Out of bound");
        }

    }
}
