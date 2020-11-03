#include<stdio.h>
int main()
{
	int a, b;
	printf("a la");
	scanf("%d", &a);
	
	printf("b la");
	scanf("%d", &b);
	
	if( a*b == 1000 ) 
		printf("tich hai so bang 1000");
	else if(a*b>1000)
		printf("tich hai so lon hon 1000");	
}
