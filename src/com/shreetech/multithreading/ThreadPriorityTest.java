package com.shreetech.multithreading;


class CustomThread extends Thread{

    public void run(){
        this.getName();
        System.out.println("My custom Thread is running. : " + Thread.currentThread().getName());
    }
}
public class ThreadPriorityTest {

    public static void main(String[] args) {
        CustomThread thread1 = new CustomThread();
        thread1.setName("Shrikant No. 1 Thread");
        thread1.setPriority(8);
        thread1.start();

        CustomThread thread2 = new CustomThread();
        thread2.setName("Shrikant No. 2 Thread");
        thread2.setPriority(3);
        thread2.start();

        Thread thread = Thread.currentThread();
        thread.setName("Shrikant-Main");
        System.out.println("My Thread is running. : " + thread.getName());

    }
}
