package application;

public class HeapSort {
	/** Heap sort method */
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		// Create a Heap of integers
		Heap<E> heap = new Heap<>();
	
		// Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);

		// Remove elements from the heap
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
		
		System.out.println("Comparisons: " + Heap.comps);
		System.out.println("Movements: " + Heap.moves);
	}
}
