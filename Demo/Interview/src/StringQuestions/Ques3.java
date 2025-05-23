package StringQuestions;

import java.util.List;
import java.util.Optional;

public class Ques3 {

	
	//Find and Optional:
	//
	//Find the first even number from a list of integers. If no even number is found, return 0.
	public static void main(String args[]) {
        var l3 = List.of(1, 5, 8, 12, 3, 4, 8, 17);
        int result = find(l3);

        System.out.println(result);
    }

    private static int find(List<Integer> values) {
        Optional<Integer> op1 = values.stream()
                .filter(i -> i % 2 == 0)
                .findFirst();

        return op1.orElse(0);
    }

}
