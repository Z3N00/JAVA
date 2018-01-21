package lecture2;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		int value=2;
		int n;
		System.out.println("enter number of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<n;i++){
			System.out.print(value);
			value=value+1;
		}
		
		 value=2;
		System.out.print(value);
		System.out.println();
		value=3;
		for(int i=1;i<=n;i++){
			System.out.print(value);
			value=value+1;
		}
		value=4;
		for(int i=1;i<n;i++){
			System.out.print(value);
			value=value-1;
		}
		value=4;
		System.out.println();
		for(int i=1;i<=n+1;i++){
			System.out.print(value);
			value=value+1;
		}
		value=6;
		for(int i=1;i<=n;i++){
			System.out.print(value);
			value=value-1;
		}
		
		

	}

}
