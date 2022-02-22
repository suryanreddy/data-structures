package com.fibonacci.ex;

public class Palindrome {

	public boolean isPalindrome(int n) {

		int r, sum = 0;
		int tmp = n;

		while(n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n /= 10;
		}

		if(tmp == sum) {
			return true;
		}
		
		return false;
	}
	
	public int recursive(int n, int sum) {
		
		if (n > 0) {
			sum = (sum * 10) + n % 10;
		} else {
			return sum;
		}
		
		return recursive(n / 10, sum);
	}

}
