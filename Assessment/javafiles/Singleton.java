package com.javafiles;

//Q3. Create a program to implement a thread-safe Singleton class using double-checked locking. 

//
public class Singleton {
 private static volatile Singleton instance;
 private Singleton() {
     System.out.println("Singleton instance created");
 }

 public static Singleton getInstance() {
     if (instance == null) { // first check (without locking)
         synchronized (Singleton.class) {
             if (instance == null) { // second check (with locking)
                 instance = new Singleton();
             }
         }
     }
     return instance;
 }

 public void showMessage() {
     System.out.println("Hello from Singleton!");
 }
    public static void main(String[] args) {
        // Thread 1
    	Thread t1 = new Thread(() -> {
    	    Singleton s = Singleton.getInstance();
    	    s.showMessage();
    	}, "Thread-1");

        // Thread 2
    	Thread t2 = new Thread(() -> {
    	    Singleton s = Singleton.getInstance();
    	    s.showMessage();
    	}, "Thread-2");

        t1.start();
        t2.start();
    }
}
