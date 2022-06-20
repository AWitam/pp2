package edu.dsw.pp2.i47109._2022_05_08.zad4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
    Sorter sorter;
    Player[] mockPlayers;
    Player mockPlayer1 = new Player("p1", 0);
    Player mockPlayer2 = new Player("p2", 123);
    Player mockPlayer3 = new Player("p3", 10);

    @BeforeEach
    void setUp() {
        sorter = new Sorter();
        mockPlayers = null;
    }

    @Test
    @DisplayName("Should sort objects in a non-decreasing order")
    void sort() {
        // Arrange
        mockPlayers = new Player[]{mockPlayer1, mockPlayer2, mockPlayer3};
        Player[] expectedArray = new Player[] {mockPlayer1, mockPlayer3, mockPlayer2};

        // Act
        Comparable<Player>[] result = sorter.sort(mockPlayers);

        // Assert
        assertArrayEquals(expectedArray, mockPlayers);
    }

    @Test
    @DisplayName("Should revert objects order")
    void reverse() {
        // Arrange
        mockPlayers = new Player[]{mockPlayer1, mockPlayer2, mockPlayer3};
        Player[] expectedArray = new Player[] {mockPlayer3, mockPlayer2, mockPlayer1};

        // Act
        Comparable<Player>[] result = sorter.reverse(mockPlayers);

        // Assert
        assertArrayEquals(expectedArray, result);
    }
}