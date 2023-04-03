package application;
import java.io.*; 
import java.util.*; 

public class RadixSort { 
	
	static int comps = 0;
	static int moves = 0;
	
           static int getMax(Integer arr[], int n){ 
           int mx = arr[0]; 
           for (int i = 1; i < n; i++) 
                 if (arr[i] > mx) 
                        mx = arr[i]; 
           return mx; 
    } 
   static void countSort(Integer arr[], int n, int exp) {   
           int output[] = new int[n]; 
           int i; 
           int count[] = new int[10]; 
           Arrays.fill(count,0);
           for (i = 0; i < n; i++) 
    count[ (arr[i]/exp)%10 ]++;    
// Change count[i] so that it contains actual position of this digit in output[] 
           for (i = 1; i < 10; i++) {
                   count[i] += count[i - 1]; // Build the output array 
                   moves++;
           }
           for (i = n - 1; i >= 0; i--){
                   output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
                   count[ (arr[i]/exp)%10 ]--; 
                   moves++;
        }
           for (i = 0; i < n; i++) {
                   arr[i] = output[i]; 
                   moves++;
           }
    } 
   static void radixsort(Integer arr[], int n) { // Find the maximum number to know number of digits 
	   int m = getMax(arr, n);
	   for (int exp = 1; m/exp > 0; exp *= 10) {
		   countSort(arr, n, exp); 
	   }
	   System.out.println("Comparisons: " + comps);
	   System.out.println("Movements: " + moves);
    } 
   static void print(Integer arr[], int n)  { 
        for (int i=0; i<n; i++) 
               System.out.print(arr[i]+" "); 
    } 
    public static void main (String[] args) {
         Integer arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
         int n = arr.length; 
         radixsort(arr, n); 
         print(arr, n); 
    } 
}

