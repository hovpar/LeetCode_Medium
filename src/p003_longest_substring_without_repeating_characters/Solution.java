package p003_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> seen = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                char current = s.charAt(j);

                if (seen.contains(current)) {
                    break;
                }

                seen.add(current);
                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}
