package com.cnt.bean;

public final class Final_new {
	public final int tests = 50;
	public void Final_new1() {
		System.out.println("final method: ");
		//tests = 25;     //we cannot change the value
	}
	public void result() {
		System.out.println(tests);
	}
}
