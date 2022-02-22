package com.reversestring.ex;

public class ReverseText {

	public String reverseText(String text) {
		
		if(text == null || text.length() == 0) {
			return null;
		}
		
		char[] chars = text.toCharArray();
		
		char[] reversedChars = new char[text.length()];
		for(int j = 0, i = chars.length - 1; i >= 0; i--) {
			reversedChars[j++] = chars[i];
		}
		
		return new String(reversedChars);
	}
	
	public String recursiveText(String text) {
		
		if(text == null || text.length() == 1) {
			return text;
		}
		
		return recursiveText(text.substring(1)) + text.charAt(0);
		
	}
	
}
