import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
