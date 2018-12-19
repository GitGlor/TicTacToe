package Main;

import rules.GameRules;

public class Board {
	
	Field[][] fields;
	Field field;

	public Board() {
		this.fields = new Field[3][3];
		generateEmptyFields();
	}
	
	private void generateEmptyFields() {
		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields.length; j++) {
				fields[i][j] = new Field();
			}
		}
	}

	public void setFieldValue(int x, int y, int value) throws ArrayIndexOutOfBoundsException {
		this.fields[x][y].setCurrentValue(value);
	}
	
	public Field[][] getFields() {
		return fields;
	}
	
	@Override
	public String toString() {
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
}
