package edu.dsw.pp2.i47109._2022_05_21.zad2;

public interface GenericQueue<E> {
    boolean add(E element );
    boolean offer(E element);
    E remove();
    E poll();
    E element();
    E peek();
}
