class eis
{
	public static void methodos(int[] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			int current = A[i];
			int j=i;
			while(j>0 && A[j-1] > current)
			{
				A[j]= A[j-1];
				j--;
			}
			A[j]= current;
		}
	}
}
class t_eisagwgis
{
	public static void main(String args[])
	{
		int nums[] = {7,19,24,13,8,17,11};
		System.out.println("prin tin taksinomisi ");
		for(int i=0; i < nums.length; i++)
		{
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
		eis.methodos(nums);
		System.out.println("meta tin taksinomisi ");
		for(int i=0 ; i <nums.length; i++)
		{
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
	}
}