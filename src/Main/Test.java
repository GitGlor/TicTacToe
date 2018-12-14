package Main;

public class Test {

	public static void main(String[] args) {
		Game game = new Game();
		XOPrinter xoPrinter = new XOPrinter();
		
		game.startGame();
		xoPrinter.print(game);
		
		game.chooseField(0, 0);
		game.chooseField(0, 1);
		game.chooseField(0, 2);
		game.chooseField(1, 0);
		game.chooseField(1, 1);
		game.chooseField(1, 2);
		game.chooseField(2, 0);
		game.chooseField(2, 3);
		game.chooseField(2, 2);
		
		xoPrinter.print(game);
		
		//new TransporterCestica().stopTheLoop();

	}

}
