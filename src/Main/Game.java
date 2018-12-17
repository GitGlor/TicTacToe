package Main;

import rules.GameRules;
import rules.XOGameRules;
import view.GameView;

public class Game implements Renderable {
	
	private Player playerX;
	private Player playerO;
	private Board board;
	private boolean isXTurn;
	private GameView gameView;
	
	public Game(GameView gameView, GameRules gameRules) {
		this.gameView = gameView;
		board = new Board(gameRules);
	}
	
	public void startGame() {
		playerX = new Player("Duca", 'x');
		playerO = new Player("Kresa", 'y');
		isXTurn = true;
		
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@Override
	public String getGameState() {
		if (board.isGameOver()) {
			return "GAME OVER \n" + this.board.getGameState();
		} else if(isXTurn) {
		    return "X's turn \n" + this.board.getGameState();
		} else {
		 	return "Y's turn \n" + this.board.getGameState();
		}
	}
	
	public void chooseField(int x, int y) {
		try {
		int value = isXTurn ? 1 : 0;
		board.setFieldValue(x, y, value);
		isXTurn = !isXTurn;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Desired field is invalid");
		}
		
		gameView.render(this);
	}
	
	
}
