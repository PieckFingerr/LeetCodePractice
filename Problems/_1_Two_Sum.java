package Problems;

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if (myMap.containsKey(complement)){
                return new int[]{myMap.get(complement), i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{}; // No solution found
    }
}