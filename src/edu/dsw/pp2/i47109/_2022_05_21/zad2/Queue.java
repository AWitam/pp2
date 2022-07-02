package edu.dsw.pp2.i47109._2022_05_21.zad2;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * FIFO queue implementation using generic types.
 * Methods are based on official Java spec.
 *
 * @param <E> the type of elements to be held in the queue
 */

public class Queue<E> implements GenericQueue<E> {
    private int head = 0;
    private int tail = 0;
    private E[] elements;
    private int MAX_CAPACITY;

    /**
     * Default constructor sets MAX_CAPACITY to 5
     */

    public Queue() {
        this.MAX_CAPACITY = 5;
        this.elements = (E[]) new Object[5]; // default MAX_CAPACITY = 5
    }

    /**
     * Overrides default constructor and sets MAX_CAPACITY to given parameter
     *
     * @param MAX_CAPACITY maximum queue size
     */

    public Queue(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        this.elements = (E[]) new Object[this.MAX_CAPACITY];
    }

    /**
     * Checks if MAX_CAPACITY has been reached
     *
     * @return boolean
     */

    private boolean isFull() {
        return this.tail == this.MAX_CAPACITY;
    }

    /**
     * Checks if queue has no elements
     *
     * @return boolean
     */

    private boolean isEmpty() {
        return this.elements[this.head] == null;
    }

    /**
     * Retrieves the current order of elements in the queue
     *
     * @return array of elements present in the queue
     */

    public E[] toArray() {
        return this.elements;
    }

    /**
     * Inserts the specified element into queue if it does not violate capacity restrictions.
     * Returns true upon success and throws an IllegalStateException if the queue is full
     *
     * @param element generic element to be add into queue
     * @return true
     */

    @Override
    public boolean add(E element) {
        if (!this.isFull()) {
            this.elements[this.tail] = element;
            this.tail = (this.tail + 1) % this.MAX_CAPACITY;
            return true;
        }
        throw new IllegalStateException("Reached max queue capacity!");
    }

    /**
     * Inserts the specified element into the queue if it does not violate capacity restrictions.
     *
     * @param element generic element to be add into queue
     * @return true if the element was added to the queue, else false
     */


    @Override
    public boolean offer(E element) {
        if (this.isFull()) {
            return false;
        }
        this.elements[this.tail] = element;
        this.tail = (this.tail + 1) % this.MAX_CAPACITY;
        return true;
    }

    /**
     * Retrieves and removes the head of the queue and throws an exception if this queue is empty.
     *
     * @return the head of the element
     */

    @Override
    public E remove() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Queue is empty! Cannot remove the element.");
        }

        E currentHeadElement = this.elements[this.head];
        System.arraycopy(this.elements, 1, this.elements, 0, this.elements.length - 1);
        return currentHeadElement;
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if this queue is empty.
     *
     * @return the head of the queue or null
     */

    @Override
    public E poll() {
        E currentHeadElement = this.elements[this.head];
        System.arraycopy(this.elements, 1, this.elements, 0, this.elements.length - 1);
        return currentHeadElement;
    }

    /**
     * Retrieves, but does not remove, the head of the queue. Throws if the queue is empty.
     *
     * @return the head of the queue
     */

    @Override
    public E element() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Queue is empty - there's no such element!");
        }
        return this.elements[this.head];
    }

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     *
     * @return the head of the queue or null
     */

    @Override
    public E peek() {
        return this.elements[this.head];
    }

    /**
     * Returns true if the queue contains the specified element.
     *
     * @param element element whose presence in the queue is to be tested
     * @return boolean
     */

    public boolean contains(E element) {
        boolean found = false;
        for (E e : this.elements) {
            if (e == element) {
                found = true;
                break;
            }
        }
        return found;
    }

    /**
     * Removes all the elements from the queue
     */

    public void clear() {
        this.elements = (E[]) new Object[this.MAX_CAPACITY];
    }
}
