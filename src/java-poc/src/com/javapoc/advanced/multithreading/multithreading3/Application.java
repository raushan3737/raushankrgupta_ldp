package com.javapoc.advanced.multithreading.multithreading3;


public class Application {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {

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
        });

        thread1.start();
    }

}
