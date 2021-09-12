#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define f(x,num) ( pow(x,2) - num )

int main()
{
	double num;
	double x;
	double oldx;
	printf("dwse timi sto num: ");
	scanf("%lf",&num);
	x = num/2; 
    oldx = num; 
    printf("num = %lf x = %.16lf sqrt(num) = %.16lf\n",num, x, sqrt(num));
    while(fabs(x-oldx)>pow(10,-15))
    {
    	oldx=x;
    	 x = x - f(x,num)/(2*x);
    	 printf("num = %lf x = %.16lf sqrt(num) = %.16lf\n",num, x, sqrt(num));
	}
	system("pause");
}
