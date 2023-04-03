package application;

public class InsertionSort {
	
	/** The method for sorting the numbers */
	public static void insertionSort(Integer[] list) {
		int comps = 0;
		int moves = 0;
		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that list[0..i] is sorted. */
			int currentElement = list[i];
			int k;
			for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
				list[k + 1] = list[k];
				comps++;
				moves++;
			}

			// Insert the current element into list[k + 1]
			list[k + 1] = currentElement;
			comps++;
		}
		System.out.println("Comparisons: " + comps);
		System.out.println("Movements: " + moves);
	}
}
