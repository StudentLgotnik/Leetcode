package org.mkaza.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = Arrays.copyOf(nums1, m);
        for (int i = 0, j = 0; i + j < m + n;) {
            if (safeGetInt(copy, i) <= safeGetInt(nums2, j)) {
                nums1[i + j] = copy[i];
                i++;
            }
            else {
                nums1[i + j] = nums2[j];
                j++;
            }
        }
    }
    
    private int safeGetInt(int[] arr, int index) {
        if (index < arr.length) {
            return arr[index];
        } else {
            return Integer.MAX_VALUE;
        }
    }
}
