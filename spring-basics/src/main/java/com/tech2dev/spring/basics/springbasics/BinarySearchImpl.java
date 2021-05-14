package com.tech2dev.spring.basics.springbasics;

import java.util.Arrays;

/**
 * Class to demonstrate tightly coupled vs Loosely coupled code
 * @author macho
 *
 */

public class BinarySearchImpl {

	//Programming to Interface, declared an interface implemented by both sorting logic classes
	private SortAlgorithm sortAlgrithm;

	//the required sortAlgrithm object is created and passed to the constructor from outside, while creating onject of this class
	public BinarySearchImpl(SortAlgorithm sortAlgrithm) {
		super();
		this.sortAlgrithm = sortAlgrithm;
	}

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

		/**
		 * Loosely coupled code
		 * based on sortAlgorithm object initialized in constructor, 
		 * sort method of respective class(BubbleSortAlgorithm/QuickSortAlgorithm) is called
		 */
		System.out.println(sortAlgrithm);// To check the sort algorithm being used
		sortedNumbers=sortAlgrithm.sort(numbers);

		//Implement search logic

		return 3;
	}

}
