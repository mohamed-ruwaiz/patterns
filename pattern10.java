package myjava1;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
	    for (int i=n;i>0;i--) 
	    {
	        for ( int j=1;j<=n-i;j++){
	            System.out.print(" ");
	        }
	        for ( int j=i;j>0;j--){
	            System.out.print(j+ " ");
	        }
	        
	         System.out.println();
	    }
	    in.close();
	}

}
