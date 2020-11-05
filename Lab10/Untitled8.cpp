#include<stdio.h>
#include<math.h>

void GetArea(float a, float b, float c);

int main()
{
	float a, b, c;
	
	printf("nhap lan luot 3 canh cua tam giac :\n");
	scanf("%f %f %f", &a, &b, &c);
	
	if(a+b>c)
	{
		printf("3 canh tam giac hop le \n");
		GetArea(a, b, c);
	}
	else
		printf("3 canh tam giac khong hop le \n");
}

void GetArea(float a, float b, float c)
{
	float p, dientich;
	
	p=(a+b+c)/2;
	printf("nua chu vi la :%f \n", p);
	
	dientich=sqrt(p*(p-a)*(p-b)*(p-c));
	printf("dien tich tam giac theo cong thuc Heron la :%f \n", dientich);
	
}
