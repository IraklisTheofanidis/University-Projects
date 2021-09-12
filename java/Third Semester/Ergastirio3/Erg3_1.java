class Student
{
	private int arithmos_mitroou;
	private String onoma;
	private String epitheto;
	private double ilikia;
	private char filo;
	private int arithmos_apousiwn;
	private double vathmos;
	Student(int a,String o, String e , double i , char f, int ar, double v)
	{
		arithmos_mitroou = a;
		onoma = o;
		epitheto =e;
		ilikia=i;
		filo=f;
		arithmos_apousiwn=ar;
		vathmos=v;
	}


	public void setArithmos_mitroou(int a)
	{
		arithmos_mitroou = a;
	}
	public int getArithmos_mitroou()
	{
		return arithmos_mitroou;
	}

	public void setOnoma(String o)
	{
		onoma = o;
	}
	public String getOnoma()
	{
		return onoma;
	}

	public void setEpitheto(String e)
	{
		epitheto =e;
	}
	public String getEpitheto()
	{
		return epitheto;
	}

	public void setIlikia(double i)
	{
		ilikia=i;
	}
	public double getIlikia()
	{
		return ilikia;
	}

	public void setFilo(char f)
	{
		filo=f;
	}
	public char getFilo()
	{
		return filo;
	}

	public void setArithmos_apousiwn(int ar)
	{
		arithmos_apousiwn=ar;
	}
	public int getArithmos_apousiwn()
	{
		return arithmos_apousiwn;
	}

	public void setVathmos(double v)
	{
		vathmos = v;
	}
	public double getVathmos()
	{
		return vathmos;
	}

	public String toString()
	{
		return  "\nArithmos_mitroou " + arithmos_mitroou +
				"\nOnoma: " + onoma +
				"\nEpitheto: " + epitheto +
				"\nIlikia: " + ilikia +
				"\nFilo: " + filo +
				"\nArithmos_apousiwn: " + arithmos_apousiwn +
				"\nVathmos: " + vathmos;
	}
}


interface Queue
{
	public int size();

	public boolean isEmpty();


	 // Returns the first element of the queue
	public Object front();

	 // Adds an element at the end of the queue
	public void enqueue(Object item) ;

	// Removes and returns the first element of the queue
	public Object dequeue();
}

class QueueFullException extends RuntimeException
{
	public QueueFullException(String err)
	{
		super(err);
	}
}

class QueueEmptyException extends RuntimeException
{
	public QueueEmptyException(String err)
	{
		super(err);
	}
}

class ArrayQueue implements Queue
{
	private int capacity;
	private Object[] Q;
	private int first=0;
	private int last=0;
	public ArrayQueue(int cap)
	{
		capacity=cap;
		Q=new Object[capacity];
	}
	public int size()
	{
		return (last-first);
	}
	public boolean isEmpty()
	{
		return (first==last);
	}
	public Object front() throws QueueEmptyException
	{
		if(isEmpty())
		{
			throw new QueueEmptyException("Queue is empty");
		}
		else
		{
			return Q[first];
		}
	}
	public void enqueue(Object item) throws QueueFullException
	{
		if (last == capacity) /* Εικονική Υπερχείλιση?? */
		{
			throw new QueueFullException("Queue overflow");
		}
		else
		{
			Q[last++]=  item;  //(Student)
		}
	}
	public Object dequeue() throws QueueEmptyException
	{
		Object item;
		if (isEmpty())
		{
			throw new QueueEmptyException("Queue is empty");
		}
		else
		{
			item=Q[first];
			Q[first++]=null;
			return item;
		}
	}
	public void parousiologio()
	{
		for(int i=0; i<Q.length; i++)
		{
			System.out.println(Q[i]);
		}
	}
}

class Erg3_1
{
	public static void main(String args[])
	{

		ArrayQueue T2 = new ArrayQueue(5);
		int choise;//epilogi
		int p=0;
		Student[] stud = new Student[100];
		System.out.println("Gia eisagwgi patise 0, gia diagrafi patise 1 , gia na min mpeis katholou sto loop patise 3");
		choise = UserInput.getInteger();

		while(choise !=3 )
		{
			if(choise==0)
			{
				System.out.println("Dwse AM: ");
				int am = UserInput.getInteger();
				System.out.println("Dwse to onoma: ");
				String on = UserInput.getString();
				System.out.println("Dwse to epitheto: ");
				String ep = UserInput.getString();
				System.out.println("Dwse ilikia: ");
				double il = UserInput.getDouble();
				System.out.println("Dwse filo(A gia Antra kai G gia ginaika: ");
				char fi = UserInput.getChar();
				System.out.println("Dwse apousies: ");
				int ap = UserInput.getInteger();
				System.out.println("Dwse vathmo: ");
				double va = UserInput.getDouble();
				stud[p]= new Student(am,on,ep,il,fi,ap,va);
				if(p!=5)
				{

					T2.enqueue(stud[p]);
					p++;
					System.out.println(T2.front());
				}
				else
				{
					System.out.println("To tmima Gemise ");
					System.out.println();
					T2.enqueue(stud[p]);
				}

			}
			else
			{
				T2.dequeue();
				p--;
			}
			System.out.println("Gia eisagwgi patise 0, gia diagrafi patise 1 , gia na min mpeis katholou sto loop patise 3");
			choise = UserInput.getInteger();
			System.out.println();

		}
		T2.parousiologio();
	}
}