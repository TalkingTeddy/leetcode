class Solution {
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            
            for (int j = i; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}

public class Leetcode977 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { -4,-1,0,3,10 };
        // System.out.println(solution.sortedSquares(nums));
        for (int i : solution.sortedSquares(nums)) {
            System.out.println(i);
        }
    }
}