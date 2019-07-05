package com.binary.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NodeTest 
{
	Node root = null;
	
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
	
    @Before
    public void setUp() {

		root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(25);
    } 
    
    @Test
    public void heightTest()
	{
    	int level = BTFunc.height(root);
		System.out.print("The height of the binary tree is " + level);
		assertEquals(3, level);
	}
    
    @Test
    public void printTest()
    {
    	BTFunc.print(root);
		System.out.println();
    }
    
    @Test
    public void printMinTest()
    {
    	BTFunc.printMin(root);
    	System.out.println();
    }
}