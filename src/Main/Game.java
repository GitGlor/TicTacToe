package Main;

public class Game implements Printable {
	
	private Player playerX;
	private Player playerO;
	private Board board;
	private boolean isXTurn;
	
	public Game() {
		
	}
	
	public void startGame() {
		playerX = new Player("Duca", 'x');
		playerO = new Player("Kresa", 'y');
		board = new Board();
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
	public String getPrintable() {
		if (board.isFull()) {
			return "GAME OVER \n" + this.board.getPrintable();
		} else if(isXTurn) {
		    return "X's turn \n" + this.board.getPrintable();
		} else {
		 	return "Y's turn \n" + this.board.getPrintable();
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
	}
	
	
}
