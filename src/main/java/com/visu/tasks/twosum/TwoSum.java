package com.visu.tasks.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);

        if (result != null)
        for (int resItem : result) {
            System.out.println(resItem);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int index = 0; index < nums.length; index++) {
            if (numMap.containsKey(target - nums[index])) {
                return new int[] {numMap.get(target - nums[index]), index};
            }
            numMap.put(nums[index], index);
        }
        return null;
    }
}
