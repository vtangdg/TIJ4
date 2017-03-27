package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.Print.print;

/**
 * Created by degang on 16/11/13.
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        String[] strings = {"abc", "abcabcdefabc"};
        for (String s : strings) {
            print("Regular Expression: \"" + s + "\"");
            Pattern p = Pattern.compile(strings[0]);
            Matcher m = p.matcher(strings[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\"" + "at positions " + m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
