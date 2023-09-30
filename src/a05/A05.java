package a05;

import java.util.Random;

public class A05 {
	
	// The Mystery file contains four static methods: sort 1, sort2, sort3, and sort4. 

	//
	
	
	public static void main(String[] args) {
		int[] values = {1,1,22,22,1,2,3,4};
		ObjectArray[] array = ObjectArray.createArray(values);

		for(ObjectArray arr : array) {
			System.out.println(arr);
		}
		System.out.println();
		Mystery.sort1(array);
		for(ObjectArray arr : array) {
			System.out.println(arr);
		}
		
		
		
	classifySortinTime();
	
	}





	private static void classifySortinTime() {
		ObjectArray[] randomArray = ObjectArray.generateRandomArray(1000);
		// Sort 1 time test. 
		long startTime = System.currentTimeMillis();
		Mystery.sort1(randomArray);
		long endTime = System.currentTimeMillis();
		long elapsedTimeMs= endTime - startTime;
		double sort1Time = (double) elapsedTimeMs / 1000;
		System.out.println("Sort1 took: " + sort1Time + " Seconds");
		// Sort 2 time test
		startTime = System.currentTimeMillis();
		Mystery.sort2(randomArray);
		endTime = System.currentTimeMillis();
		elapsedTimeMs= endTime - startTime;
		double sort2Time = (double) elapsedTimeMs / 1000;
		System.out.println("Sort2 took: " + sort2Time + " Seconds");
		//Sort 3 time test
		startTime = System.currentTimeMillis();
		Mystery.sort3(randomArray);
		endTime = System.currentTimeMillis();
		elapsedTimeMs= endTime - startTime;
		double sort3Time = (double) elapsedTimeMs / 1000;
		System.out.println("Sort3 took: " + sort3Time + " Seconds");
		// Sort 4 time test
		startTime = System.currentTimeMillis();
		Mystery.sort4(randomArray);
		endTime = System.currentTimeMillis();
		elapsedTimeMs= endTime - startTime;
		double sort4Time = (double) elapsedTimeMs / 1000;
		System.out.println("Sort4 took: " + sort4Time + " Seconds");
		
	}
	
	
	
	
	
	//Mystery.sort1(generateRandomNumbers(1000));
	
	public static int[] generateRandomNumbers(int size) {
        int[] randomNumbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = rand.nextInt(); // Generates a random integer
        }

        return randomNumbers;
    }
	
	/* test for speed of soring algorithms using time. 
	 * get time variable. Compare it. Then the slowest times will
	 * be Insertion or selection.
	 * 
	 *  Part 1: Compare the time it takes to sort a large randomly generated
	 *  array. 
	 *  
	 *  
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
