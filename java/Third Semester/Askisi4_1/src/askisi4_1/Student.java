/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi4_1;

/**
 *
 * @author Lalik
 */
public class Student 
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
