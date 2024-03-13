package timepass_array;

import java.util.*;

public class FindDuplicates {

	public static void main(String[] args) {
		// Create a list with duplicate elements
		List<Integer> listWithDuplicates = new ArrayList<>();
		listWithDuplicates.add(1);
		listWithDuplicates.add(2);
		listWithDuplicates.add(3);
		listWithDuplicates.add(2);
		listWithDuplicates.add(4);
		listWithDuplicates.add(1);

		System.out.println("List with duplicates: " + listWithDuplicates);

	
		Set<Integer> uniqueElements = new HashSet<>(listWithDuplicates);
		System.out.println("Unique elements only " + uniqueElements);
	
	}
}
