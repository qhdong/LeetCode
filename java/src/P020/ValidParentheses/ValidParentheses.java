package P020.ValidParentheses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (map.containsKey(s.charAt(i))) {
                if (stack.size() == 0 || stack.pop() != map.get(s.charAt(i))) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }
}
