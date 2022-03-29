package myjava1;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
		    int n =in.nextInt();
		    for (int i=n;i>0;i--) {
		    	for (int j=i;j<n;j++) {
		    	System.out.print(j+" ");
		    }
		    	for (int k=n-i;k<n;k++) {
		        System.out.print(5+" ");
		    	}
		    
		    System.out.println();
			}
      in.close();
	}

}
