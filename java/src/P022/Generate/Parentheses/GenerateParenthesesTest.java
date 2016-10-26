package P022.Generate.Parentheses;

import org.junit.Test;

import java.util.List;

import static P022.Generate.Parentheses.GenerateParentheses.*;
import static org.junit.Assert.*;

public class GenerateParenthesesTest {
    @Test
    public void generateParenthesisTest() throws Exception {
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }

}