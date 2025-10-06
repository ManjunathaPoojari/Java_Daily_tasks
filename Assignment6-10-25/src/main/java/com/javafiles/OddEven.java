package com.javafiles;
//Q2. Implement a multithreaded program where two threads 
//print odd and even numbers alternately up to 20.
public class OddEven {

    private int count = 1;
    private final int MAX = 20;
    private final Object lock = new Object();

    public static void main(String[] args) {
        OddEven obj = new OddEven();
        obj.startPrinting();
    }

    public void startPrinting() {
        Thread oddThread = new Thread(new OddPrinter(), "Odd-Thread");
        Thread evenThread = new Thread(new EvenPrinter(), "Even-Thread");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class OddPrinter implements Runnable {
        @Override
        public void run() {
            printNumbers(true); 
        }
    }

    class EvenPrinter implements Runnable {
        @Override
        public void run() {
            printNumbers(false);
        }
    }

    private void printNumbers(boolean isOddThread) {
        while (true) {
            synchronized (lock) {
                while ((count % 2 == 1) != isOddThread) {
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                if (count > MAX) {
                    lock.notifyAll();
                    break;
                }

                System.out.println(Thread.currentThread().getName() + ": " + count);
                count++;

                lock.notifyAll();
            }
        }
    }
}
