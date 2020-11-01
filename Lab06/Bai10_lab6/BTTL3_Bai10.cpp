#include<stdio.h>
int main()
{ 
	int a,i;
	
	printf("nhap bang cuu chuong ban muon :");
	scanf("%d", &a);
	
	for(i=1; i<=10; i++)
	{
		printf("\n%d * %d = %d", a, i, a*i);
	}
	return 0;
}

