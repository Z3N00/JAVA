package lecture2;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the value of n");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int fn = 0, sn = 1, next = 0;
		while (fn <= n) {
			System.out.print(fn+" ");
			next = fn + sn;
			fn = sn;
			sn = next;
		}
		
		
	}
}
