abstract class GeometricObject
{
	private String color;
	private boolean filled;
	GeometricObject(String color,boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	public String getColor()
	{
			return color;
	}
	public  boolean isFilled()
	{
		if(color=="  ")
		{
			filled = false;
		}
		else
		{
			filled= true;
		}
		return filled;
	}
	public abstract double getArea(); //methodos i opoia prepei na ilopioithei sta paidia ipoxreotika
	public abstract double getPerimeter(); //methodos i opoia prepei na ilopioithei sta paidia ipoxreotika
	public abstract String toString();//methodos i opoia prepei na ilopioithei sta paidia ipoxreotika (dn to zitouse i askisi )
}
class Rectangle extends GeometricObject
{
	private int width;
	private int height;
	Rectangle(String color, boolean filled , int width , int height)
	{
		super(color,filled);
		this.width = width;
		this.height = height;
	}
	//ypervasi tis methodou getArea()
	public double getArea()
	{
		double area;
		area = width*height;
		return area;
	}
	//ypervasi tis methodou getPerimeter()
	public double getPerimeter()
	{
		double perimeter;
		perimeter = 2*(width*height);
		return perimeter;
	}
	//ypervasi tis methodou toString()
	public String toString()
	{
		return String.format("%-10s %-10s %-10s %-10s %-10s %-10s", "To xrwma einai: " +getColor(),"| Efoson exei xrwma tote einai: "+isFilled() ,"| To width einai: "+width,"| To height einai: "+  height  ,"| Ara to area einai: " + Math.ceil(getArea()),"| Kai to Perimeter einai: " +getPerimeter());
	}
}
class Circle extends GeometricObject
{
	private double radius;
	Circle(String color, boolean filled , double radius)
	{
		super(color,filled);
		this.radius = radius;
	}
	//ypervasi tis methodou getArea()
	public double getArea()
	{
		double area;
		area = radius*radius*Math.PI;
		return area;
	}
	//ypervasi tis methodou getPerimeter()
	public double getPerimeter()
	{
		double perimeter;
		perimeter = 2*(radius*radius*Math.PI);
		return perimeter;
	}
	//ypervasi tis methodou toString()
	public String toString()
	{
		return String.format("%-10s %-10s %-10s %-10s %-10s ","To xrwma einai: "+ getColor(),"| Efoson exei xrwma tote einai: "+isFilled() ,"| To radius einai: "+radius  ,"| Ara to area einai: "+Math.ceil(getArea()),"| Kai to perimeter einai: "+Math.ceil(getPerimeter()));
	}
}
class TestGeometricObject
{
	public static void main(String args[])
	{
		GeometricObject obj1 = new Rectangle("red" , true , 10 ,10);
		System.out.println(obj1.toString());
		GeometricObject obj2 = new Circle("blue" , true , 10.0 );
		System.out.println(obj2.toString());
	}
}