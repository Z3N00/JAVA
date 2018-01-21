/*1
  23
  456
  78910
*/

package lecture2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		int row = 1;
		int col = 1;
		int value = 1;
		int n;
		System.out.println("enter the valu of n");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while (row <= n) {
			col = 1;

			while (col <= row) {
				System.out.print(value);
				value++;
				col++;
			}

				System.out.println();
			
			row++;
		}

	}

}
