package lecture2;

import java.util.Scanner;

public class sum_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n;
          int sum=0;
          Scanner s=new Scanner (System.in);
          System.out.println("enter total numbers");
          n=s.nextInt();
          for(int i=0;i<=n;i++){
        	  sum=sum+i;
          }
          System.out.println("sum of n numbers is : "+sum);
	}

}
