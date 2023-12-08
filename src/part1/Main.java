package part1;

public class Main {
    public static String operationsOnStrings(String text, String replacement, int length) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() == length) {
                result.append(replacement);
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
