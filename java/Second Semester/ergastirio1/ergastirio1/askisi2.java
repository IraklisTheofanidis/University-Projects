class ask2
{
	static int rev = 0;
	public static void r(int value)
	{
		if(value>0)
		{
			rev = (rev*10) + (value%10);
			r(value/10);
		}
		else
		{
			System.out.println(rev);
                        rev = 0;
		}
	}
}
class askisi2
{
	public static void main(String args[])
	{
	int a = 45678;
	ask2.r(a);
	}
}