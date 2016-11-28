# -*- coding: utf-8 -*-
class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """
        from collections import Counter
        from collections import defaultdict

        res = []
        if not words or len(words[0]) == 0 or len(s) == 0:
            return res
        word_len = len(words[0])
        num_words = len(words)
        window_len = word_len * num_words
        word_map = Counter(words)

        for i in range(word_len):
            cur_map = defaultdict(int)
            start, count = i, 0
            for j in range(i, len(s)-word_len+1, word_len):
                word = s[j:j+word_len]
                if word in word_map:
                    cur_map[word] += 1
                    count += 1
                    while cur_map[word] > word_map[word]:
                        cur_map[s[start:start+word_len]] -= 1
                        start += word_len
                        count -= 1
                    if count == num_words:
                        res.append(start)
                else:
                    cur_map.clear()
                    count = 0
                    start = j + word_len
        return res