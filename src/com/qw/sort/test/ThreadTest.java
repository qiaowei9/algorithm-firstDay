package com.qw.sort.test;

public class ThreadTest implements Runnable {


    private int ticketCount = 500;
    Object lock =  new Object();

    @Override
    public void run() {

            while (ticketCount > 0 ){
                synchronized (lock){

                    System.out.println(Thread.currentThread().getName()+"  正在卖票，剩余" +ticketCount+"张");
                    ticketCount--;

                }
            }

    }
}
