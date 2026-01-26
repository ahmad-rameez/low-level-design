package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("Performing Outer Method");
            System.out.println(Thread.currentThread().getName());
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Performing Inner Method");
            System.out.println(Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }

}
