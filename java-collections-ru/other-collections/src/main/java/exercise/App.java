package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> first, Map<String, Object> second) {
        Set<String> allKeys = new HashSet<>(first.keySet());
        allKeys.addAll(second.keySet());
        List<String> sortedKeys = new ArrayList<>(allKeys);
        Collections.sort(sortedKeys);
        LinkedHashMap<String, String> diff = new LinkedHashMap<>();
        for (String key : sortedKeys) {
            if (!first.containsKey(key)) {
                diff.put(key, "added");
            } else if (!second.containsKey(key)) {
                diff.put(key, "deleted");
            } else if (!Objects.equals(first.get(key), second.get(key))) {
                diff.put(key, "changed");
            } else {
                diff.put(key, "unchanged");
            }
        }
        return diff;
    }
}
//END
