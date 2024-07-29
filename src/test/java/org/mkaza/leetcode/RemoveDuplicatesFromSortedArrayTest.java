package org.mkaza.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArrayTest {

    @ParameterizedTest
    @MethodSource("removeElementTest")
    void testRemoveElement(int[] nums, int[] expectedArray, int expectedK) {
        int k = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        Assertions.assertEquals(expectedK, k);
        Assertions.assertEquals(
                Arrays.stream(expectedArray).boxed().collect(Collectors.toSet()),
                Arrays.stream(nums).limit(expectedK).boxed().collect(Collectors.toSet())
        );
    }

    private static Stream<Arguments> removeElementTest() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, new int[]{1,2}, 2),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4},new int[]{0,1,2,3,4}, 5)
        );
    }

}
