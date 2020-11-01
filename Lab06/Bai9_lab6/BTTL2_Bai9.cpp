#include<stdio.h>
int main()
{
	int num1, num2, i, sum = 0;
	printf("khoang gia tri :");
	scanf("%d %d", &num1, &num2);
	
	printf("\ncac so le thuoc khoang tren la :");
	
	for(i>=num1; i<=num2; i++)
	{
		if(i>=num1, i<=num2, i%2!=0)
		{
			printf("%d\n", i);
			sum = sum + i;
		}
	}
	printf("\nTong cac so le tu %d den %d la : %d", num1, num2, sum);
}
