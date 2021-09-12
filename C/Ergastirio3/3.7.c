#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define f(x,num) ( pow(x,2) - num )
//double mysqrt(double num); 
int main()
{
	double num;

	printf("dwse timi sto num: ");
	scanf("%lf",&num);
   double mysqrt(double num);
   printf("num = %lf mysqrt(num) = %.16lf sqrt(num) = %.16lf\n",num, mysqrt(num), sqrt(num));
   
	system("pause");
}

double mysqrt(double num)
{
	double x;
	double oldx;
	x = num/2; 
    oldx = num;
    	printf("num = %lf x = %.16lf sqrt(num) = %.16lf\n",num, x, sqrt(num));
     while(fabs(x-oldx)>pow(10,-15))
    {
    	oldx=x;
    	x = x - f(x,num)/(2*x);
    	printf("num = %lf x = %.16lf sqrt(num) = %.16lf\n",num, x, sqrt(num));
	}
	return x;
}
