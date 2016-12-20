package ua.dp.levelup.classwork.lesson14.Sorting

import spock.lang.Specification

import static org.junit.Assert.assertArrayEquals

/**
 * Created by java on 20.12.2016.
 */
class SorterTest extends Specification {
    def "BubbleSort test"(int[] actual, int[] expected) {
        expect:

        assertArrayEquals(Sorter.bubbleSort(actual), expected)

        where:
        actual             | expected
        [0, 3, 1, 5]       | [0, 1, 3, 5]
        [5, 4, 3, 2, 1, 0] | [0, 1, 2, 3, 4, 5]
        [] | []
    }
}
