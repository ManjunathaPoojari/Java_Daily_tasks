package com.javafiles;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            int i = 1;
            try {
                while (true) {
                    System.out.println("Produced: " + i);
                    queue.put(i); // blocks if queue is full
                    i++;
                    Thread.sleep(50); // simulate production time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int value = queue.take(); // blocks if queue is empty
                    System.out.println("Consumed: " + value);
                    Thread.sleep(100); // simulate consumption time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();
    }
}

