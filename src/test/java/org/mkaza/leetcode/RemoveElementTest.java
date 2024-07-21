package org.mkaza.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveElementTest {

    @ParameterizedTest
    @MethodSource("removeElementTest")
    void testRemoveElement(int[] nums, int val, int[] expectedArray, int expectedK) {
        int k = new RemoveElement().removeElement(nums, val);
        Assertions.assertEquals(expectedK, k);
        Assertions.assertEquals(
                Arrays.stream(expectedArray).boxed().collect(Collectors.toSet()),
                Arrays.stream(nums).limit(expectedK).boxed().collect(Collectors.toSet())
        );
    }

    private static Stream<Arguments> removeElementTest() {
        return Stream.of(
                Arguments.of(new int[]{3,2,2,3}, 3, new int[]{2,2}, 2),
                Arguments.of(new int[]{0,1,2,2,3,0,4,2}, 2, new int[]{0,1,4,0,3}, 5)
        );
    }

}
