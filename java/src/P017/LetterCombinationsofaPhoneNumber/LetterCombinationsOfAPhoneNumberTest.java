package P017.LetterCombinationsofaPhoneNumber;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static P017.LetterCombinationsofaPhoneNumber.LetterCombinationsOfAPhoneNumber.letterCombinations;

public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void letterCombinationsTest() throws Exception {
        String digits = "23";
        List<String> out = new LinkedList<String>() {{
            push("ad");
            push("ae");
            push("af");
            push("bd");
            push("be");
            push("bf");
            push("cd");
            push("ce");
            push("cf");
        }};
    }

}