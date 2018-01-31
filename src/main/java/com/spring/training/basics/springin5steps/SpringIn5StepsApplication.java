package com.spring.training.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.training.basics.springin5steps.interfaces.SortAlgorithm;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	// What are the Beans?
	// What are the dependencies of Bean?
	// Where to search for beans?

	public static void main(String[] args) {
		
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

		//SortAlgorithm sa = new BubbleSortAlgorithm();
		//BinarySearchImpl bn = new BinarySearchImpl(sa);
		
		BinarySearchImpl bn = applicationContext.getBean(BinarySearchImpl.class);
		int result = bn.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println("result of binary search = "+result);
	}
}
