#include<stdio.h>
int main()
{
	int i;
	char ten[30];
	
	for(i=0; i<5; i++)
	{
		printf("hoc sinh so %d la :\n", i);
		scanf("%s", &ten[i]);
	}
	for(i=0; i<5; i++)
	{
		printf("\nSTT %d la %s", i, ten[i]);
 	}
	printf("\n");
}
