package lecture8;

public class nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] s=new boolean[4][4];
		
		 System.out.println(countnqueens(s,0));
	}

	public static int countnqueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				count = count + countnqueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == true) {
				return false;
			}
		}
		for (int i = 0, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == true) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
			if (board[i][j] == true) {
				return false;
			}
		}

		return true;
		
	}
}
