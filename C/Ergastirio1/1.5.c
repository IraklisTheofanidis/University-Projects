#include<stdio.h>
#include <math.h>
#define X (x*x)
int main()
{

double a;
double b;
double h;
double k;
printf("dwse times sto a,b,h\n");
	scanf("%lf  %lf  %lf",&a,&b,&h);
//	double a=0;
//	double b=1;
//	double h=0.1;
	double x=a;
	double y;
	while(x<=b)
	{
	
		 y=1/(X+1);
		printf("x=%lf,y=%lf\n",x,y);
		x=x+h;
	}
	system("pause");
}
