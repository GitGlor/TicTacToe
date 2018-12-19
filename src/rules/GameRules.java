package rules;

import Main.Field;

public abstract class GameRules {

	public abstract boolean isVictory(Field[][] fields);
	
	public boolean isFull(Field[][] fields) {
		boolean isFull = true;
		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields.length; j++) {
				if(fields[i][j].getCurrentValue() == -1) {
					isFull = false;
					break;
				}
			}
		}
		return isFull;
	}
}
