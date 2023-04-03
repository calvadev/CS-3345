package application;

public class MergeSort {
	
	static int comps = 0;
	static int moves = 0;
	
	/** The method for sorting the numbers */
	public static void mergeSort(Integer[] list) {
		if (list.length > 1) {
			// Merge sort the first half
			Integer[] firstHalf = new Integer[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2); 
			mergeSort(firstHalf);

			// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			Integer[] secondHalf = new Integer[secondHalfLength];
			System.arraycopy(list, list.length / 2,
					secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);

			// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
		System.out.println("Comparisons: " + comps);
		System.out.println("Movements: " + moves);
	}

	/** Merge two sorted lists */
	public static void merge(Integer[] list1, Integer[] list2, Integer[] temp) {
		int current1 = 0; // Current index in list1
		int current2 = 0; // Current index in list2
		int current3 = 0; // Current index in temp

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2]) {
				temp[current3++] = list1[current1++];
				comps++;
				moves++;
			} else {
				temp[current3++] = list2[current2++];
				comps++;
				moves++;
			}
		}

		while (current1 < list1.length) {
			temp[current3++] = list1[current1++];
			moves++;
		}

		while (current2 < list2.length) {
			temp[current3++] = list2[current2++];
			moves++;
		}
	}
}
