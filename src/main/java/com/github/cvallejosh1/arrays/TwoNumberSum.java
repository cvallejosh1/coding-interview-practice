package com.github.cvallejosh1.arrays;

import java.util.HashMap;
import java.util.Map;

/* Given an array of integers <nums> and an integer <target>,
 * returns indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 */
public class TwoNumberSum {

    /*
        Time complexity: O(n^2)
        Space complexity: O(1)
     */
    public static int[] solution1(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j=i+1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    return new int[] { nums[i], complement };
                }
            }
        }
        return new int[0];
    }

    /*
       Time complexity: O(n)
       Space complexity: O(n)
    */
    public static int[] optimizedSolution(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (complementMap.get(currentValue) == null) {
                int complement = target - currentValue;
                complementMap.put(complement, currentValue);
            } else {
                return new int[] {complementMap.get(currentValue), currentValue};
            }
        }
        return new int[0];
    }

}
