package com.github.cvallejosh1.arrays;

/* In this problem, you have to implement the int [] removeEven(int[] arr) method,
 * which removes all the even elements from the array
 * and returns back updated array.
 */
public class RemoveIntFromArray {

    // Time complexity: O(n)
    public static int[] removeEven(int[] arr) {
        int oddArraySize = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                oddArraySize++;
            }
        }

        int[] arrResult = new int[oddArraySize];
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 != 0) {
                arrResult[index++] = arr[i];
            }
        }

        return arrResult;
    }
}
