class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();

        for (int i = 0; i < word1.length(); i++) {
            mergedString.append(word1.charAt(i));

            for (int j = i; j < word2.length(); j++) {
                mergedString.append(word2.charAt(j));

                if (j == word1.length() - 1 && word2.length() > word1.length()) {
                    // System.out.println(word2.substring(j + 1) + " " + word2.length() + " " + word1.length());
                    mergedString.append(word2.substring(j + 1));
                }
                break;
            }
        }
        return mergedString.toString();
    }
}

class Leetcode1768 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abcdefgh", "pqrs"));
    }
}