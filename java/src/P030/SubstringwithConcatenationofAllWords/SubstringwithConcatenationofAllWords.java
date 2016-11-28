package P030.SubstringwithConcatenationofAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringwithConcatenationofAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (words == null || words.length == 0 || s.length() == 0) return res;
        int wordLen = words[0].length();
        int numWord = words.length;
        int windowLen = wordLen * numWord;
        int sLen = s.length();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);

        // Run wordLen scans
        for (int i = 0; i < wordLen; i++) {
            HashMap<String, Integer> curMap = new HashMap<>();
            // Move window in step of wordLen
            for (int j = i, count = 0, start = i; j + wordLen <= sLen; j += wordLen) {
                // count: number of exceeded occurences in current window
                // start: start index of current window of size windowLen
                if (start + windowLen > sLen) break;
                String word = s.substring(j, j + wordLen);
                if (!map.containsKey(word)) {
                    curMap.clear();
                    count = 0;
                    start = j + wordLen;
                } else {
                    // Remove previous word of current window
                    if (j == start + windowLen) {
                        String preWord = s.substring(start, start + wordLen);
                        start += wordLen;
                        int val = curMap.get(preWord);
                        if (val == 1) curMap.remove(preWord);
                        else curMap.put(preWord, val-1);
                        if (val - 1 >= map.get(preWord)) count--;
                    }
                    // Add new word
                    curMap.put(word, curMap.getOrDefault(word, 0) + 1);

                    // More than expected, increase count
                    if (curMap.get(word) > map.get(word)) count++;

                    // Check if current window valid
                    if (count == 0 && start + windowLen == j + wordLen) {
                        res.add(start);
                    }
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = new String[] {"foo", "bar"};
        System.out.println(SubstringwithConcatenationofAllWords.findSubstring(s, words));
    }
}
