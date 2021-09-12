abstract class shape
{
	private double x;
	private double y;
	shape(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	public abstract double area(); //afirimeni methodos i opoia prepei na ilopioithei sta paidia
	public String toString()
	{
		return String.format("%-10s %-10s %-10s ","H timi x einai: "+ x,"| H timi y einai: " +  y  ,"| H area einai: "+Math.ceil(area()));
	}
}
class Rectangle extends shape
{
	private double height;
	private double width;
	Rectangle(double x , double y , double height, double width)
	{
		super(x,y);
		this.height = height;
		this.width = width;
	}
	//ilopioisi tis ipoxreotikis ipervasis tis methodou area
	public double area()
	{
		double ipologismos_area = height * width;
		return ipologismos_area;
	}
	//ipervasi tis toString
	public String toString()
	{
		return String.format(super.toString()+"| To height einai: " +height +  "| To width einai: " + width);
	}
}
class Circle extends shape
{
	private double radius;
	Circle(double x , double y , double radius)
	{
		super(x,y);
		this.radius = radius;
	}
	//ilopioisi tis ipoxreotikis ipervasis tis methodou area
	public double area()
	{
		double ipologismos_area = Math.PI* radius * radius;
		return ipologismos_area;
	}
	//ipervasi tis toString
	public String toString()
	{
		return String.format(super.toString()+"To radius einai: " + radius);
	}
}
 class TestShape
{
	public static void main(String args[])
	{
		shape Recta1 = new Rectangle(3.0,7.0 ,10.0,10.0);
		System.out.println(Recta1.toString());
		shape Cir1 = new Circle(4.0,5.0 ,5.0);
		System.out.println(Cir1.toString());
	}
}