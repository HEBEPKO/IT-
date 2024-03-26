package ex_2.ex_2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchRegEx implements SearchText {
    private final String text;

    public SearchRegEx(String text) {
        this.text = text;
    }

    @Override
    public int wordSearch(String word) {
        int wordCount = 0;
        Pattern pattern = Pattern.compile("(?<!^)" + "(" + word + ")", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) wordCount++;
        return wordCount;
    }

}
