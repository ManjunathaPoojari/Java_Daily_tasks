package com.javafiles;

//Q4. Write a program to demonstrate the difference between HashMap
//and ConcurrentHashMap in a multithreaded environment. 

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class MapDemo {
    public static void main(String[] args) throws InterruptedException {
    	
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> addValues(hashMap), "HashMap-Thread-1");
        Thread t2 = new Thread(() -> addValues(hashMap), "HashMap-Thread-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("HashMap size: " + hashMap.size()); // May be inconsistent

        Thread t3 = new Thread(() -> addValues(concurrentMap), "ConcurrentMap-Thread-1");
        Thread t4 = new Thread(() -> addValues(concurrentMap), "ConcurrentMap-Thread-2");

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("ConcurrentHashMap size: " + concurrentMap.size()); 
    }

    private static void addValues(Map<Integer, String> map) {
        for (int i = 0; i < 1000; i++) {
            map.put(i, Thread.currentThread().getName() + "-" + i);
        }
    }
}

