#include<stdio.h>
int main()
{
	int row, col, i, j;
	
	printf("**hinh chu nhat**");
	printf("nhap so hang va so cot :\n");
	scanf("%d %d", &row, &col);
	
	for(i=0; i<row; i++)
	{
		for(j=0; j<col; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	
	
	printf("**hinh tam giac**\n");
	for(i=0; i<row; i++)
	{
		for(j=0; j<i+1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	
}
