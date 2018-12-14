package Main;

public class Test {

	public static void main(String[] args) {
		Game game = new Game();
		System.out.println("p1 " + game.getPlayerX().name);
		
		Board board = new Board();
		XOPrinter xoPrinter = new XOPrinter();
		
		xoPrinter.printBoard(board);
		
		board.setFieldValue(1, 1, 8);
		
		xoPrinter.printBoard(board);

	}

}
