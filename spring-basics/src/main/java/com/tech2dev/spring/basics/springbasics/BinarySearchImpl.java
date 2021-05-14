package com.tech2dev.spring.basics.springbasics;

import java.util.Arrays;

public class BinarySearchImpl {

	/**
	 * Just a dummy algo method
	 * @param numbers
	 * @param numberToSearchFor
	 * @return
	 */
	public int binarySearch(int[] numbers,int numberToSearchFor) {

		System.out.println("numbers passed : "+Arrays.toString(numbers));
		//Implement sort logc : Could be buuble sort, or quick sort
		int[] sortedNumbers =null;
		
		//If sort algo needed is bubble sort
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println("numbers sorted using bubbleSort : "+Arrays.toString(sortedNumbers));
		
		//If sort algo needed is quick sort
		QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
		sortedNumbers = quickSortAlgorithm.sort(numbers);
		System.out.println("numbers sorted using quickSort : "+Arrays.toString(sortedNumbers));
		
		//Note : We need to execute any 1 of above sort methods, but that cannot be decided at runtime
		//So everytime we need to switch the sort algo to be used, we need to modify this SearchImpl class
		//Hence it is tightly coupled code

		//Implement search logic

		return 3;
	}

}
