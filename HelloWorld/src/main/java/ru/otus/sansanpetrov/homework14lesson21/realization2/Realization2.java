package ru.otus.sansanpetrov.homework14lesson21.realization2;

import ru.otus.sansanpetrov.homework14lesson21.math.Calculation;

import java.util.Arrays;

public class Realization2 {


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t.setDaemon(true);
        t.start();
        t.join();

        long time = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - time);
    }
    public synchronized void inc() {

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(10);
                }
            }).start();
        }
    }
}
