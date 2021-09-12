#include<stdio.h>

int main() //auti einai i 3 askisi
{	
	double a;
	double b;
	double h;	
	printf("dwse times sto a,b,h\n");
	scanf("%lf %lf %lf", &a,&b,&h);
//	double a=0;
//	double b=1;
//	double h=0.1;
	double x;
	double y;
	for(x=a;x<=b;x+h)
	{
		 y=1/(x*x+1);
		printf("x=%lf , y=%lf\n" ,x,y);
		x=x+h;
	}
	system("pause");
}

