/*  �s??s? 3.8	         
  ?p?????s�?? ???? t?? ????? ???????�?? �e t? �???d? Newton-Raphson
  S????t?s? f(x) = x^3 - 4x
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define f(x) ( pow(x,3) - 4*x )
#define fp(x) ( 3*pow(x,2) - 4 )

main()
{
    printf("Ergasthriakh Askhsh 3.8\n");
	printf("Ypologismos Olwn twn Rizwn Synarthshs sto [a,b] me th Methodo Newton-Raphson \n");
	printf("Synarthsh f(x) = x^3 - 4x\n\n");
    int i, n;
    double a, b, h, x, x0, x0h, oldx; 
 
   	//
	// ??�a 1 - ??a�????�e ta ???a t?? d?ast?�at?? a, b ?a? t? �?�a h
	//
	printf("Dose times gia ta a, b, h : ");
	scanf ("%lf  %lf %lf",&a, &b, &h);
	//
	// ??�a 2 - ?pa?????? - Newton-Raphson �e a?????? t?�?? a, a+h,...,b-h
	//
	for ( x0  = a; x0 < b; x0 = x0 + h ) {
      x0h = x0 + h;   
      if (f(x0)*f(x0h) < 0 ) // ?p???e? ???a st? [x0, x0+h]
      {  
	  x  = x0; // a????? t?�? st? x 
	  oldx = x0+h; // a????? t?�? st? oldx
      printf("\nx = %.16lf f(x) = %.16lf\n", x, f(x));
      //
      //  Newton-Raphson ??a ???e x0
      //
      while ( fabs(x - oldx) > 1.0e-15  )
      {
        oldx = x;    
        x = x - f(x)/fp(x);
        printf("x = %.16lf f(x) = %.16lf\n", x, f(x));
      }
      printf("\n");
    }
}
    system("Pause");
}

