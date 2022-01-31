package com.princeton.unionfind;

public class TestQuickUF {

	public static void main(String[] args) {
		
		QuickFindUF test = new QuickFindUF(10);
		
		test.union(3, 6);
		test.union(8, 6);
		System.out.println(test.connected(3, 6));
		System.out.println(test.connected(3, 8));
		System.out.println(test.getNode(3));
		
		//Ackermann outro = new Ackermann();
		
		//System.out.println(outro.ackermann(5, 0));

	}

}

