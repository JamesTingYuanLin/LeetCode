import No15_3Sum.Solution;

import java.util.*;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * s and t consist of lowercase English letters.
 */
public class Visenze {
    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";

        String s = "rat";
        String t = "car";

//        int sizeOfS = s.length();
//        int sizeOfT = t.length();

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();

        for (char c : sChar) {
            putToMap(sMap, new Character(c));
        }
        for (char c : tChar) {
            putToMap(tMap, new Character(c));
        }

        if (sMap.equals(tMap)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    private static void putToMap(Map<Character, Integer> map, Character c) {
        if (map.get(c) == null) {
            map.put(c, 1);
        } else {
            int oldCount = map.get(c);
            map.put(c, oldCount + 1);
        }
    }

}
