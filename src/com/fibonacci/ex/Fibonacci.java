package com.fibonacci.ex;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public List<Integer> generateFibonacciNumber(int count) {
		
		int n1 = 0, n2 = 1;
		int n3;
		
		List<Integer> fs = new ArrayList<>();
		fs.add(n1);
		fs.add(n2);
	
		for(int i = 0; i < count - 2; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			fs.add(n3);
		}
		
		return fs;
	}
	
	public void fibonacci(List<Integer> fs, int count, int n1, int n2) {
		
		if(count > 0) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			fs.add(n3);
		} else {
			return;
		}
		
		fibonacci(fs, count - 1, n1, n2);
	}
	
	
}
