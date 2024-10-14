import java.util.HashMap;
import java.util.HashSet;

// Approach 1 : Create a hashmap and whenever there is an already existing key then abort.
// Approach 2 : Sort the array itself and check if next index is same as the initial one then abort.
// Approach 3 : Create a hashset and when a duplicate insertion is happening then abort.

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // HashMap map = new HashMap<Integer, Integer>();

        // for (int num : nums) {
        // if (map.get(num) == null) {
        // map.put(num, 1);
        // } else {
        // return true;
        // }
        // }

        // return false;

        HashSet map = new HashSet();

        for (int num : nums) {
            if (map.add(num) == false) {
                return true;
            }
        }

        return false;
    }
}

/**
 * Leetcode217
 */
public class Leetcode217 {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(nums));
    }
}