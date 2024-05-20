package exep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class multiThread {

    public static void main(String[] args) {
        FileReaderThread frt = new FileReaderThread("lab\\src\\exep\\n" + //
                "um.txt");
        frt.start();

    }

}

class FactorialThread extends Thread {
    private int num;

    public FactorialThread(int num) {
        this.num = num;
    }

    public void run() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

class FileReaderThread extends Thread {
    private String fileName;
    public static int number;

    public FileReaderThread(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            if ((line = br.readLine()) != null) {
                try {
                    number = Integer.parseInt(line);
                    System.out.println("Number read from file: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in file: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
