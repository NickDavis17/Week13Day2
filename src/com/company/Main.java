package com.company;



public class Main {
    static int j = 20;
    public static void main(String[] args) {
        Restroom1 r1 = new Restroom1();
        Restroom2 r2 = new Restroom2();
        Restroom3 r3 = new Restroom3();
        Restroom4 r4 = new Restroom4();
        Timer time = new Timer();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(time);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }


}

class Restroom1 implements Runnable{
    //2250
    public void run(){
        for (int i = 0; i < Main.j; i++) {
            System.out.println("R1 busy");
            try {Thread.sleep(2250);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("R1 available");
            Main.j--;
        }
    }
}

class Restroom2 implements Runnable{
    //2000
    public void run(){
        for (int i = 0; i < Main.j; i++) {
            System.out.println("R2 busy");
            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("R2 available");
            Main.j--;
        }
    }
}
class Restroom3 implements Runnable{
    //500
    public void run(){
        for (int i = 0; i < Main.j; i++) {
            System.out.println("R3 busy ");
            try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("R3 available");
            Main.j--;
        }
    }
}
class Restroom4 implements Runnable{
    //3500
    public void run(){
        for (int i = 0; i < Main.j; i++) {
            System.out.println("R4 busy");
            try {Thread.sleep(3500);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("R4 available");
            Main.j--;
        }
    }
}

class Timer implements Runnable{
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

