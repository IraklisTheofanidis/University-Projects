/*  ?s??s? 3.9	         
  ?p?????sµ?? ???? t?? ????? ???????µ?? µe t? µ???d? Newton-Raphson
  ???s? function Horner() 
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double Horner2(int n, double ksi, double p[], double q[]);
main()
{
    printf("Ergasthriakh Askhsh 3.9.\n");
	printf("Ypologismos Olwn twn Rizwn Polywnymou me th Methodo Newton-Raphson \n");
	printf("Klhsh function Horner()\n\n");
    int i, n;
    double a, b, h, x, x0, x0h; 
    //
    // ??µa 1 - ???ßasµa ?a?µ?? ???????µ??
    //
    printf("Dose to Bathmo tou Polywnymou : ");
    scanf ("%d",&n);     
    double ksi, p[n+1], q[n+1], r[n+1];
    //
    // ??µa 2 - G?µ?sµa ???a?a p
    //
    for ( i = 0; i<=n; i++ )
    {
    printf("Dose timh gia to p[%d ] : ",i);
    scanf ("%lf",&p[i]);
    }
    //
    // ??µa 3 - ?µf???s? ???a?a p
    //
    for ( i = 0; i<=n; i++ )
    {
    printf("p[%d] = %lf\n",i, p[i]);
    }
   	//
	// ??µa 4 - ??aß????µe ta ???a t?? d?ast?µat?? a, b ?a? t? ß?µa h
	//
	printf("Dose times gia ta a, b, h : ");
	scanf ("%lf  %lf %lf",&a, &b, &h);
	//
	// ??µa 5 - ?pa?????? - Newton-Raphson µe a?????? t?µ?? a, a+h,...,b-h
	//
	for ( x0  = a; x0 < b; x0 = x0 + h ) {
       
     if (Horner2(n, x0, p, q)*Horner2(n, x0+h, p, q) < 0 )
      {  
	  x  = x0; // a????? t?µ? st? x = a
      printf("\nx = %.16lf f(x) = %.16lf\n", x, Horner2(n, x, p, q));
      //
      //  ??µa 6 -  Newton-Raphson ??a ???e x0
      //
      while ( fabs(Horner2(n, x, p, q)) > 1.0e-15  )
      {
        x = x - Horner2(n, x, p, q)/Horner2(n-1, x, q, r);
        printf("x = %.16lf f(x) = %.16lf\n", x, Horner2(n, x, p, q));
      }
      printf("\n");
    }
}
    system("Pause");
}

double Horner2(int n, double ksi, double p[], double q[])
{
    int i; 
    q[0] = p[0];
    for ( i = 1; i<=n; i=i+1 )
     q[i] = p[i]+q[i-1]*ksi;
    return q[n];
}    
