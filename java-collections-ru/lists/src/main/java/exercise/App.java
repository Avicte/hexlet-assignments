package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        String[] lettersArr = letters.toLowerCase().split("");
        String[] wordsArr = word.toLowerCase().split("");

        List<String> wordList = new ArrayList<>(Arrays.asList(wordsArr));

        for (var i = 0; i < lettersArr.length; i++) {
            if (wordList.contains(lettersArr[i])) {
                wordList.remove(lettersArr[i]);
            }
        }
        return wordList.isEmpty();
    }
}
//END
