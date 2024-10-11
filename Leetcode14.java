class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String commonPrefix = strs[0];
        int i = 0;
        while (i < strs.length) {
            if (strs[i].length() < commonPrefix.length())
                commonPrefix = strs[i];

            i++;
        }

        i = 0;
        while (i < commonPrefix.length()) {

            for (String string : strs) {
                if (string.charAt(i) != commonPrefix.charAt(i)) {

                    return commonPrefix.substring(0, i);
                }
            }

            i++;
        }

        return commonPrefix;
    }
}

/**
 * Leetcode14
 */
public class Leetcode14 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(solution.longestCommonPrefix(strs));
    }
}