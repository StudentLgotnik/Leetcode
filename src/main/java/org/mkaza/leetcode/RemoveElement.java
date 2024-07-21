package org.mkaza.leetcode;

//https://leetcode.com/problems/remove-element/description/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int lastIndex = nums.length - 1;
        int k = 0;
        while (k <= lastIndex) {
            if (nums[k] == val) {
                nums[k] = nums[lastIndex];
                nums[lastIndex] = -1;
                lastIndex--;
            } else {
                k++;
            }
        }
        return k;
    }
}
