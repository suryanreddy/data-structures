package com.linkedlist.ex;

public class DoublyLinkedList<E> {
	
	class Node {
		Node prev;
		Node next;
		E element;
		
		public Node(Node prev, E element, Node next) {
			this.prev = prev;
			this.element = element;
			this.next = next;
		}
		
	}
	
	private int count;
	private Node head;
	
	public boolean add(E data) {
		
		Node newNode = new Node(null, data, null);
		
		if(head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		
		count++;
		return true;
	}
	
	public void print() {
		
		if(head == null) {
			System.out.println("List is empty");
		}
		
		Node current = head;
		System.out.print("Head => ");
		while(current != null) {
			System.out.print(current.element);
			System.out.print(" => ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count == 0 && head == null;
	}
	
	public boolean addFirst(E data) {
		return add(data);
	}
	
	public boolean addLast(E data) {
		
		if(head == null) {
			throw new IllegalArgumentException();
		}
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		Node newNode = new Node(last, data, null); 
		last.next = newNode;
		
		return true;
	}
	
	public E removeFirst() {
		
		//replace head
		if(head == null) {
			throw new IllegalArgumentException();
		}
		
		final E removedElement = head.element;
		head = head.next;
		head.prev = null;
		
		return removedElement;
	}
	
	public E removeLast() {
		
		if(head == null) {
			throw new IllegalArgumentException();
		}
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		final E removedElement = last.element;
		last = last.prev;
		last.next = null;
		
		return removedElement;
	}

}
