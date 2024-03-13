package timepass_array;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElemntsCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		List listWithDuplicates = new ArrayList();
		listWithDuplicates.add(1);
		listWithDuplicates.add(2);
		listWithDuplicates.add(3);
		listWithDuplicates.add(2);
		listWithDuplicates.add(4);
		listWithDuplicates.add(1);

		System.out.println("List with duplicates: " + listWithDuplicates);
		System.out.print("Duplicate element is ");
		for (int i = 0; i < listWithDuplicates.size(); i++) {
			for (int j = i + 1; j < listWithDuplicates.size(); j++) {
				if (listWithDuplicates.get(i).equals(listWithDuplicates.get(j))) {
					count = count + 1;
					System.out.print(listWithDuplicates.get(j) + " ");
				}
			}
		}
		System.out.println(" ");
		System.out.println("Total duplicate element is : " + count);
	}

}
