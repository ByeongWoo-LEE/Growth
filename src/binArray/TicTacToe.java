package binArray;

public class TicTacToe {

	public static void main(String[] args) {
		final int ROOT = 3;
		char[][] board = new char[ROOT][ROOT];
		
		display(board); //board를 받아서 출력해주세요.
	}

	/**
	 * 한줄 출력
	 * @param board
	 * @param i는 츌력하고자 하는 줄
	 */
	
	//boolean 첫 번째를 출력 안할때 쓴다.
	private static void display(char[][] board) {
		boolean isFirstRow = true;
		for (int i = 0; i < board.length; i++) {
			if(isFirstRow) {
				isFirstRow = false;
			} else {
				//중간줄 출력
				System.out.println("---|---|---");
			}
			//해당줄 출력
			boolean isFirstCol = true;
			for (int j= 0; j < board[i].length; j++) {
				if(isFirstCol) {
					isFirstCol = false;
				} else {
					//중간줄 출력
					System.out.print("|");
				}
				System.out.print(" " + board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
