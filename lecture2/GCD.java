package lecture2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		n1 = s.nextInt();
		System.out.println("enter nsecond number");
		n2 = s.nextInt();
		while (n1 != n2) {
			if (n1 > n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}

		}
		System.out.println("GCD is  " + n1);

	}

}
