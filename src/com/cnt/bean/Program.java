package com.cnt.bean;
import com.cnt.bean.Protect;
//import com.cnt.bean.Final_new;

public class Program extends Protect {     //Default_new { //Protect {
	public static void main(String[] args) {
		//Student stu = new Student();
		//stu.Student1();
		Protect pro = new Protect();
		pro.Protect1();
		
        //Default_new deem = new Default_new();
		//deem.Default_new1();		
	}
	
}
//PUBLIC can be accessed anywhere.
//PRIVATE cannot be accessed within the package.
//PROTECTED can be accessed in same package but different class using INHERITANCE.
//DEFAULT can be accessed within the same package.
//FINAL is accessed within the package and in the other package.
//ABSTRACT can be accessed within the package.