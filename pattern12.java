package myjava1;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i=n;i>=1;i--) 
	    {
	       
	        for ( int j=i;j>=1;j--){
	            System.out.print(j+" ");
	        }
	        
	         System.out.println();
	    }
		
	    for (int i=1;i<=n;i++) 
	    {
	       
	        for ( int j=i;j>=1;j--){
	            System.out.print(j+" ");
	        }
	        
	         System.out.println();
	    } 
	    in.close();
	}

}
