#include <stdio.h>
#include <stdlib.h>
#include <math.h>


double parag(int i)
{
	double iparag=1;
	int j;
	for(j=1;j<=i;j++)
	{
		iparag=iparag*j;
	}
	return iparag;                                                    
}

int main()
{
	double x;
	double n;
	printf("dwse times gia to x kai to n\n");
	scanf("%lf %lf",&x,&n);
	double myexp=1;
	int i;
	double oros;

	for(i=1;i<n;i++)
	{
		
		
		oros = pow(x,i) /parag(i);
		myexp= myexp + oros;
		
		printf("%lf,%lf,%lf\n",x,myexp,exp(x));
	}
	system("pause");
}
