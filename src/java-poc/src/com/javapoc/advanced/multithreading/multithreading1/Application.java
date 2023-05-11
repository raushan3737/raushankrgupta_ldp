package com.javapoc.advanced.multithreading.multithreading1;

class StartThreads extends Thread {

    public void run() {

        for (int n = 0; n < 8; n++) {
            System.out.println("Hi there! " + n);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Application {

    public static void main(String[] args) {

        StartThreads threads1 = new StartThreads();
        threads1.start();

        StartThreads thread2 = new StartThreads();
        thread2.start();

    }

}
