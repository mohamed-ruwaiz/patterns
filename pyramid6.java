package myjava1;

import java.util.Scanner;

public class pyramid6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	    	System.out.println("enter the number : ");
	    	   Scanner sc = new Scanner (System.in);
	    	    int n= sc.nextInt();
	    	   
	    	    for (int i=n;i>0;i--) {
	    	    	for (int j=1;j<=n-i;j++) {
	    	    		System.out.print( " ");
	    	    	}
	    	    	for (int j=i;j>0;j--) {
	    	    	  System.out.print("* ");
	    	    	}
	    	    	System.out.println();
	    	    }
	    	    sc.close();
	       }
	     
	}


