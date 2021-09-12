class anadromi1
{
	public static int paragontiko(int n)
	{
		if( n == 0)
		{
			return 1;
		}
		else
		{
			return n * paragontiko(n-1);
		}
	}
}
class TestAnadromi1
{
	public static void main(String args[])
	{
		anadromi1 q = new anadromi1();
		System.out.print("dwse ena thetiko arithmo: ");
		int n = UserInput.getInteger();
		System.out.println("to paragontiko tou " + n + " einai " + q.paragontiko(n));
	}
}
