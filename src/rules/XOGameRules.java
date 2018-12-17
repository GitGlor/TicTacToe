package rules;

import Main.Field;

public class XOGameRules extends GameRules {

	@Override
	public boolean isVictory(Field[][] fields) {
			
		//horizantalno
		boolean isConnected = true;
		for (int i = 0; i < fields.length; i++) {
			
			
			for (int j = 0; j < fields.length - 1; j++) {
				Field currentField = fields[i][j];
				isConnected = currentField.getCurrentValue() != -1 && currentField.equals(fields[i][j + 1]);				
				
				if(!isConnected) {
					break;
				}
			}
			
			if (isConnected) {
				return true;
			}
			//vertikalno
			isConnected = true;
			for (int j = 0; j < fields.length - 1; j++) {
				Field currentField = fields[j][i];
				isConnected = currentField.getCurrentValue() != -1 && currentField.equals(fields[j + 1][i]);			
				
				if(!isConnected) {
					break;
				}
			}
			
			if (isConnected) {
				return true;
			}
			
		}
	
		//dijagonalno
		isConnected = true;
		for (int i = 1; i < fields.length; i++) {
			Field currentField = fields[i][i];
			isConnected = currentField.getCurrentValue() != -1 && currentField.equals(fields[i-1][i-1]);				
			
			if(!isConnected) {
				break;
			}
		}
		
		if (isConnected) {
			return true;
		}
		
		isConnected = true;
		for (int i = 0; i < fields.length - 1; i++) {
			int j = fields.length - 1 - i;
			Field currentField = fields[i][j];
			isConnected = currentField.getCurrentValue() != -1 && currentField.equals(fields[i+1][j - 1]);				
			
			if(!isConnected) {
				break;
			}
		}
		
		return isConnected;
	}
}
