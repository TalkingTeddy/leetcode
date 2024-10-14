import java.util.*;

class Solution {
    /**
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap set = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (set.get(s.charAt(i)) == null) {
                set.put(s.charAt(i), 1);
            } else {
                set.put(s.charAt(i), (int) set.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!set.containsKey(t.charAt(i)))
                return false;

            int value = (int) set.get(t.charAt(i)) - 1;
            // System.err.println(set.get(t.charAt(i)) + " " + value);

            if (value == 0) {
                set.remove(t.charAt(i));
            } else {
                set.put(t.charAt(i), value);
            }
        }

        if (set.size() == 0) {
            return true;
        }

        // Iterator setIterator = set.entrySet().iterator();

        // while (setIterator.hasNext()) {
        // Map.Entry iter = (Map.Entry) setIterator.next();

        // System.err.println(iter.getKey() + " " + iter.getValue());
        // }

        return false;
    }
}

/**
 * Leetcode242
 */
public class Leetcode242 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        ;
    }
}