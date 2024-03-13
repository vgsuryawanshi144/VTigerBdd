package timepass_array;

import java.util.*;

public class UniqueElementOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueElementOfArrays us = new UniqueElementOfArrays();
		us.removeDuplicate();
	}

	public void removeDuplicate() {
		int a[] = { 1, 1, 5, 7, 3, 6, 6, 2, 4, 3, 3, 5, 6, 3, 3 };
		int b = a.length;
		Set hash_set = new HashSet();
		for (int i = 0; i < b; i++) {
			hash_set.add(a[i]);

		}
		System.out.println(hash_set);
	}

}
