package com.github.cvallejosh1.arrays;

/* In this problem, given two sorted arrays,
 * you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) method,
 * which returns an array consisting of all elements of both arrays in a sorted way.
 */
public class MergeSortedArrays {

    /* O(n+m) n-> arr1.length, m-> arr2.length
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] resultArray = new int[arr1.length + arr2.length];
        int i=0, j=0, index=0;

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] <= arr2[j]) {
                resultArray[index++] = arr1[i++];
            } else {
                resultArray[index++] = arr2[j++];
            }
        }

        while (i<arr1.length) {
            resultArray[index++] = arr1[i++];
        }

        while (j<arr2.length) {
            resultArray[index++] = arr2[j++];
        }

        return resultArray;
    }
}
