#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int horner1(int n,int p[],int ks)
{
	int q[n];
	int i;
	for(i=1;i<=n;i++)
	{
			q[0]=p[0];
		q[i] = p[i] +q[i-1]*ks;
		printf("q[%d]=%d\n",i-1,q[i-1]);
	}
	printf("to ipilopo tis diairesis einai:  %d\n",q[n]);
	return q[n];
}



int main()
{
	int n;
	printf("dwse timi gia to n\n");
	scanf("%d",&n);
	
	
	int p[n];
//	int q[n];
	int i;
	int ks;
	for(i=0;i<=n;i++)
	{
			printf("dwse timi gia tin %d thesi tou pinaka : ",i);
			scanf("%d",&p[i]);
	}
	
	for(i=0;i<=n;i++)
	{
		printf("p[%d]=%d\n",i,p[i]);
	}
	
	printf("dwse timi sto ks\n");
	scanf("%d",&ks);

    horner1(n,p,ks);
	system("pause");
	
}
