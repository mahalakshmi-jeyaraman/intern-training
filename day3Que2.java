package day3;
import java.util.*;

interface CalcArea{
	double area();
	
}
interface CalcVolume{
	double volume();
}

class Circle implements CalcArea{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

}

class Square implements CalcArea{
	private double side;
	public Square(double side) {
		this.side = side;
	}
	@Override
	public double area() {
		return side*side;
	}
	
}

class Triangle implements CalcArea{
	private double length;
	private double breadth;
	private double height;
	public Triangle(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	@Override
	public double area() {
		return (length*breadth*height)/2;
	}
}

class Sphere implements CalcVolume{
	private double radius;
	public Sphere(double radius) {
		this.radius = radius;
	}
	@Override
	public double volume() {
		return (4/3)*Math.PI*radius*radius*radius;
	}

}

class Cuboid implements CalcVolume{
	private double side;
	public Cuboid(double side) {
		this.side = side;
	}
	@Override
	public double volume() {
		return side*side*side;
	}
	
}

public class day3Que2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		double side = scan.nextDouble();
		double length = scan.nextDouble();
		double height = scan.nextDouble();
		double breadth = scan.nextDouble();
		
		Circle c = new Circle(radius);
		System.out.println("the area of the circle is : "+c.area());
		
		Square s = new Square(side);
		System.out.println("the area of the square is : "+s.area());
		
		Triangle t = new Triangle(length, breadth, height);
		System.out.println("the area of the triangle is : "+t.area());
		
		Sphere sph = new Sphere(radius);
		System.out.println("the area of the sphere is : "+sph.volume());
		
		Cuboid cbd = new Cuboid(side);
		System.out.println("the volume of the cuboid is "+cbd.volume());
		
		scan.close();

	}

}
