package lecture2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.print("*");
		}
		System.out.print(" ");

		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("*");
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");

		}
		for (int i = 1; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("   ");
		for (int i = 1; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("*");
		System.out.print("  ");
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}

	}
}
