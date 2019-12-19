package com.example.leecode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testRemoveDuplicateItem() {
	    int[] nums = {0,0,1,1,2,2,2,3};
        int totals = RemoveDuplicateItem.removeDuplicates(nums);
        System.out.println("totals:" + totals );
        for (int i = 0; i < totals; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    @Test
    void testRotateArray1() {
        int[] nums = {0,2,3,4,5,6,7,8};
        RotateArray.rotateSolution1(nums, 2);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    @Test
    void testRotateArray2() {
        int[] nums = {0,2,3,4,5,6,7,8};
        RotateArray.rotateSolution2(nums, 2);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    @Test
    void testRotateArray3() {
        int[] nums = {0,2,3,4,5,6,7,8};
        RotateArray.rotateSolution3(nums, 2);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

}
