#include<stdio.h>
int main()
{
	int i, j ,k;
	
	printf("so thu nhat la :");
	scanf("%d" , &i);
	
	printf("\n");
	
	for(j=1; j<=i; j++)
		{ 	printf("\n");
			for(k=0; k<j; k++)
			{	
				printf("*");
			}
		}
}
