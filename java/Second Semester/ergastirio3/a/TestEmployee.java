class Employee
{
	private String onoma;
	private String epitheto;
	private int arithmos;
	private double misthos;
	public Employee(){}
	public Employee(String on , String ep , int ar , double m)
	{
		onoma = on;
		epitheto = ep;
		arithmos = ar;
		misthos = m;
	}
	public String getepitheto()
	{
		return epitheto;
	}
	public String getonoma()
	{
		return onoma;
	}
	public int getarithmos()
	{
		return arithmos;
	}
	public double getmisthos()
	{
		return misthos;
	}
	public String toString()
	{
		return String.format("%-10s %-10s %-10s %-10s", onoma,epitheto,arithmos,misthos);
	}
}
class emp
{
	public static int a(Employee[] f, String key)
	{
		for(int i = 0; i < f.length; i++)
			if(f[i].getepitheto().equals(key))
				return i;
			return -1;
	}
	public static void methodos(Employee[] A)
		{
			int pos;
			Employee temp;
			for(int i = 0; i < A.length-1; i++)
			{
				pos =i;
				for(int k = i+1; k < A.length; k++)
				{
					if(A[k].getarithmos() < A[pos].getarithmos())
					{
						pos =k;
					}
				}
				temp = A[pos];
				A[pos] = A[i];
				A[i] = temp;

			}
		}
	public static int b(Employee[] f,int key1)
	{
		int left = 0;
		int right = f.length-1;
		int mid;
		int found = -1;
		while(found ==-1 && left <= right)
		{
			mid = (left + right)/2;
			if(key1 < f[mid].getarithmos())
				right = mid-1;
			else if(key1 > f[mid].getarithmos())
				left = mid+1;
			else
				found = mid;
		}
		return found;
	}
}
class TestEmployee
{
	public static void main(String args[])
	{
		Employee[] f = new Employee[2];
		for(int i =0; i < f.length; i++)
		{
			System.out.println("dwse onoma");
			String on = UserInput.getString();
			System.out.println("dwse epitheto");
			String ep = UserInput.getString();
			System.out.println("dwse arithmo mitroou");
			short ar = UserInput.getShort();
			System.out.println("dwse etos");
			double misthos = UserInput.getDouble();
			f[i] = new Employee(on,ep,ar,misthos);
		}
		System.out.println("dwse 1:gia anazitisi me eponimo H dwse 2:gia anazitisi me kodiko");
		int kwd = UserInput.getInteger();
		switch(kwd)
		{
			case 1:
				System.out.println("dwse eponimo gia anazitisi  ");
				String epitheto = UserInput.getString();
				int k = emp.a(f,epitheto);
				if(k == -1)
					System.out.println(" den iparxei tetoio epitheto ");
				else
					System.out.println(f[k]);
			break;
			case 2:
				System.out.println(" prwta kanw taksinomisi ");
				emp.methodos(f);
				System.out.println("twra dwse kodiko gia na ksekinisi i diadiki anazitisi ");
				int arithmos = UserInput.getInteger();
				int k1 = emp.b(f,arithmos);
				if(k1 == -1)
					System.out.println(" den iparxei tetoios arithmos mitroou ");
				else
					System.out.println(f[k1]);
			break;
		}
	}
}