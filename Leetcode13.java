import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            // System.out.println(s.charAt(i) + " " + m.get("" + s.charAt(i)));
            if (i > 0 && m.get("" + s.charAt(i)) > m.get("" + s.charAt(i - 1))) {
                sum += m.get("" + s.charAt(i)) - m.get("" + s.charAt(i - 1));
                i--;
            } else {
                sum += m.get("" + s.charAt(i));
            }
        }
        return sum;
    }
}

public class Leetcode13 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
