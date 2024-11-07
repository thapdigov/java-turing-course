package az.edu.turing.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] a = new int[]{5, 7, 9, 4, 6};
        System.out.println(Arrays.toString(twoSum(a, 11)));

    }


    public static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            int complement = target - array[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(array[i], i);
        }

        throw new IllegalArgumentException("There is no solution!");

    }
}
