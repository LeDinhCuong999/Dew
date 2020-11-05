#include<stdio.h>
void hinhchunhat(int row, int col);
void hinhtamgiac(int row, int col);

int main()	
{
	int row, col;
	printf("nhap so hang va so cot :\n");
	scanf("%d %d", &row, &col);
	
	hinhchunhat(row,col);
	hinhtamgiac(row,col);
}


void hinhchunhat(int row, int col)
	{
		int i,j;
		printf("**hinh chu nhat**\n");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				printf("*");
			}
			printf("\n");
		}
	
	}
	
void hinhtamgiac(int row, int col)
	{
		int i,j;
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
	
