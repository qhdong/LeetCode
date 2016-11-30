package P032.LongestValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ret = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                ret = Math.max(ret, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return ret;
    }
}
