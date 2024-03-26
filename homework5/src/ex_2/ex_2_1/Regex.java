package ex_2.ex_2_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    final String REGEX;
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Regex(String REGEX, String string) {
        this.REGEX = REGEX;
        this.string = string;
    }

    public void printable(){
        final Pattern pattern = Pattern.compile(REGEX);
        final Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println("Полное соответствие: (" + matcher.group(0) + ")");
        }
    }
}
