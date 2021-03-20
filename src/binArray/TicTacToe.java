package binArray;

public class TicTacToe {

	public static void main(String[] args) {
		final int ROOT = 3;
		char[][] board = new char[ROOT][ROOT];
		
		display(board); //board�� �޾Ƽ� ������ּ���.
	}

	/**
	 * ���� ���
	 * @param board
	 * @param i�� �����ϰ��� �ϴ� ��
	 */
	
	//boolean ù ��°�� ��� ���Ҷ� ����.
	private static void display(char[][] board) {
		boolean isFirstRow = true;
		for (int i = 0; i < board.length; i++) {
			if(isFirstRow) {
				isFirstRow = false;
			} else {
				//�߰��� ���
				System.out.println("---|---|---");
			}
			//�ش��� ���
			boolean isFirstCol = true;
			for (int j= 0; j < board[i].length; j++) {
				if(isFirstCol) {
					isFirstCol = false;
				} else {
					//�߰��� ���
					System.out.print("|");
				}
				System.out.print(" " + board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
