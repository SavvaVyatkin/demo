package com.binary.tree;

class BTFunc {

	// Recursive function to calculate height of given binary tree
	public static int height(Node root) {
		return root == null ? 0 : 1 + Math.max(height(root.left), height(root.right));
	}

	public static void print(Node root) {
		if (root != null) {
			System.out.print(" > " + root.value);
			print(root.left);
			print(root.right);
		}
	}
	public static void printMin(Node root) {
		if (root != null) {
			print(root.left);
			print(root.right);
			System.out.print(" > " + root.value);
		}
	}
}