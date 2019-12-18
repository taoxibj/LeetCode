package com.example.leecode;

public class RemoveDuplicateItem {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int back = 0;
        for (int front = 1; front < nums.length; front++) {
            if (nums[back] != nums[front]) {
                back++;
                nums[back] = nums[front];
            }
        }
        return back + 1;
    }

}
