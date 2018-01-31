package com.spring.training.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.training.basics.springin5steps.interfaces.SortAlgorithm;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIn5StepsApplication.class, args);

		SortAlgorithm sa = new BubbleSortAlgorithm();
		
		BinarySearchImpl bn = new BinarySearchImpl(sa);
		int result = bn.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println("result of binary search = "+result);
	}
}
