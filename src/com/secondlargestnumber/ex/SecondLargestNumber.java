package com.secondlargestnumber.ex;

public class SecondLargestNumber {

	public int findSecondLargestNumber(int[] numbers) {
		
		int secondLargest = 0;
		int highestNumber = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > highestNumber) {
				secondLargest = highestNumber;
				highestNumber = numbers[i];
			} else if(numbers[i] > secondLargest) {
				secondLargest = numbers[i];
			}
			
		}
		
		return secondLargest;
	}
	
}
