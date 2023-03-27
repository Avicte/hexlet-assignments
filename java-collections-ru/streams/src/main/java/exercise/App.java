package exercise;

import java.util.List;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> list) {
        long count = list.stream()
                .map(x -> x.split("@"))
                .map(x -> x[1])
                .filter(host -> host.equals("yandex.ru") || host.equals("gmail.com") || host.equals("hotmail.com"))
                .count();
        return count;
    }
}

// END