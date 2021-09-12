class anadromi
{
	public double paragontiko(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		if(n < 1)
		{
			return 0;
		}
		return n * paragontiko(n-1);
	}
}
class TestAnadromi
{
	public static void main(String args[])
	{
		anadromi q = new anadromi();
		System.out.println("dwse to paragontiko tou 4: " + q.paragontiko(4));
	}
}