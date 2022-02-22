package com.linkedlist.ex;

import com.linkedlist.ex.SinglyLinkedList.Iterator;

public class Test {

	public static void main(String[] args) {
		
		SinglyLinkedList<Student> students = new SinglyLinkedList<>();
//		System.out.println(students.isEmpty());
		
		Student s1 = new Student(1, "Surya", "surya@gmail.com");
		Student s2 = new Student(2, "Sirisha", "siri@gmail.com");
		Student s3 = new Student(3, "Vahin", "vahin@gmail.com");
		Student s4 = new Student(4, "Srihan", "srihan@gmail.com");
		Student s5 = new Student(5, "Srihan", "srihan@gmail.com");
		
//		System.out.println("s1: " + s1.hashCode() + "s2: " + s2.hashCode() + "s3: " + s3.hashCode() + "s4: " + s4.hashCode() + "s5: " + s5.hashCode());
//		System.out.println(s4 == s5);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		@SuppressWarnings("rawtypes")
		Iterator iterator = students.iterator();
		System.out.println(iterator.hasNext());
		while(iterator.hasNext()) {
			iterator.next();
		}
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		
//		
//		students.print();
////		System.out.println(students.size());
//		
//		System.out.println("First: " + students.first());
//		System.out.println("Last: " + students.last());
//		System.out.println("Removed: " + students.remove());
//		students.remove();
//		System.out.println("First After removed: " + students.first());
		
//		DoublyLinkedList<Student> students = new DoublyLinkedList<>();
//		students.add(s1);
//		students.add(s2);
//		students.add(s3);
//		students.add(s4);
//		students.add(s5);
//		
//		students.print();
//		
//		Student s6 = new Student(6, "Srihan-New", "srihan@gmail.com");
//		students.addLast(s6);
//		students.print();
//		System.out.println(students.removeFirst());
//		students.print();
//		System.out.println(students.removeLast());
//		students.print();
		
//		BinaryTree bt = new BinaryTree(BinaryTree.treeNode(5));
//		
//		bt.insert(7);
//		bt.insert(3);
//		bt.insert(10);
//		bt.insert(20);
//		bt.insert(15);
//		bt.insert(13);
//		bt.insert(4);
//		bt.insert(2);
//		
//		bt.traverseInOrder(5);
		
//		Stack students = new Stack(3);
//		
//		students.push(s1);
//		students.push(s2);
//		students.push(s3);
//		students.push(s4);
//		students.push(s5);
//		
//		students.print();
//		System.out.println(students.size());
//		System.out.println(students.peep());
//		System.out.println(students.peep());
//		System.out.println(students.size());
//		students.print();
		
//		Queue students = new Queue(3);
//		students.enQueue(s1);
//		students.enQueue(s2);
//		students.enQueue(s3);
//		students.enQueue(s4);
//		students.enQueue(s5);
//		
//		students.print();
//		System.out.println();
//		System.out.println(students.deQueue());
//		System.out.println();
//		students.print();
		
	}

}
