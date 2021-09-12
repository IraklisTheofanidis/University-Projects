#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
	double x;
	printf("dwse timi gia to x \n");
	scanf("%lf",&x);
	int i=1;
	double oros=1;
	double myexp=1;
	while(oros>pow(10,-15))
	{
		oros=oros*x/i;
		myexp = myexp +oros;
		printf("%lf,%lf,%lf\n",x,myexp,exp(x));
		i=i+1;
	}
	system("pause");
}
