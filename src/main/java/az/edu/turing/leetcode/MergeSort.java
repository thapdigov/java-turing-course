package az.edu.turing.leetcode;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {1, 5, 4, 2, 9, 86, 78};
        int[] b = {2, 4, 4, 5, 8, 15, 17};

        int[] mergeSort = mergeSort(a, b);
        for (int i : mergeSort) {
            System.out.print(i + " ");
        }

    }


    public static int[] mergeSort(int[] list1, int[] list2) {

        Arrays.sort(list1);
        Arrays.sort(list2);

        int length1 = list1.length;
        int length2 = list2.length;

        int[] mergeArray = new int[length1 + length2];

        int i = 0, j = 0, k = 0;

        while (i < length1 && j < length2) {
            if (list1[i] <= list2[j]) {
                mergeArray[k++] = list1[i++];
            } else {
                mergeArray[k++] = list2[j++];

            }
        }
        while (i < length1) {
            mergeArray[k++] = list1[i++];
        }
        while (j < length2) {
            mergeArray[k++] = list2[j++];
        }

        return mergeArray;


    }
}
