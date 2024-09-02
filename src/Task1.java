import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> oddNumbers = new HashSet<>();

        for (int num : nums) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        for (int oddNum : oddNumbers) {
            System.out.println(oddNum);
        }
    }
}
