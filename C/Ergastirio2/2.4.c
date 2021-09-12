#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double myexp(double x)
{
	int i=1;
	double oros=1;
	double sum=1;

		while(oros>pow(10,-15))
	{
		oros=oros*x/i;
		sum = sum +oros;

		i=i+1;
	}
	return sum;
}


int main()
{
	double x;
	printf("dwse timi gia to x \n");
	scanf("%lf",&x);
	
	
	printf("%lf,%lf,%lf\n",x,myexp(x),exp(x));
	system("pause");
}
