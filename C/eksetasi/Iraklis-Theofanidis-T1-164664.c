#include <stdio.h>
#include <stdlib.h>
#include <math.h>



//Iraklis Theofanidis T1 164664

// Sto teleuteo erwtima den prolava na to emfanisw opos ithele (otan treksete to programma katw apo to d[0]=1 ,d[1]=-1, d[5]=-3 ,d[6]=4 ta opoia eprepe na emfanisw grafw ena ok(stin ousia to ekana apla den prolava na to emfanisw swsta)) 

int horner2(int ks,int n,int p[])
{
    
	int q[n];
	
	int i;
	for(i=1;i<=n;i++)
	{
			q[0]=p[0];
		q[i] = p[i] +q[i-1]*ks;
	
	}
   return q[n];
}




void diairetes(int n,int p[])
{
     int i;
     int r[n];
     int d[n*2];
     int k=0;
     for(i=1;i<=p[n];i++)
     {
    
        if(p[n]%i==0)
        {
            
              d[k]=i;
              
              printf("d[%d]=%d\n",k,d[k]);
             
             if(horner2(i,n,p)==0)
             {
                    printf("ok\n");
            }
             
             
             
             
              k=k+1;
              
              
              
              
              
              d[k]=-i;
               printf("d[%d]=%d\n",k,d[k]);
               k=k+1;
               
                 if(horner2(-i,n,p)==0)
                {
                    printf("ok\n");
               
                }
                      
        }
        
     }

}

int main()
{
    	int n;
    	printf("dwse to vathmo tou polionumou\n");
	    scanf("%d",&n);
	    
	  	int p[n];
        int i;   
        	
            
           for(i=0;i<=n;i++)
           {
             printf("dwse timi gia tin %d thesi tou pinaka : ",i);
			 scanf("%d",&p[i]);   
        }
        	
        	for(i=0;i<=n;i++)
        	{
	           	printf("p[%d]=%d\n",i,p[i]);
        	}
        	printf("\n\n\n");
        	diairetes(n,p);
   
    system("pause");
}

