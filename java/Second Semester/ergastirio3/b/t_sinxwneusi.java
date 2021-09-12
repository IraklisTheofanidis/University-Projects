import java.util.Arrays;
class sinxwneusi
{
	public static void mergeSort(int[] A)
	{
		if (A.length > 1)
		{
			int[] firstHalf = new int[A.length/2];
			System.arraycopy(A, 0, firstHalf, 0, A.length/2);
			mergeSort(firstHalf);
			int secondHalfLength = A.length - A.length/2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(A, A.length/2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			merge(firstHalf, secondHalf, A);
 		}
 	}
 	public static void merge(int[] list1, int[] list2, int[] temp)
 	{
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		while (current1 < list1.length && current2 < list2.length)
		{
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}
}
class t_sinxwneusi
{
	public static void main(String[] args)
	{
		int[] nums = {5,2,9,3,8,4,0,1,6,7};
		System.out.println("Ataxinomitos pinakas");
		System.out.println(Arrays.toString(nums));
		System.out.println();
		sinxwneusi.mergeSort(nums);
		System.out.println("Taxinomimenos pinakas me Merge Sort ");
		System.out.println(Arrays.toString(nums));
		System.out.println();
	}
}