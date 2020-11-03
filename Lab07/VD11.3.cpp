#include<stdio.h>
int main()
{
	char alpha[26];
	int i, k, j;
	
	for(i=65, j=0; i<91; i++, j++)
	{
		alpha[j]=i;
		alpha[k]=alpha[j]+32;
		printf("the character now assigned is %c - %c\n", alpha[j], alpha[j]+32);
	}
	getchar();
}
