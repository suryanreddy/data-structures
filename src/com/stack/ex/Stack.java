package com.stack.ex;

import java.util.Arrays;

public class Stack {

	Object[] elements;
	int totalItems;
	int capacity;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
	}
	
	public void push(Object data) {
		
		if(capacity <= totalItems) {
			//throw new StackOverflowError();
			int newCapacity = totalItems + capacity;
			if(newCapacity - Integer.MAX_VALUE > 0) {
				newCapacity = Integer.MAX_VALUE;
			}
			capacity = newCapacity;
			elements = Arrays.copyOf(elements, capacity);
		}
		
		elements[totalItems] = data;  
		totalItems++;
	}
	
	public void print() {
		
		if(elements == null) {
			System.out.println("Stack is empty.");
		}
		
		for (Object obj : elements) {
			if(obj == null) {
				break;
			}
			System.out.println(obj);
		}
		
	}
	
	public int size() {
		return totalItems;
	}
	
	public boolean isEmpty() {
		return totalItems == 0 && elements == null;
	}
	
	public Object peep() {
		
		if(elements == null) {
			throw new IllegalArgumentException();
		}
		
		return elements[totalItems - 1];
	}
	
	public Object pop() {
		if(elements == null) {
			throw new IllegalArgumentException();
		}
		
		Object removedElement = elements[--totalItems];
		elements[totalItems] = null;
		
		return removedElement;
	}
	
	public void clear() {
		elements = new Object[capacity];
		totalItems = 0;
	}
	
}
