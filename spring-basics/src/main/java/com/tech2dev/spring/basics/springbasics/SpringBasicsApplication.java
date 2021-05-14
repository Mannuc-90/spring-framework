package com.tech2dev.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		//Creating the object of binarySearchImpl class
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();

		//calling the binarySearch method to get result index
		int result = binarySearchImpl.binarySearch(new int[] {4,1,6,3,8}, 6);
		System.out.println(result);
		
		SpringApplication.run(SpringBasicsApplication.class, args);
	}

}
