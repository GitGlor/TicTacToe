package Main;

public class XOPrinter {
	public void printBoard(Board board) {
		for (int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				System.out.print(board.fields[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
