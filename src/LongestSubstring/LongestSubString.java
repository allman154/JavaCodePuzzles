package LongestSubstring;

import java.util.HashSet;

public class LongestSubString {

    public LongestSubString() {

    }

    public int findLongestSubstring(String inString) {
        int right = 0;
        int left = 0;
        int maxLength = 0;
        HashSet<Character> characterSet = new HashSet<>();

        while (right < inString.length()) {
            Character subChar = inString.charAt(right);

            if (!characterSet.contains(subChar)) {
                characterSet.add(subChar);
                maxLength = Math.max(maxLength, characterSet.size()); // determine to log current length or new length.
                right++; // move right -> right
            } else {
                characterSet.remove(inString.charAt(left)); // remove the character at the left most end.
                left++; // move left -> right
            }
        }
        return maxLength;
    }
}
