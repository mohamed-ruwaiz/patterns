package myjava1;

import java.util.Scanner;

public class pyramidpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter the number : ");
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    
    for (int i=1;i<=n;i++) {
    	for (int j=n;j>=i;j--)
    		System.out.print( " ");
    	for (int k=1;k<=i;k++)
    	  System.out.print(i+" ");
    	System.out.println();
    }
    sc.close();
    }

}
