class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int[] results = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        // int result = 1;
        // for (int j = 0; j < nums.length; j++) {
        // if (i != j) {
        // result *= nums[j];
        // }
        // }
        // results[i] = result;
        // }

        // return results;

        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        int l = 1;
        int r = 1;

        for (int i = 0; i < nums.length; i++) {
            int j = nums[nums.length - 1 - i];
            leftArray[i] = l;
            l *= nums[i];
            rightArray[nums.length - 1 - i] = r;
            r *= j;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rightArray[i] * leftArray[i];
        }

        return nums;
    }
}

/**
 * Leetcode238
 */
public class Leetcode238 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(solution.productExceptSelf(nums));
    }
}