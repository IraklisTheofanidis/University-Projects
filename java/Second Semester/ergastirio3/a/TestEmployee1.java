class Employee1
{
	private String onoma;
	private String epitheto;
	private int arithmos;
	private double misthos;
	public Employee1(){}
	public Employee1(String on , String ep , int ar , double m)
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
class emp1
{
	static int studentNo=0;
	public static int a(Employee1[] f, String key)
	{
		for(int i = 0; i < f.length; i++)
			if(f[i].getepitheto().equals(key))
				return i;
			return -1;
	}
	public static void methodos(Employee1[] A)
	{
			int position;
			Employee1 key;
			for(int i=0 ; i < emp1.studentNo; i++)
			{
				key = A[i];
				position = i;
			}
			while(position>0 && A[position-1].getarithmos() > key.getarithmos())
			{
				A[position]= A[position-1];
				position--;
			}
			A[position]= key;
	}
	public static int b(Employee1[] f,int key1)
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
class TestEmployee1
{
	public static void main(String args[])
	{
		Employee1[] f = new Employee1[2];
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
			f[i] = new Employee1(on,ep,ar,misthos);
		}
		System.out.println("dwse 1:gia anazitisi me eponimo H dwse 2:gia anazitisi me kodiko");
		int kwd = UserInput.getInteger();
		switch(kwd)
		{
			case 1:
				System.out.println("dwse eponimo gia anazitisi  ");
				String epitheto = UserInput.getString();
				int k = emp1.a(f,epitheto);
				if(k == -1)
					System.out.println(" den iparxei tetoio epitheto ");
				else
					System.out.println(f[k]);
			break;
			case 2:
				System.out.println(" prwta kanw taksinomisi ");
				emp1.methodos(f);
				System.out.println("twra dwse kodiko gia na ksekinisi i diadiki anazitisi ");
				int arithmos = UserInput.getInteger();
				int k1 = emp1.b(f,arithmos);
				if(k1 == -1)
					System.out.println(" den iparxei tetoios arithmos mitroou ");
				else
					System.out.println(f[k1]);
			break;
		}
	}
}