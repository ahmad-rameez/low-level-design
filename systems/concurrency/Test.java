package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {

//        WorldThread world = new WorldThread();
//        world.start();
//
//        Thread thread = new Thread(new WorldRunnable());
//        thread.start();
//
//        for(int i=0; i<100; i++) {
//            System.out.println("Hello");
//        }

        ReEntrantExample reEntrantExample = new ReEntrantExample();
        reEntrantExample.outerMethod();
    }
}
