package lecture2;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		int num;
		int i=2;
		boolean flag=true;
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while (i<num) 
		{
			
		if(num%i==0)
		{
			System.out.println("not prime");
			flag=false;
			break;
			}
		i++;
		}
		if(flag==true)
				System.out.println("prime");
		
	

	}

}
