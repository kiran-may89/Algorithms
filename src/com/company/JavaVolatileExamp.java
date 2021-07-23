package com.company;

public class JavaVolatileExamp {
    public static void main(String[] args){
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        counterThread.start();
        counterThread2.start();

    }
    public static void call(int... value){
        System.out.println("float called");
    }

    public static void call(String... value){
        System.out.println("int called");
    }
    public static void call(Integer value){

    }
    public static void  call(String value){

    }
}

class Counter{
    private  int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        ++counter;
    }
}
class CounterThread  extends Thread{
    Counter counter;
    CounterThread(Counter value){
        this.counter  =value;
    }

    @Override
    public void run() {
        super.run();
        int oldValue = counter.getCounter();
        System.out.println("[Thread " + Thread.currentThread().getId()
                + "]: Old value = " + oldValue);

        counter.increaseCounter();

        int newValue = counter.getCounter();
        System.out.println("[Thread " + Thread.currentThread().getId()
                + "]: New value = " + newValue);
    }
}