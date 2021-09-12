class anadromiki
{
	public static int search(int[] numbers , int key)
	{
		int left = 0;
		int right = numbers.length-1;
		return Anad_diad_anaz(numbers , key , left , right);
	}
	public static int Anad_diad_anaz(int numbers[] , int key , int left , int right)
	{
		int mid = (left + right)/2;
		if(left>right)
			return -1;
		else
			if(key == numbers[mid])
				return mid;
			else
				if(key>numbers[mid])
					return Anad_diad_anaz (numbers , key , mid+1 ,right);
				else
					return Anad_diad_anaz (numbers , key , left , mid-1);
	}
}
class anadromiki_diadiki_anazitisi
{
	public static void main(String args[])
	{
		int[] numbers = {1,3,5,7,9,11,15,22,33,44};
		int key = 7;
		int pos = anadromiki.search(numbers , key);
			if(pos != -1)
				System.out.println(" the index of " + key + " is " + pos);
			else
				System.out.println(key + " is not part of the array");
	}
}
