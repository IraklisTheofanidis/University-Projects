class ask1
{
	public static int power(int vasi , int dinami)
	{
		int p;
		if(dinami == 0)
		{
			p = 1;
		}
		else
		{
			p = vasi * power(vasi , dinami-1);
		}
		return p;
	}
}
class askisi1
{
	public static void main(String args[])
	{
		ask1 q = new ask1();
		System.out.println("o arithmos einai " + q.power(2,5));
	}
}