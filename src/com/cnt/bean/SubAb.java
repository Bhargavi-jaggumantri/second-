package com.cnt.bean;

public  class SubAb extends Abastract {
	void complete() {
		int value1 = 21;
		int value2 = 20;
		int values = value1 + value2;
		System.out.println("values: " + values);
		
	}
	void multiplication(int value1,int value2) {
		int result=value1*value2;
		System.out.println(result);
		//complete.   //we cannot call a method in another method
 	}
	
	

}
