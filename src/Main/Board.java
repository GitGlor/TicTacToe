package Main;

public class Board {
	
	Field[][] fields;
	Field field;

	public Board() {
		this.fields = new Field[3][3];
		
		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields.length; j++) {
				fields[i][j] = new Field();
			}
		}
	}
	
	public void setFieldValue(int x, int y, int value) {
		this.fields[x][y].setCurrentValue(value);
	}	
}
