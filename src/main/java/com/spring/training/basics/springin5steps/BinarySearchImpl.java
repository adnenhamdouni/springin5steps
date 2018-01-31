package com.spring.training.basics.springin5steps;

import com.spring.training.basics.springin5steps.interfaces.SortAlgorithm;

public class BinarySearchImpl {
	
	private SortAlgorithm sa;
	
	public BinarySearchImpl(SortAlgorithm sa) {
		this.sa = sa;
	}

	//Sorting an array
	public int binarySearch(int[] numbers, int numberToSearchFor) {
	
		// Implement Sorting Logic
		
		//BubbleSortAlgorithm SortAlgorithm bsa = new BubbleSortAlgorithm();
		int[] sortedNumbers = sa.sort(numbers);
		System.out.println("SortAlgorithm = "+sa);

		// Search the array
		
		// Return the result
		return 3;
	}
	

}
