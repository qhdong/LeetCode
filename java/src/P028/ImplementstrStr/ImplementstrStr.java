package P028.ImplementstrStr;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        for (int i = 0; true; i++) {
            for (int j = 0; true; j++) {
                if (j == needle.length()) return i;
                if (i+j == haystack.length()) return -1;
                if (haystack.charAt(i+j) != needle.charAt(j)) break;
            }
        }
    }
}
