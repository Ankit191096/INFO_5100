package com.company;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Question1 {
    public class ThreadSafeLinkedList<E> {
        private LinkedList<E> list = new LinkedList<>();

        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        public void addAtPosition(int index, E e) {
            lock.writeLock().lock();
            list.add(index, e);
            lock.writeLock().unlock();
        }
        public void removeAtPosition(int index ){
            lock.writeLock().lock();
            list.remove(index);
            lock.writeLock().unlock();
        }

        public E getFirst() {
            E e;
            lock.readLock().lock();
            e = list.getFirst();
            lock.readLock().unlock();
            return e;
        }

        public E getLast() {
            E e;
            lock.readLock().lock();
            e = list.getLast();
            lock.readLock().unlock();
            return e;
        }

        public int size() {
            int size;
            lock.readLock().lock();
            size = list.size();
            lock.readLock().unlock();
            return size;

        }
        public void add(E e) {
            lock.writeLock().lock();
            list.add(e);
            lock.writeLock().unlock();
        }

        class Worker<E> implements Runnable {

            ThreadSafeLinkedList<E> list;
            E value;

            public Worker(ThreadSafeLinkedList<E> list, E i) {
                this.list = list;
                this.value = i;
            }

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(value);
                }
            }
        }
    }
}
