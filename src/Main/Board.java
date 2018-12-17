package Main;

import rules.GameRules;

public class Board implements Renderable {
	
	Field[][] fields;
	Field field;
	GameRules gameRules;

	public Board(GameRules gameRules) {
		this.fields = new Field[3][3];
		this.gameRules = gameRules;
		
		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields.length; j++) {
				fields[i][j] = new Field();
			}
		}
	}
	
	public void setFieldValue(int x, int y, int value) throws ArrayIndexOutOfBoundsException {
		if (!isGameOver()) {
			this.fields[x][y].setCurrentValue(value);
		}
	}

	@Override
	public String getGameState() {
		StringBuffer boardString = new StringBuffer("");
		for (int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				boardString.append(this.fields[i][j]);				
			}
			boardString.append("\n");
		}
		boardString.append("\n");
		return boardString.toString();
	}	
	
	public boolean isGameOver() {
		return gameRules.isGameOver(fields);
	}
}
