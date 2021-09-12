class t_fisalidas
{
	public static void main(String args[])
	{
		int nums[] = {7 ,9 , 24 ,13 ,8 ,17 ,11};
		System.out.println("prin tin taksinomisi");
		for(int i = 0; i <nums.length ; i++)
		{
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
		fis.fisalida(nums);
		System.out.println("meta tin taksinomisi");
		for(int i = 0; i<nums.length; i++)
		{
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
	}
}
class fis
{	
	public static int fisalida(int A[])
	{
		int i;
		int j;	
		int temp;
		boolean flag;
		for(i=1 ; i<A.length; i++)
		{
			flag = true;
			for(j=0; j<A.length-1; j++)
			{
				if(A[j]>A[j+1])
					{
						temp = A[j];
						A[j] = A[j+1];
						A[j+1] = temp;
						flag = false;
					}
			}
			if (flag) 
			{
				return;
			}
		}       
	}
}

