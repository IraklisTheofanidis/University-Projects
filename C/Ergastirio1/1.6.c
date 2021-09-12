#include<stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{

double a;
double b;
double h;
double k;
printf("dwse times sto a,b,h\n");
	scanf("%lf  %lf  %lf",&a,&b,&h);
//	double a=-1.5;
//	double b=1.5;
//	double h=0.1;
	double x=a;
	double y;
	while(x<=b)
	{
		k = fabs(x);
		if(k>1)
		{
		
		 y=1/sqrt((pow(x,2)-1));
			printf("k=%lf,x=%lf,y=%lf\n",k,x,y);
		x=x+h;
		}
		else if(k==1)
		{
			printf("Emfanise 0");
				x=x+h;
		}
		else
		{
			 y=1/(sqrt(1-pow(x,2)));
	    	printf("k=%lf,x=%lf,y=%lf\n",k,x,y);
	    	x=x+h;
		}  
	}
	system("pause");
}
