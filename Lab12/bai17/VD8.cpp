#include<stdio.h>
int main()
{
	int num[5], ctr, sum=0;
	int sum_arr(int num_arr[]);
	
	int clrscr();
	
	for(ctr=0; ctr<5; ctr++)
	{
		printf("nhap so %d:\n", ctr+1);
		scanf("%d", &num[ctr]);
	}
	
	sum=sum_arr(num);
	printf("\ntong cua mang la %d", sum);
	
	int getch();
}

int sum_arr(int num_arr[])
{
	int i, total;
	for(i = 0; total = 0; i < 5, i++)
		total+=num_arr[i];
	return total;
}
