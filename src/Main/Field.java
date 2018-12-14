package Main;

public class Field {
	
	private int currentValue;
	
	boolean isOccupied() {
		return this.currentValue != -1;
	}
	
	public Field() {
		currentValue = -1;
	}

	public int getCurrentValue() {
		return currentValue;
	}
	
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return currentValue + "";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.currentValue == ((Field) obj).currentValue;
	}
}
