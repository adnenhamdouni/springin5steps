package com.spring.training.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIn5StepsApplication.class, args);

		BinarySearchImpl bn = new BinarySearchImpl();
		int result = bn.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println("result of binary search = "+result);
	}
}
