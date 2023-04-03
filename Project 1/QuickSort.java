package application;

public class QuickSort {
	
	static int comps = 0;
	static int moves = 0;
	
	public static void quickSort(Integer[] list) {
		quickSort(list, 0, list.length - 1);
		System.out.println("Comparisons: ");
		System.out.println("Movements: ");
	}

	public static void quickSort(Integer[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	/** Partition the array list[first..last] */
	public static int partition(Integer[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search

		while (high > low) {
			// Search forward from left
			while (low <= high && list[low] <= pivot) {
				low++;
				comps++;
			}

			// Search backward from right
			while (low <= high && list[high] > pivot) {
				high--;
				comps++;
			}

			// Swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
				moves++;
			}
		}

		while (high > first && list[high] >= pivot) {
			high--;
			comps++;
		}

		// Swap pivot with list[high]
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			comps++;
			moves++;
			return high;
		} else {
			comps++;
			return first;
		}
	}
}
