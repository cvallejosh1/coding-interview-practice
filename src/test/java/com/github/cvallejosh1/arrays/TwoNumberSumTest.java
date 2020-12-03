package com.github.cvallejosh1.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumberSumTest {

    @Test
    void testTwoNumberSumUsingFirstSolution() {
        int[] nums = {19, 2, 8, 1, -9, 21, 3};
        int target = 11;
        int[] expected = {8, 3};
        assertArrayEquals(expected, TwoNumberSum.solution1(nums, target), "Arrays should be equal.");
    }

    @Test
    void testEmptyArrayTwoNumberSumUsingFirstSolution() {
        int[] nums = {19, 2, 8, 1, -9, 21, 3};
        int target = 13;
        assertEquals(0, TwoNumberSum.solution1(nums, target).length);
    }

    @Test
    void testTwoNumberSumUsingOptimizedSolution() {
        int[] nums = {19, 2, 8, 1, -9, 21, 3};
        int target = 11;
        int[] expected = {8, 3};
        assertArrayEquals(expected, TwoNumberSum.solution1(nums, target), "Arrays should be equal.");
    }

    @Test
    void testEmptyArrayTwoNumberSumUsingOptimizedSolution() {
        int[] nums = {19, 2, 8, 1, -9, 21, 3};
        int target = 13;
        assertEquals(0, TwoNumberSum.solution1(nums, target).length);
    }
}
