package exep;

import java.io.*;
import java.util.concurrent.*;

class NumberReader implements Runnable {
    private final BlockingQueue<Integer> queue;

    NumberReader(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader("lab\\src\\exep\\n" + //
                "um.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                queue.put(Integer.parseInt(line));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                queue.put(-1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class FactorialCalculator implements Runnable {
    private final BlockingQueue<Integer> queue;

    FactorialCalculator(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int number = queue.take();
                if (number == -1)
                    break;
                long factorial = 1;
                for (int i = 2; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + number + " is " + factorial);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class FactorialThreads {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread reader = new Thread(new NumberReader(queue));
        Thread calculator = new Thread(new FactorialCalculator(queue));
        reader.start();
        calculator.start();
    }
}