package com.binarysearch.ex;

import java.util.Stack;

public class BinaryTree {

	static class TreeNode {

		TreeNode left, right;
		int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
		
	}
	
	private TreeNode root;

	public BinaryTree(TreeNode root) {
		this.root = root;
	}

	public void insert(TreeNode current, int data) {

		if (current == null) {
			root = new TreeNode(data);
		} else {

			if (data > current.data) {

				if (current.right == null) {
					current.right = new TreeNode(data);
					System.out.println("Right to root: " + data);
				} else {
					insert(current.right, data);
				}

			} else if (data < current.data) {

				if (current.left == null) {
					current.left = new TreeNode(data);
					System.out.println("Left to root: " + data);
				} else {
					insert(current.left, data);
				}

			}

		}
	}
	
	public void traverseInOrder(TreeNode current) {
		
		if(current == null) {
			return;
		}
		
		System.out.println(current.data);
		traverseInOrder(current.left);
		traverseInOrder(current.right);
	}
	

	
	public void traverseInOrderViaStack() {
		
		Stack<TreeNode> nodes = new Stack<>();
		nodes.push(root);
		
		while(!nodes.isEmpty()) {
			
			TreeNode current = nodes.pop();
			System.out.println(current.data);
			
			if(current.right != null) {
				nodes.push(current.right);
			}
			if(current.left != null) {
				nodes.push(current.left);
			}
		}
		
	}
	
	public void traverseInOrderViaStack1() {
		
		Stack<TreeNode> nodes = new Stack<>();
		nodes.push(root);
		
		while(!nodes.isEmpty()) {
			
			TreeNode current = nodes.peek();
			if(current.right != null) {
				nodes.push(current.right);
			}
			if(current.left != null) {
				nodes.push(current.left);
			}
		}
		
	}

	public void traverseInOrder() {
		traverseInOrder(root);
	}

	public void insert(int data) {
		insert(root, data);
	}

	public static TreeNode treeNode(int key) {
		return new TreeNode(5);
	}

}
