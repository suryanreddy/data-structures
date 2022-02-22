package com.sorting;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {

		int[] arr = {3, 1, 8, 5, 10, 22, 34, 0, -1, 5}; //j = 1, key = 1, i = 0
//		int[] arr = {1, 3, 8, 5, 10, 22, 34, 0, -1, 5}; //j = 2, key = 8, i = 1
//		int[] arr = {1, 3, 8, 5, 10, 22, 34, 0, -1, 5}; //j = 3, key = 5, i = 2
		
		for (int j = 1; j < arr.length; j++) {
			
			int key = arr[j];
			
			int i = j - 1;
			while(i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}
			
			arr[i + 1] = key;
		}

		Arrays.stream(arr).forEach(System.out::println);
		
	}
	
	

}
