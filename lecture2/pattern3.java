package lecture2;

public class pattern3 {

	public static void main(String[] args) {
		int n = 4;
		int col = 1;
		int row = 1;
		while (row <= n) {
			col = 1;
			while (col <= n - row) {
				System.out.print(" ");
				col++;
			}
			col = 1;

			while (col <= row) {
				System.out.print("*");

				col++;
			}
			col = 1;

			while (col < row) {
				System.out.print("*");

				col++;
			}
			System.out.println();
			row++;
		}

		

		}

	}

