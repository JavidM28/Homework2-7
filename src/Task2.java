import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> evenNumbers = new TreeSet<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        for (int evenNum : evenNumbers) {
            System.out.println(evenNum);
        }
    }
}
