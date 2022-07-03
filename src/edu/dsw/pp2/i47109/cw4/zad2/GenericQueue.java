package edu.dsw.pp2.i47109.cw4.zad2;

public interface GenericQueue<E> {
    boolean add(E element );
    boolean offer(E element);
    E remove();
    E poll();
    E element();
    E peek();
}
