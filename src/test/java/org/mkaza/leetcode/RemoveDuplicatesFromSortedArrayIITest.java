package org.mkaza.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArrayIITest {

    @ParameterizedTest
    @MethodSource("removeElementTest")
    void testRemoveElement(int[] nums, int[] expectedArray, int expectedK) {
        int k = new RemoveDuplicatesFromSortedArrayII().removeDuplicatesBetter(nums);
        Assertions.assertEquals(expectedK, k);
        Assertions.assertArrayEquals(
                expectedArray,
                Arrays.copyOfRange(nums, 0, expectedK)
        );
    }

    private static Stream<Arguments> removeElementTest() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1,2,2,3}, new int[]{1,1,2,2,3}, 5),
                Arguments.of(new int[]{0,0,1,1,1,1,2,3,3},new int[]{0,0,1,1,2,3,3}, 7),
                Arguments.of(new int[]{1,1,1,2,2,2,3,3},new int[]{1,1,2,2,3,3}, 6)
        );
    }

}
