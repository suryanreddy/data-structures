package com.palindrome.ex;

public class PalindromeEx {
	public static void main(String[] args) {
		
		int[] ar = new int[] {8,0,7,1,7,7,9,7,5,2,9,1,7,3,7,0,6,5,1,7,7,9,3,8,1,5,7,7,8,4,0,9,3,7,3,4,5,7,4,8,8,5,8,9,8,5,8,8,4,7,5,4,3,7,3,9,0,4,8,7,7,5,1,8,3,9,7,7,1,5,6,0,7,3,7,1,9,2,5,7,9,7,7,1,7,0,8};
		
		long number = 0;
        for(int i = 0; i < ar.length; i++) {
            number = number * 10 + ar[i];
        }
        System.out.println(number);
		
		long number2 = number;
        long temp = 0;
        while (number2 > 0) {
            temp = temp * 10 + number2 % 10;
            number2 /= 10;
        }
        System.out.println(temp);
        
        System.out.println(number == temp);
		
	}
}
