class seir
{
	public static int search(int a[],int key)
	{
		for(int i = 0; i < a.length; i++)
		{
			if (a[i]== key)
			{
				return i;
			}
		}
		return -1;
	}
}
class seiriaki
{
	public static void main(String args[])
	{
		int arithmoi[] = {4 , 3, 6, 1,0};
		System.out.println("to simeio pou vriskete o arithmos 6 einai " + seir.search(arithmoi ,6));
	}
}