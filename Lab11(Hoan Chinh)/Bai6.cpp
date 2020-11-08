#include<stdio.h>

float dientich(float chieudai, float chieurong)
{
	float dientich;
	dientich=chieudai*chieurong;
	return dientich;
}

float chuvi(float chieudai, float chieurong )
{
	float chuvi;
	chuvi=(chieudai+chieurong)*2;
	return chuvi;
}

int main()
{
	float chieudai, chieurong;
	printf("nhap chieu dai va chieu rong : \n");
	scanf("%d %d", &chieudai, &chieurong);
	
	printf("dien tich la : %d \n", dientich(chieudai, chieurong));
	
	chuvi(chieudai, chieurong);
	printf("chu vi la : %d \n", chuvi(chieudai, chieurong));
	
}


