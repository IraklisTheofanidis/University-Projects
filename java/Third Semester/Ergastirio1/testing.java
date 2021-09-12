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

interface ilab
{
	public boolean isEmpty();
	public boolean isFull();
	public int size();
	public Object peek() throws stackEmptyException;
	public void insert(Object item) throws stackFullException ;
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



class lab implements ilab
{
	private String tmima;
	private int capacity;
	private int top;
	private Object[] S;
	lab(int cap,String t)
	{
		tmima=t;
		capacity=cap;
		S = new Object[capacity];
		top=0;
	}

	// αληθεύει εάν η στοίβα είναι κενή
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


	public boolean isFull() {
		 if (size()==capacity){
		       return true;
		   }
	   return false;
    }

	// εισάγει ένα νέο στοιχείο στην κορυφή της στοίβας
	public void insert(Object stud) throws stackFullException//push
	{
		if (isFull()) {throw  new stackFullException("Array  is full");}

		else
		{
			S[top] = stud;
			top++;
		}

	}

	// εξάγει ένα νέο στοιχείο από την κορυφή της στοίβας
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

	public static int anazitisiMeAM(Student[] AM ,int key)
	{
		for(int i = 0; i < AM.length; i++)
		{
			if( AM[i].getArithmos_mitroou()==key)
			{
				return i;

			}
		}
		return -1;
	}


	// επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της στοίβας
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

	public void parousiologio()
	{
		for(int i=0; i<S.length; i++)
		{
			System.out.println(S[i]);
		}
	}
}

class testing
{
	public static void main(String args[]) throws stackEmptyException,stackFullException
	{

		lab T2 = new lab(5,"T2");

		int choise;//epilogi
		int p;//gia tin anazitisi se periptwsi pou einai 0 na min ginete anazitisi
		Student[] stud= new Student[100];

		System.out.println("Gia eisagwgi patise 0, gia diagrafi patise 1 , gia anazitisi patise 2 , gia na min mpeis katholou sto loop patise 3");
		choise = UserInput.getInteger();

		p=0;//douleuei  gia ta stoixeia tou pinaka(p.x. stud[p] kai san plithos
		int epi=0; //epitixontes
		int apo=0;//apotixontes
		double athr=0;//athroisma vathmwn
		double mo=0;//mesos oros
		while(choise!= 3 )
		{

			if(choise==0 )//eisagwgi
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
					if(va>=5)
					{
						epi=epi+1;
					}
					else
					{
						apo=apo+1;
					}

					System.out.println("Auta einai ta stoixeia tou teleuteou mathiti: ");
					System.out.println(T2.peek());
					System.out.println();
					p++;
					athr = athr + va;
				}
				else
				{
					System.out.println("To tmima Gemise ");
					T2.insert(stud[p]);
					System.out.println();
					System.out.println("Auta einai ta stoixeia tou teleuteou mathiti: ");
					System.out.println(T2.peek());
					System.out.println();
				}
			}

			else if(choise==1)//diagrafi
			{

				T2.delete();
				System.out.println("Auta einai ta stoixeia tou teleuteou mathiti meta tin diagrafi: ");
				System.out.println(T2.peek());
				System.out.println();
				p--;
			}

			else //anazitisi
			{
				System.out.println("Poion arithmo mitroou anazitate? ");
				System.out.println();
				System.out.println("Ta stoixeia autou tou AM tairiazoun me: ");
				int anazitisi= UserInput.getInteger();
				int k = lab.anazitisiMeAM(stud,anazitisi);
				if(k == -1 || p==0)//den tha ginei pote auto epeidi exw dwsei automata to "164664". Tha eprepe na xrisimopioisw UserInput kai na valw ta AM monos wste na iparxei i dinatotita lathous
				{
					System.out.println("dn iparxei auto to AM");
				}
				else// Ara tha ginei to else
				{
					System.out.println( stud[k] );
				}
				System.out.println();
			}


				System.out.println("Gia eisagwgi patise 0, gia diagrafi patise 1 , gia anazitisi patise 2 , gia na vgeis apo to loop patise 3");
				choise = UserInput.getInteger();

		}

		T2.parousiologio();
		System.out.println();
		System.out.println("O arithmos twn epitixwntwn einai: " +epi);
		System.out.println("o arithmos twn apotixwntwn einai: " +apo);
		 //exw provlima epeidi metraei kai ta null an den gemisw ton pinaka
		mo=athr/p;
		System.out.println("o mesos oros olwn ton mathitwn einai: " + mo);

	}
}
