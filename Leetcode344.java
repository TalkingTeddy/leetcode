import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {

        for (int i = 0; i < s.length; i++) {
            // System.out.println(s.length);
            if ((s.length - (1 + i)) == i || ((s.length - (1 + i)) - i) < 0) {
                break;
            }

            char temp = ' ';

            temp = s[s.length - (1 + i)];
            s[s.length - (1 + i)] = s[i];
            s[i] = temp;

        }
    }
}

/**
 * Leetcode344
 */
public class Leetcode344 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        char[] chars = { 'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a',
                'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a' };
        solution.reverseString(chars);

    }
}