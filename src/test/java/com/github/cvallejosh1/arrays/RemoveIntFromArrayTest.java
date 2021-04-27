package com.github.cvallejosh1.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveIntFromArrayTest {

    @Test
    void testRemoveEven() {
        int[] array = {1, 2, 4, 5, 10, 6, 3};
        int[] oddArray = RemoveIntFromArray.removeEven(array);
        assertThat(oddArray).contains(1, 3, 5);
    }

    @Test
    void testRemoveEvenWithEmptyArray() {
        int[] array = {};
        int[] oddArray = RemoveIntFromArray.removeEven(array);
        assertThat(oddArray).isEmpty();
    }
}
