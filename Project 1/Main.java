package application;
import java.util.*;

public class Main {
	
	public static final int N = 50000;

	public static void main(String[] args) {
		
		//InOrder Array
		Integer[] arr = new Integer[N];
		for (int a = 0; a < N; a++) {
		    arr[a] = a + 1;
		}
		
		System.out.println("InOrder Insertion");
		long startTime = System.currentTimeMillis();
		InsertionSort.insertionSort(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("InOrder Selection");
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arr);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("InOrder Quick");
		startTime = System.currentTimeMillis();
		QuickSort.quickSort(arr);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		//ReverseOrder Array
		Integer[] arrReverse = new Integer[N];
		for (int a = 0; a < N; a++) {
		    arrReverse[a] = N - a;
		}
		
		System.out.println("ReverseOrder Insertion");
		startTime = System.currentTimeMillis();
		InsertionSort.insertionSort(arrReverse);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("RevereseOrder Selection");
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arrReverse);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("ReverseOrder Quick");
		startTime = System.currentTimeMillis();
		QuickSort.quickSort(arrReverse);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		//AlmostOrder Array
		int temp = arr[N-1];
		arr[N-1] = arr[0];
		arr[0] = temp;
		
		System.out.println("AlmostOrder Insertion");
		startTime = System.currentTimeMillis();
		InsertionSort.insertionSort(arr);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("AlmostOrder Selection");
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arr);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("AlmostOrder Quick");
		startTime = System.currentTimeMillis();
		QuickSort.quickSort(arr);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		//RandomOrder Array
	    Integer[] arrRandom = new Integer[N];
	    for (int i = 0; i < N; ++i)
        {
            arrRandom[i] = i;
        }
	    Random randomGenerator = new Random();
        int randomIndex;
        int randomValue;
        for(int i = 0; i < N; ++i)
        {
             randomIndex = randomGenerator.nextInt(N);

             randomValue = arrRandom[randomIndex];
             arrRandom[randomIndex] = arrRandom[i];
             arrRandom[i] = randomValue;
        }
	    
		System.out.println("RandomOrder Insertion");
		startTime = System.currentTimeMillis();
		InsertionSort.insertionSort(arrRandom);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("RandomOrder Selection");
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arrRandom);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
		System.out.println("RandomOrder Quick");
		startTime = System.currentTimeMillis();
		QuickSort.quickSort(arrRandom);
		endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime) + " ms\n");
		
	}

}
