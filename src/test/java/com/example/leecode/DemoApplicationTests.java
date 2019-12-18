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


}
