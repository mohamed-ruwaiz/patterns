package myjava1;

import java.util.Scanner;

public class pyramid4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number : ");
	 	   Scanner sc = new Scanner (System.in);
	 	    int n= sc.nextInt();
	 	    for(int i =1;i<=n;i++) {
	 	    	for (int j=n-1;j>=i;j++) {
	 	    		System.out.print(" ");
	 	    	}
	 	    	for (int j=1;j<=i;j++)
	 	    	{
	 	    		System.out.print(i + " ");
	 	    	}
	 	    	}
	 	    sc.close();
	 	    }
	}


