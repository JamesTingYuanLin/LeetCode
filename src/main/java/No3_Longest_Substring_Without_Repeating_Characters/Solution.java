package No3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int lengthOfLongestSubstring(String input) {
        if(input == "") {
            return 0;
        }

        String[] arr = input.split("");
        Set<String> set = new HashSet<String>();
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            set.clear();
            int len = 0;
            for (int j = i; j < arr.length; j++) {
                if (!set.contains(arr[j])) {
                    set.add(arr[j]);
                    len++;
                } else {
                    break;
                }
            }
            if (len > maxLength) {
                maxLength = len;
            }
        }
        return maxLength;
    }
}