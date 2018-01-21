package lecture2;

import java.util.Scanner;

public class sumofoddeven {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int counter = 1;
		int oddsum = 0, evensum = 0;

		while (n != 0) {
			int rem = n % 10;
			if (counter % 2== 0) {
				evensum = evensum + rem;
				

			} else {
				oddsum = oddsum + rem;
			}
			counter++;
			n = n / 10;

		}

		System.out.println("sum of even digits : " + evensum);
		System.out.println("sum of odd digits : " + oddsum);
	}

}
