package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static Map getWordCount(String text) {
        if (text.length() == 0) {
            Map<String, String> emptyHash = new HashMap<>();
            return emptyHash;
        }

        String[] splitText = text.split(" ");
        Map<String, Integer> hashText = new HashMap<>();

        for (var i = 0; i < splitText.length; i++) {
            hashText.put(splitText[i], App.wordCount(splitText, splitText[i]));
        }
        return hashText;
    }

    public static String toString(Map<String, Integer> slovar) {
        if (slovar.size() == 0) {
            return "{}";
        }
        var result = new StringBuilder();
        result.append("{");
        for (String s : slovar.keySet()) {
            result.append("\n  " + s + ": " + slovar.get(s));
        }
        result.append("\n}");
        return result.toString();
    }

    public static int wordCount(String[] textArr, String slovo) {
        int count = 0;
        for (var str: textArr) {
            if (str.equals(slovo)) {
                count += 1;
            }
        }
        return count;
    }
}
