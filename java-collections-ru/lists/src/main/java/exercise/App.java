package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        //String[] lettersArr = letters.toLowerCase().split("");
        //String[] wordsArr = word.toLowerCase().split("");

        var anyWord = word.toLowerCase();
        char[] argsArray = letters.toCharArray();
        char[] wordArray = anyWord.toCharArray();
        List<Character> listLetters = new ArrayList<>();
        List<Character> listWord = new ArrayList<>();

        boolean result = true;
        for (var str: listWord) {
            if (!listLetters.contains(str)) {
                result = false;
                break;
            }
            else  {
                listLetters.remove(str);
            }
        }
        return result;
    }
}
//END
