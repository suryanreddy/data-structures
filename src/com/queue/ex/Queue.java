package com.queue.ex;

import java.util.Arrays;

public class Queue {

	Object[] elements;
	int totalItems;
	int capacity;

	public Queue(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
	}

	public void enQueue(Object data) {

		if (capacity <= totalItems) {
			// throw new StackOverflowError();
			int newCapacity = totalItems + capacity;
			if (newCapacity - Integer.MAX_VALUE > 0) {
				newCapacity = Integer.MAX_VALUE;
			}
			capacity = newCapacity;
			elements = Arrays.copyOf(elements, capacity);
		}

		elements[totalItems] = data;
		totalItems++;
	}

	public void print() {

		if (elements == null) {
			System.out.println("Stack is empty.");
		}

		for (Object obj : elements) {
			if (obj == null) {
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

	public Object deQueue() {
		if (elements == null) {
			throw new IllegalArgumentException();
		}
		
		//Get a first element of the array
		Object deQueueElement = elements[0];
		--totalItems;
		
		//Shift all items index
		int idx = 0;
		for(int i = totalItems; i >= 0; i--) {
			elements[idx] = elements[++idx];
		}
		elements[totalItems] = null;
		
		//return deQueued item
		return deQueueElement;
	}

	public void clear() {
		elements = new Object[capacity];
		totalItems = 0;
	}

}
