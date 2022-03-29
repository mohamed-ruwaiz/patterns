package myjava1;
import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    int n =in.nextInt();
    for (int i=1;i<=n;i++) {
    	for (int j=1;j<=i;j++) {
    	System.out.print(j%2+" ");
    }
    
    System.out.println();
	}
  in.close();
}
}