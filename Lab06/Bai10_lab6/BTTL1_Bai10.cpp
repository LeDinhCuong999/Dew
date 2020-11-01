#include<stdio.h>
int main()
{ 
	char ten[30];
	int tuoi,i;
	
	printf("nhap ten :\n");
	gets(ten);
	
	printf("nhap tuoi :\n");
	scanf("%d", &tuoi);
	
	for(i=1; i<=tuoi; i++)
		{	
			printf("%s : %d\n", ten ,i);
		}
	return 0;
}
