package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * O(N^2)
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int length = nums.length;
            int[] answer = null;

            for (int i=0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (nums[i] + nums[j] == target) {
                        answer = new int[]{i, j};
                        break;
                    }

                }
            }

            return answer;

        }
    }


    /**
     * O(N)
     */
    class EnhancedSolution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numMap = new HashMap<>();
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[]{numMap.get(complement), i};
                }
                numMap.put(nums[i], i);
            }

            return new int[]{}; // No solution found
        }
    }

}
