package flyweight;
import java.util.*;
@SuppressWarnings("rawtypes")
public class BallFactory {
	private static final HashMap ballMap = new HashMap () ;
	@SuppressWarnings("unchecked")
	public static Ball getBall(String color, String url) {
	StringBuilder sb = new StringBuilder();
	sb.append(color);
	sb.append(url);
	String ballCacheKey = sb.toString() ;
	Ball ball = (Ball)ballMap.get(ballCacheKey) ;
	if (ball == null) {
		ball = new Ball(color, url);
		ballMap.put(ballCacheKey, ball);
		System.out.println("Creating circle of color: " + color);
	}
	return ball;
	}
}
