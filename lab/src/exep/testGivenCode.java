package exep;

class testGivenCode extends Thread {
    testGivenCode() {
    }

    testGivenCode(Runnable r) {
        super(r);
    }

    public void run() {
        System.out.print("Inside Thread ");
    }
}

class MyRunnable implements Runnable {
    public void run() {
    }
}