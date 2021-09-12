class ep
{
	public static void methodos(int[] A)
	{
		int pos;
		int temp;
		for(int i = 0; i < A.length-1; i++)
		{
			pos =i;
			for(int k = i+1; k < A.length; k++)
			{
				if(A[k] < A[pos])
				{
					pos =k;
				}
			}
			temp = A[pos];
			A[pos] = A[i];
			A[i] = temp;

		}
	}
}
class t_epilogis
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
		ep.methodos(nums);
		System.out.println("meta tin taksinomisi ");
		for(int i=0 ; i < nums.length; i++)
		{
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
	}
}
