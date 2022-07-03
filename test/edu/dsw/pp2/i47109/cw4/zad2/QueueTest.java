package edu.dsw.pp2.i47109.cw4.zad2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue<Object> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @Test
    @DisplayName("Should insert and element into queue")
    void add() {
        // Arrange
        Object[] expectedArray = new Object[]{2, 3, null, null, null};

        // Act
        queue.add(2);
        boolean result = queue.add(3);

        // Assert
        assertArrayEquals(expectedArray, queue.toArray());
        assertTrue(result);
    }

    @Test
    @DisplayName("Should throw when MAX_CAPACITY is reached")
    void maxCapacity() {
        // Arrange
        queue.add(2);
        queue.add(3);
        queue.add(10);
        queue.add(2);
        queue.add(4);

        // Act
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            queue.add(3);
        });

        // Assert
        assertNotNull(exception);
    }

    @Test
    @DisplayName("should remove element from queue")
    void remove() {
        // Arrange
        queue.add(2);

        // Act
        Object removedElement = queue.remove();

        // Assert
        assertArrayEquals(queue.toArray(), new Object[5]);
        assertEquals(2, removedElement);
    }

    @Test
    @DisplayName("should throw when trying to remove element from empty queue")
    void removeFromEmpty() {
        // Act
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });

        // Assert
        assertNotNull(exception);
    }


    @Test
    @DisplayName("should return element if it's present in the queue")
    void contains() {
        // Arrange
        queue.add(2);
        queue.add(3);

        // Act
        boolean existingElement = queue.contains(3);
        boolean nonExistingElement = queue.contains(10);

        // Assert
        assertTrue(existingElement);
        assertFalse(nonExistingElement);
    }
}
