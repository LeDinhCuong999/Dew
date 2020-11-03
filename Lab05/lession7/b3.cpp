#include<stdio.h>
int main()
{
	int a, b;
	
	printf("so a la :");
	scanf("%d", &a);
	
	printf("so b la :");
	scanf("%d", &b);
	
	if ( a-b==a || a-b==b )
		printf("Hieu bang gia tri(da nhap vao)");
	else
		printf("Hieu khong bang bat ki gia tri nao da nhap vao");
 } 
