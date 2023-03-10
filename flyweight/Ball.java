package flyweight;
@SuppressWarnings("unused")
public class Ball {

	private String color;
	private String imageURL;
	private int coordX;
	private int coordY;
	private int radius;
	
	public Ball(String color, String imageURL){
		this.color = color;
		this.imageURL = imageURL;
	}
	public void setX(int X) {
		this.coordX = X;
	}
	public void setY(int Y) {
		this.coordY = Y;
	}
	
	public void setRadius (int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		
	}
		
}


