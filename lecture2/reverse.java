package lecture2;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		int num;
		int rem;
        int rev=0;
		System.out.println("enter your number ");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();

		while (num != 0) {
			rem = num % 10;
			 rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println(rev);

	}
}
