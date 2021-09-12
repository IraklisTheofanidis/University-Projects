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

interface Stack
{
	// Returns the size of the Stack
	public int size();

	// Returns true if the Stack is empty
	public boolean isEmpty();

	// Returns true if the Stack is full
	public boolean isFull();

	// Returns the top item of the Stack
	public Object peek() throws stackEmptyException;

	// Adds a new item into the Stack
	public void insert(Object item) throws stackFullException;

	// Removes the top item of the Stack
	public Object delete() throws stackEmptyException;
}

class stackFullException extends Exception {

    public stackFullException(String err){
        super(err);
    }
}

class stackEmptyException extends Exception {

    public stackEmptyException(String err){
        super(err);
    }

}


class ArrayStack implements Stack
{
	private String tmima;
	private int capacity;
	private int top;
	private Object[] S;
	ArrayStack(int cap)
	{
		capacity=cap;
		S = new Object[capacity];
		top=0;
	}



	public boolean isEmpty()
	{
		if(top==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int size() {
			        return top;
    }
	public boolean isFull()
	{
		 if (size()==capacity){
				       return true;
				   }
	   return false;
	}

	public Object peek()throws stackEmptyException
	{
		 if (isEmpty())
		 {
		     throw new stackEmptyException("Error: Array is Empty! ");
		 }
		 else
		 {
		 	return S[top-1];
		 }
	}

	public void insert(Object stud)throws stackFullException//push
	{
		if (isFull()) {throw  new stackFullException("Array  is full");}

		else
		{
			S[top] = stud; // me ton tropo tou stamati top++, ar[top] = stud;
			top++;
		}
	}

	public Object delete()throws stackEmptyException
	{
		if (isEmpty())
		{
			throw new stackEmptyException("Error: Array is Empty! ");//System.out.println("Error: Array is Empty! ");
		}

		else
		{
			Object stud = this.peek();
			S[top-1] = null;
			top--;
			return stud;
		}
	}
	public void parousiologio()
	{
		for(int i=0; i<S.length; i++)
		{
			System.out.println(S[i]);
		}
	}
}


class Erg2_1
{
	public static void main(String args[])  throws stackEmptyException,stackFullException
	{
		ArrayStack T2 = new ArrayStack(5);
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
					T2.insert(stud[p]);
					p++;

				}
				else
				{
					System.out.println("To tmima Gemise ");
					System.out.println();
					T2.insert(stud[p]);
				}


			}
			else
			{
				T2.delete();
				p--;
			}

			System.out.println("Gia eisagwgi patise 0, gia diagrafi patise 1 , gia na min mpeis katholou sto loop patise 3");
			choise = UserInput.getInteger();
			System.out.println();
		}
		T2.parousiologio();
	}
}