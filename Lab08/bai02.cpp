#include<stdio.h>
int main()
{
	int i;
	char name[20], ans;
	
	printf("what's your crush name? ");
	scanf("%s", &name);
	
	for(i<1; i<=100; i++)
	printf("\n fall in love %d\n", i);
	
	do 
		{
			printf("\n do you love me:)) ?");
			printf("\n yes or no :");
			scanf("%s", &ans);
		}
	while(ans == 'yes');
	printf("\n i love you");
	
	return 0;
}
