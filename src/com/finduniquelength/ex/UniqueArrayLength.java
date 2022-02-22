package com.finduniquelength.ex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class UniqueArrayLength {

	public static void main(String[] args) {

		UniqueArrayLength length = new UniqueArrayLength();
		int[] ar = {2, 2, 2, 3, 3, 3, 4, 4, 5};
		
		
		Set<Integer> sets = new HashSet<>();
		for(int i = 1; i < ar.length; i++) {
			sets.add(ar[i]);
		}
		
		
		
 		//int size = length.getArrayLenghtWithSorting(ar);
		System.out.println(sets.size());
		
	}
	
	public int getArrayLenght(int[] arr) {
		
		if(arr.length == 0 || arr.length == 1)
			return 1;

		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] != arr[i - 1]) {
				
				final int j = i;
				boolean anyMatchFound = st.stream().anyMatch(t -> t == arr[j]);
				if(!anyMatchFound) {
					st.push(arr[i]);
				}
				
			}
			
		}
		
		return st.size();
	}
	
	public int getArrayLenghtWithSorting(int[] arr) {
		
		if(arr.length == 0 || arr.length == 1)
			return 1;
		
		int count = 1;
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] != arr[i - 1]) {
				count += 1;
			}
			
		}
		
		return count;
	}

}
