package Main;

public class Board implements Printable {
	
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
	
	public void setFieldValue(int x, int y, int value) throws ArrayIndexOutOfBoundsException {
		
			this.fields[x][y].setCurrentValue(value);
		
	}

	@Override
	public String getPrintable() {
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
	
	public boolean isFull() {
		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields.length; j++) {
				if(this.fields[i][j].getCurrentValue() == -1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isVictory() {
		//horizantalno
		for (int i = 0; i < fields.length; i++) {
			
			boolean isConnected = true;
			for (int j = 0; j < fields.length - 1; j++) {
				isConnected = isConnected && fields[i][j].equals(fields[i][j + 1]);				
				
				if(!isConnected) {
					break;
				}
			}
			
			if (isConnected) {
				return true;
			}
			
			for (int j = 0; j < fields.length - 1; j++) {
				isConnected = isConnected && fields[i][j].equals(fields[i][j + 1]);				
				
				if(!isConnected) {
					break;
				}
			}
			
			if (isConnected) {
				return true;
			}
			
		}
	
		//dijagonale
		
		
		
		
		return false;
	}
}
