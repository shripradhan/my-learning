package com.shreetech.multithreading;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println("  Thread1 Thread Name is : : "+ Thread.currentThread().getName());
        });
        t1.start();
        Thread t2 = new Thread(()->{
            System.out.println(" Thread2 Current Thread Name is : : "+ Thread.currentThread().getName());
        });
        t2.start();
       // Thread.sleep(5000);
        System.out.println("Hello World : " + Thread.currentThread().getName());



    }
}
