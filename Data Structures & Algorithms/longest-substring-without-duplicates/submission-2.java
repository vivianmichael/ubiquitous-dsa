
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            Set<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                // Stop if duplicate is found
                if (set.contains(s.charAt(j))) {
                    break;
                }

                // Remember the character
                set.add(s.charAt(j));

                // Calculate current valid substring length
                int len = j - i + 1;

                // Update maximum length
                max = Math.max(len, max);
            }
        }

        return max;
    }
}
