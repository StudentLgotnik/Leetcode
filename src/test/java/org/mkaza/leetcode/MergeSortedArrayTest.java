package org.mkaza.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MergeSortedArrayTest {

    @ParameterizedTest
    @MethodSource("mergeDataTest")
    void testMerge(int[] nums1, int[] nums2, int[] expected) {
        new MergeSortedArray().merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        Assertions.assertArrayEquals(expected, nums1);
    }

    private static Stream<Arguments> mergeDataTest() {
        return Stream.of(
                Arguments.of( new int[]{1,2,3,0,0,0}, new int[]{2,5,6}, new int[]{1,2,2,3,5,6})
        );
    }
}
