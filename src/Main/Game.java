package Main;

public class Game {
	
	private Player playerX;
	private Player playerO;
	
	public Game() {
		playerX = new Player("Duca", 'x');
		playerO = new Player("Kresa", 'y');
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
	
	
	
	
}
