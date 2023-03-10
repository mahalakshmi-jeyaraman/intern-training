package flyweight;
import java.util.*;
public class FlyweightDemo {
	private static final String colors[] = { "Green", "Yellow", "Pink" };
	private static final Map<String, String> urlMap = Map.ofEntries(
			new AbstractMap. SimpleEntry<String, String>("Green", "urll"),
			new AbstractMap. SimpleEntry<String, String>("Yellow", "url2"), 
			new AbstractMap. SimpleEntry<String, String>("Pink", "url3")
	);

	public static void main(String[] args) {
		for(int i=0;i<5;++i) {
			String color = getColor();
			String url = urlMap.get(color);
			Ball ball = (Ball)BallFactory.getBall(color, url);
			ball.setX(getX());
			ball.setY(getY());
			ball.setRadius (75);
			ball.draw();
			System.out.println(ball.hashCode()) ;
		}
	}
	private static String getColor() {
		return colors[(int) (Math.random()*colors.length)];
	}
	private static int getX() {
		return (int) (Math.random()*50);
	}
	private static int getY() {
		return (int)(Math.random()*50);
	}
}
