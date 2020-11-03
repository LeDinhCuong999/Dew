#include<stdio.h>
int main()
{
	int a, b; 
	
	printf("a la");
	scanf("%d", &a);
	
	printf("b la");
	scanf("%d", &b);
	
	if( a%b == 0) 
		printf("a chia het cho b");
	else 
		printf("a khong chia het cho b");	
} 
