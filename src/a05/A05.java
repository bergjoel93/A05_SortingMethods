package a05;

import java.util.Random;

public class A05 {
	
	// The Mystery file contains four static methods: sort 1, sort2, sort3, and sort4. 

	//
	
	
	public static void main(String[] args) {
		int[] values = {1,2,3,4,5};
		ObjectArray[] array = ObjectArray.createArray(values);

		for(ObjectArray arr : array) {
			System.out.println(arr);
		}
		System.out.println();
		Mystery.sort1(array);
		for(ObjectArray arr : array) {
			System.out.println(arr);
		}
	}
	
	/* test for speed of soring algorithms using time. 
	 * get time variable. Compare it. Then the slowest times will
	 * be Insertion or selection. 
	 * 
	 * create a method that checks for stability
	 * checks to make sure that algorithms are stable 
	 * by using an array with duplicates {1,1,1,2,2,2) then 
	 * checkin to see if their key values have shifted at all.
	 * If their key values have shifted then then it's not stable. 
	 * 
	 * 
	 * Create a method that classifies them. 
	 * 
	 */
}
/*
 * Notes
 * Insertion and Selection will always be slower 
 * MergeSort BigO is nlogn and is stable and is fast with already sorted data
 * QuickSort BigO is n*n and not stable already sorted data is slower than sorted
 * InsertionSort is n*n and is stable
 * SelectionSort is n*n and is not stable
 * 
 * 
 * 
 * */
