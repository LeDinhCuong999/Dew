#include<stdio.h>
int main()
{
	int num1, num2,i;
	
	printf("nhap khoan gia tri :");
	scanf("%d %d", &num1, &num2);
	
	printf("cac so chia het cho 50 trong khoang tren la :");
	
	for(i>=num1; i<=num2; i++)
	{
		if(i>=num1 && i<=num2 && i%50==0)
		printf("\n%d", i);
	}
	return 0;
	
}
