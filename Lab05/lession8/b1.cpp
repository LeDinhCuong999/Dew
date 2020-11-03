#include<stdio.h>
int main()
{
	int x, y;
	printf("nhap vao so x :");
	scanf("%d", &x);
	
	printf("nhap vao so y :");
	scanf("%d", &y);
	
	if(x<2000 || x>3000)
	printf("x thoa man dieu kien da cho");
	
    if(y>100 && y<500)
	printf("\n y thoa man dieu kien da cho");
	
	else
	printf("\n khong thoa man dieu kien ");
	
}

