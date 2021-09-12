#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main()
{
	double x;
	int n;
	printf("dwse times gia to x kai to n\n");
	scanf("%lf %d",&x,&n);
	int i;
	double oros=1;
	double myexp=1;
	for(i=1;i<n;i++)
	{
		oros = oros*x/i;
		myexp = myexp + oros;
		printf("%lf,%lf,%lf\n",x,myexp,exp(x));
	}	
	system("pause");
}
