package lecture2;

import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p;
		float r;
		float t;
		float sI;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of p :");
		p = s.nextFloat();
		System.out.println("enter the value of r :");
		r = s.nextFloat();
		System.out.println("enter the value of t :");
		t = s.nextFloat();

		sI = (p * r * t) / 100;
		System.out.println("simple interest :  " + sI);

	}

}
