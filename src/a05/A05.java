package a05;

import java.util.Random;

public class A05 {
	
	// The Mystery file contains four static methods: sort 1, sort2, sort3, and sort4. 

	//
	
	
	public static void main(String[] args) {
		
		ObjectArray[] array = ObjectArray.generateObjects(10);
		
		for(ObjectArray arr : array) {
			System.out.println(arr);
		}
		
		
		
	}
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
