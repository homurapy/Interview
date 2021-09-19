package l3;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    ReentrantLock lock = new ReentrantLock();
    protected int count = 0;

    public int getCount () {
        return count;
    }

    int increment () {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
        return count;
    }

    int decrement () {
        lock.lock();
        try {
            if (count >= 0) {
                count--;
            } else {
                count = 0;
            }
        } finally {
            lock.unlock();
        }
        return count;
    }
}
