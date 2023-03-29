package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> list) {
        return list.stream()
                .filter(male -> male.get("gender").equals("male"))
                .sorted((male1,male2) -> male1.get("birthday").compareTo(male2.get("birthday")))
                .map(x -> x.get("name"))
                .collect(Collectors.toList());
    }
}
// END
