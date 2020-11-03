#include<stdio.h>
int main()
{
	int a, b ,c;
	
	printf("so a la :");
	scanf("%d", a);
	
	printf("so b la :");
	scanf("%d", b);
	
	printf("so c la :");
	scanf("%d", c);
	
	if(a>b && a>c)
		printf("a la so lon nhat");
	else if(b>a && b>c)
		printf("b la so lon nhat");
	else
		printf("c la so lon nhat");
	return 0;
}
