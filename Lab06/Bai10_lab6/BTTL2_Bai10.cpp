#include<stdio.h>
int main()
{
	int i,j,k;
	
	printf("nhap 1 so :");
	scanf("%d", &i);
	
	for(j=1; j<=i; j++)
	{
		printf("\n");
		for(k=0; k<j; k++)
		{
			printf("%d", k+1);
	  	}
	}
}
