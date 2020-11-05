#include<stdio.h>

int check(int num);

int main()
{
	int num, i, j;
	printf("nhap vao 1 so nguyen :\n");
	scanf("%d", &num);
	
	check(num);
	printf("nhap khong gia tri :\n");
	scanf("%d %d", &i, &j);
	
	for(num=i; num<=j; num++)
	{
		if(num%50==0)
			printf("cac so chia het cho 50 la :%d\n", num);

	}
			
}


int check(int num)
{
	if(num%50==0)
		return 0;
	else
		return 1;
	
	
}

