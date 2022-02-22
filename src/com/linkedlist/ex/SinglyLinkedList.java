package com.linkedlist.ex;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {

	private Node first;
	private int count;
	
	public void add(E element) {
		
		Node newNode = new Node(null, element);
		
		if(first == null) {
			first = newNode;
		} else {
			newNode.next = first;
			first = newNode;
		}
		
		count++;
	}
	
	public boolean isEmpty() {
		return (count == 0) && first == null;
	}
	
	public int size() {
		return count;
	}
	
	public E first() {
		
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		return first.element;
	}
	
	public E last() {
		
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		Node last = first;
		while(last.next != null) {
			last = last.next;
		}
		
		return last.element;
	}
	
	public void print() {
		
		if(first == null) {
			System.out.println("List is empty.");
		}
		
		Node current = first;
		System.out.print("null --> ");
		while(current != null) {
			System.out.print(current.element + " and hashCode: " + current.element.hashCode());
			System.out.print(" --> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public boolean remove() {
		
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		first = first.next;
		
		return true;
	}
	
	class Node {

		Node next;
		E element;
		
		public Node(Node next, E element) {
			super();
			this.next = next;
			this.element = element;
		}
	}
	
	public Iterator iterator() {
		return new Iterator();
	}
	
	public class Iterator {
		
		private Node head = first;
		private int indicator = 0;
		
		boolean hasNext() {
			
			if(head == null) {
				return false;
			}
			indicator = 1;
			
			return true;
		}
		
		E next() {
			
			E ele = null;
			if(indicator == 1) {
				
				ele = head.element;
				head = head.next;
				
				indicator = 0;
			}
			
			return ele;
		}
		
	}
	
	
}
