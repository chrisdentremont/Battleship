package battleship;

public class Ship {
	public boolean isVertical;
	public int size;
	public int health;
	
	public Ship(boolean isVertical, int size) {
		this.isVertical = isVertical;
		this.size = size;
		this.health = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean getVertical() {
		return isVertical;
	}
}
