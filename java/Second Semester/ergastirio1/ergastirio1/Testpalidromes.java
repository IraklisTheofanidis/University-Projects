class palidromes
{
	static int rev=0;
	public static int REV(int num)
	{
		if(num>0)
		{
			rev=(rev*10)+ (num %10);
			REV(num/10);
		} return rev; 
	}
}
class Testpalidromes 
{
	public static void main(String args[])
	{
		int x=12345;
		int y=palidromes.REV(x);
		System.out.println(y);
		if (x==y) System.out.println("Palidromikoi arithmoi");
		else System.out.println("Mi Palidromikoi arithmoi");
	}
}