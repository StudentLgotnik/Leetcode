package org.mkaza.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] == nums[i]) {
                if (count < 2) {
                    k++;
                    nums[k] = nums[i];
                }
                count++;
            } else {
                k++;
                nums[k] = nums[i];
                count = 1;
            }
        }
        return k + 1;
    }

    public int removeDuplicatesBetter(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (j < nums.length) {
                if (nums[i] != nums[j - 2]) {
                    nums[j] = nums[i];
                    j++;
                }
            }
        }

        return j;
    }
}
