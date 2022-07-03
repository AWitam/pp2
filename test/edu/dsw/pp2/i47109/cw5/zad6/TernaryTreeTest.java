package edu.dsw.pp2.i47109.cw5.zad6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class TernaryTreeTest {
    TernaryTree<Integer> tree;

    @BeforeEach
    void setUp() {
        tree = new TernaryTree<Integer>();
    }

    @DisplayName("Should calculate ternary tree depth when tree:")
    @ParameterizedTest(name = "{2}")
    @ArgumentsSource(TernaryTreeTest.TestNodesProvider.class)
    void getDepth(int[] nodes, int expectedDepth, String description) {
        tree.add(nodes);
        int calculatedDepth = tree.getDepth();

        assertEquals(expectedDepth, calculatedDepth);
    }

    static class TestNodesProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(new int[]{1}, 1, "only has a root node"),
                    Arguments.of(new int[]{5, 3, 4, 5, 3, 2, 8, 10, 6}, 3, "has three levels with two subtrees"),
                    /**
                     *              5
                     *           /  |  \
                     *         3    5   8
                     *       / | \     / \
                     *     2  3  4    6  10
                     *
                     */

                    Arguments.of(new int[]{5, 8, 6, 10, 10, 9, 12}, 4, "has four levels but only one child node")

                    /**
                     *               5
                     *                \
                     *                 8
                     *                / \
                     *               6   10
                     *                 / | \
                     *                9  10 12
                     */

            );
        }
    }
}