package edu.dsw.pp2.i47109.cw5.zad5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class QuicksortTest {
    int[] testArray;
    Quicksort sort;


    @AfterEach
    void cleanup() {
        sort = null;
        testArray = null;
    }

    @DisplayName("Should sort elements in a non-decreasing order when:")
    @ParameterizedTest(name = "given array = {1} - {2}")
    @ArgumentsSource(TestArrayProvider.class)
    void quicksort(int[] givenArray, int[] sorted, String description) {
        testArray = givenArray;
        sort = new Quicksort(testArray);
        assertArrayEquals(sorted, testArray);
    }

    static class TestArrayProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(Arguments.of(new int[]{}, new int[]{},"is empty, no need to sort"),
                    Arguments.of(new int[]{1}, new int[]{1}, "contains one element, no need to sort"),
                    Arguments.of(new int[]{0, 9}, new int[]{0, 9}, "contains the last two digits of my student id number"),
                    Arguments.of(new int[]{1, 0, 9}, new int[]{0, 1, 9}, "contains the last three digits of my student id number"),
                    Arguments.of(new int[]{9, 0, 1, 7, 4}, new int[]{0, 1, 4, 7, 9}, "contains digits of my student id number in reverse order"),
                    Arguments.of(new int[]{4, 7, 1, 0, 9}, new int[]{0, 1, 4, 7, 9}, "contains digits of my student id number"),
                    Arguments.of(new int[]{4122, -17, 12, -2, 29}, new int[]{-17, -2, 12, 29, 4122}, "contains negative numbers")
            );
        }
    }

}