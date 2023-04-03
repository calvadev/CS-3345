package application;

public class SelectionSort {
	
	static int comps = 0;
	static int moves = 0;
	
	/** The method for sorting the numbers */
	public static void selectionSort(Integer[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
					moves++;
				}
				comps++;
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				moves++;
			}
		}
		System.out.println("Comparisons: " + comps);
		System.out.println("Movements: " + moves);
	}
}
