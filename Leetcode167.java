class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];

        int l = 0;
        int r = 0;

        while (l < numbers.length) {

            if (target == numbers[0] + numbers[1]) {
                array[0] = 1;
                array[1] = 2;
            }

            if (target == numbers[l] + numbers[r] && l != r) {
                array[0] = r + 1;
                array[1] = l + 1;
                break;
            }

            r++;
            if (r == numbers.length - 1) {
                r = 0;
                l++;
            }
        }

        return array;
    }
}

/**
 * Leetcode167
 */
public class Leetcode167 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] numbers = { 1, 2, 3, 4, 4, 9, 56, 90 };
        solution.twoSum(numbers, 8);
    }
}