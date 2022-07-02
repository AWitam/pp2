package edu.dsw.pp2.i47109._2022_05_21.zad2;


public class Demo {
    public static void main(String[] args) {
        System.out.println("Integer queue example");

        Queue<Integer> intQueue = new Queue<Integer>();  // default constructor - max capacity: 5
        intQueue.add(1);
        intQueue.add(4);
        Integer head = intQueue.element();

        System.out.printf("Queue: %s%n", intQueue);
        System.out.printf("First element in the queue %s%n", head);
        System.out.printf("Contains 1? %s%n", intQueue.contains(1));

        intQueue.clear();
        System.out.printf("Queue cleared %s%n%n", intQueue);

        System.out.println("String queue example");
        Queue<String> stringQueue = new Queue<>(3);  // overriden constructor
        stringQueue.add("Item 1");
        stringQueue.add("Item 2");
        stringQueue.add("Item 3");

        System.out.printf("String queue: %s%n", stringQueue);

        stringQueue.offer("Item 4"); // does not insert element - max capacity reached
        System.out.printf("Contains Item 4? %s %s%n", stringQueue.contains("Item 4"), stringQueue);

        stringQueue.clear();
        System.out.printf("Queue cleared %s%n%n", stringQueue);
    }
}
