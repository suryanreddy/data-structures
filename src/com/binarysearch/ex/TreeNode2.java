package com.binarysearch.ex;

public class TreeNode2 {

	TreeNode2 left, right;
	int data;
	
	public TreeNode2(int data) {
		this.data = data;
	}
	
	public TreeNode2(TreeNode2 left, int data, TreeNode2 right) {
		this.left = left;
		this.data = data;
		this.right = right;
	}
	
}
