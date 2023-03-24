package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionary) {
        List<Map<String, String>> newListofBooks = new ArrayList<>();
        for (var i = 0; i < books.size(); i++){
            Map<String, String> book = books.get(i);
            if (App.isValuesEquals(book, dictionary)) {
                newListofBooks.add(book);
            }
        }
        return newListofBooks;
    }


    public static boolean isValuesEquals(Map<String, String> firstMap, Map<String, String> secondMap) {
        List<String> listForFirst = new ArrayList<>();
        String emptyString = "";

        for (Map.Entry<String, String> bk: firstMap.entrySet()) {
            emptyString = bk.getValue();
            listForFirst.add(emptyString);

        }
        List<String> listForSecond = new ArrayList<>();
        String emptyString1 = "";

        for (Map.Entry<String, String> wh: secondMap.entrySet()) {
            emptyString1 = wh.getValue();
            listForSecond.add(emptyString1);

        }
        return listForFirst.containsAll(listForSecond);
    }
}
//END
