class diadiki
{
	public static int search(int[] numbers , int key)
	{
		int left = 0;
		int right = numbers.length-1;
		return DiadAnaz(numbers , key , left , right);
	}
	private static int DiadAnaz(int[] numbers , int key , int left , int right)
	{
		int mid;
		int pos =-1;
		while(pos==-1 && left <= right)
		{
			mid = (left+right)/2;
			if(key < numbers[mid])
				left = mid +1;
			else
				pos = mid;
		}
		return pos;
	}
}
class diadiki_anazitisi
{
	public static void main(String args[])
	{
		int[] numbers = {1,3,5,7,9,11,15,22,33,44};
		int key = 11;
		int pos = diadiki.search(numbers , key);
		if(pos != -1)
			System.out.println(" the index of " + key + " is " + pos);
		else
			System.out.println(key + " is not part of the array");
	}
}