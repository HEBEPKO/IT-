package ex_2.ex_2_2;

public class SearchSimple implements SearchText {
    private final String text;

    public SearchSimple(String text) {
        this.text = text;
    }

    @Override
    public int wordSearch(String wordStr) {
        int wordCount = 0;
        String[] words = text.split("\\^|\\s|\\.|,|\"");
        for (String word : words) {
            if (word.equalsIgnoreCase(wordStr)) {
                wordCount++;
            }
        }
        return wordCount;
    }
}