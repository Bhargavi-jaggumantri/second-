package com.cnt.bean;

public class ForLoopTest {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) { 
            //  inner loop to handle number of columns 
            for (int j = 0; j < 6; j++) { 
                // star will print only when  it is in first 
                // row or last row or first column or last 
                // column 
                if (i == 0 || j == 0 || i == 6 - 1
                    || j == 6 - 1) { 
                    System.out.print("*"); 
                } 
                // otherwise print space only. 
                else { 
                    System.out.print(" "); 
                } 
            } 
            System.out.println(); 
        } 
	}

}
