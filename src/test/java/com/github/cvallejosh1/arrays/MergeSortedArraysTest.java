package com.github.cvallejosh1.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArraysTest {

    @Test
    void testMergeTwoSortedArrays() {
        int[] arr1 = { 1,12,14,17,23 };
        int[] arr2 = { 11,19,27 };

        int[] mergedArray = MergeSortedArrays.merge(arr1, arr2);
        assertThat(mergedArray).containsExactly(1, 11, 12, 14, 17, 19, 23, 27);
    }

}
