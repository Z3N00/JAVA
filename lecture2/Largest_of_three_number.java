package lecture2;

import java.util.Scanner;

public class Largest_of_three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float num1;
        float num2;
        float num3;
        Scanner s=new Scanner (System.in);
        System.out.println("enter number 1 ");
        num1=s.nextFloat();
        System.out.println("enter number 2");
        num2=s.nextFloat();
        System.out.println("enter number 3");
        num3=s.nextFloat();
        if(num1>num2&&num1>num3){
        	System.out.println("num 1 : "+num1+" is greater");
        }
        else if(num2>num1&&num2>num3){
        	System.out.println("num 2 : "+num2+" is greater ");
        	
        }
        else{
        	System.out.println("num 3 : "+num3+"is greater");
        }
	}

}
