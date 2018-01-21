package lecture2;

import java.util.Scanner;

public class PRINTPRIMENO {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the value of n");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i, p;
		for (i = 2; i <=n; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					p = 1;
				}
			}
			if (p == 0) {
				System.out.println(i);
			}
		}

	}
}
