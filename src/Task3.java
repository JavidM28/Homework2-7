import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple", "pomegranate"));
        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
