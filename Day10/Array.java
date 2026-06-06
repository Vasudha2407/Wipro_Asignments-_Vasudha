package Day10;
import java.util.*;

public class Array {
	public static void main(String[] args) {
		ArrayList<Integer>arr1 = new ArrayList(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList(Arrays.asList(3, 4, 5, 6));

        ArrayList<Integer> merged = new ArrayList<>();

        for (Integer num : arr1) {
            if (!merged.contains(num)) {
                merged.add(num);
            }
        }

        for (Integer num : arr2) {
            if (!merged.contains(num)) {
                merged.add(num);
            }
        }

        System.out.println(merged);
		
	}

}
