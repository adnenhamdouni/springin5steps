package com.spring.training.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.training.basics.springin5steps.interfaces.SortAlgorithm;

@Component
public class BinarySearchImpl {
	
	@Autowired
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
