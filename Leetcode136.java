class Solution {
    public int singleNumber(int[] nums) {

        int r = 0;

        for (int i : nums) {
            r ^= i;
        }

        return r;
    }
}

class Leetcode136 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] { 5, 1, 2, 1, 2 };
        System.out.println(solution.singleNumber(nums));
    }
}