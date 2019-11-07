package com.nojava.thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: nojava
 * Date: 2019-11-07
 * Time: 23:26
 */
//1.继承Thread类
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("111");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        //2.实现runnable接口 此处为匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("实现runable接口");
            }
        };
        new Thread(runnable).start();
    }

}
