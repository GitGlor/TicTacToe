package Main;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import rules.GameRules;
import rules.XOGameRules;
import view.GameView;

public class Game implements Renderable {
	
	private Player playerX;
	private Player playerO;
	private Board board;
	private boolean isXTurn;
	private GameView gameView;
	private GameRules gameRules;
	
	public Game(GameView gameView, GameRules gameRules) {
		this.gameView = gameView;
		this.gameRules = gameRules;
		board = new Board();
	}
	
	public void startGame() {
		playerX = new Player("Duca", 'x');
		playerO = new Player("Kresa", 'y');
		isXTurn = true;
		gameView.render(this);
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
	
	@Override
	public GameState getGameState() {
		if (gameRules.isVictory(board.getFields())) {
			return isXTurn ? GameState.WIN_X : GameState.WIN_Y;
		} else if (gameRules.isFull(board.getFields())) {
			return GameState.DRAW;
		} else {
			return isXTurn ? GameState.MOVE_X : GameState.MOVE_Y;
		}		
	}
	
}
