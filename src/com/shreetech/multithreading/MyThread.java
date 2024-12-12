package com.shreetech.multithreading;

class CustomeThread extends Thread{

    public void run(){
        System.out.println("First start() will work but second start() method will cause the IllegalThreadStateException");
    }
}

public class MyThread {

    public static void main(String[] args) {
        CustomeThread t = new CustomeThread();
        t.start();
        t.start();
       // t.run("Abc");
    }
}
